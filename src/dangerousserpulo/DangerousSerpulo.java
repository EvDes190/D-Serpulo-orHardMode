package dangerousserpulo;

import arc.*;
import arc.math.Mathf;
import arc.util.*;
import mindustry.core.GameState;
import mindustry.game.EventType;
import mindustry.gen.Call;
import mindustry.mod.*;
import dangerousserpulo.content.*;
import mindustry.type.Sector;

import static mindustry.Vars.*;

public class DangerousSerpulo extends Mod{

    public final String tag = "DS";
    public String name;
    private int steps =0;

    public DangerousSerpulo() {}

    void DSLogInfo(String text) {
        Log.info("[" + tag +"] " + text);
    }

    private void dSRunTurn() {
        steps++;

        if(state.isCampaign() && state.getPlanet() == DSerpuloPlanet.dserpulo) {
            for (Sector sector : state.getPlanet().sectors) {

                //Instantly invasion on a captured sectors
                if (sector.hasBase()
                    && !sector.isAttacked()
                    && sector.info.hasSpawns
                    && sector.preset == null
                ) {
                    sectorInvasion(sector);
                }

                //Rare invasions or lost
                if(steps > 60 && sector.preset != null && sector.hasBase() && !sector.isBeingPlayed() && Math.random() > 0.9999999) {
                    steps = 0;

                    sector.info.attack = true;
                    Events.fire(new EventType.SectorInvasionEvent(sector));

                    Events.fire(new EventType.SectorLoseEvent(sector));

                    sector.info.items.clear();
                    sector.info.damage = 1f;
                    sector.info.hasCore = false;
                    sector.info.production.clear();

                } else if(steps > 60 && sector.hasBase() && sector.isCaptured() && Math.random() > 0.9999997) {
                    sectorInvasion(sector);
                }

                sector.saveInfo();
            }
        }
    }


    @Override
    public void init() {
        //Cleared sector after lose
        Events.on(EventType.SectorLoseEvent.class, e -> {
            if(e.sector.planet == DSerpuloPlanet.dserpulo && e.sector.preset == null) {
                name = e.sector.info.name;
                e.sector.save.delete();
                DSLogInfo("sector " + name + " has been cleared by SectorLoseEvent");
            }
        });
        Events.on(EventType.GameOverEvent.class, e -> {
            GameState s = state;
            name = state.getSector().name();
            if(s.isCampaign() && s.getPlanet() == DSerpuloPlanet.dserpulo && s.getSector().preset == null) {
                state.getSector().save.delete();
                state.rules.sector.save = null;
                state.rules.sector.info.attack = true;
                state.rules.sector.info.items.clear();
                state.rules.sector.info.damage = 1f;
                state.rules.sector.info.hasCore = false;
                state.rules.sector.info.production.clear();

                DSLogInfo("sector " + name + " has been cleared by GameOverEvent");
            }
        });

        Events.run(EventType.Trigger.update, this::dSRunTurn);

    }


    @Override
    public void loadContent(){
        DSerpuloPlanet.load();
        DSerpuloSectorPresets.load();
        DSerpuloTechTree.load();
    }

    public void sectorInvasion(Sector sector) {
        int waveMax = Math.max(sector.info.winWave, sector.isBeingPlayed() ?
                state.wave : sector.info.wave + sector.info.wavesPassed) + Mathf.random(2, 4) * 5;

        DSLogInfo("" + waveMax);
        if (sector.isBeingPlayed()) {
            state.rules.winWave = waveMax;
            state.rules.waves = true;
            state.rules.attackMode = false;

            if (net.server())
                Call.setRules(state.rules);
        } else {
            sector.info.winWave = waveMax;
            sector.info.waves = true;
            sector.info.attack = false;
            sector.saveInfo();
        }

        Events.fire(new EventType.SectorInvasionEvent(sector));
    }

}
