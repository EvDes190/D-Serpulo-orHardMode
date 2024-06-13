package dangerousserpulo;

import arc.*;
import arc.math.Mathf;
import arc.util.*;
import mindustry.Vars;
import mindustry.core.GameState;
import mindustry.game.EventType;
import mindustry.gen.Call;
import mindustry.mod.*;
import dangerousserpulo.content.*;
import mindustry.type.Planet;
import mindustry.type.Sector;

import static arc.Core.app;
import static mindustry.Vars.*;

public class DangerousSerpulo extends Mod{

    String tag = "DS";

    void DSLogInfo(String text) {
        app.post(() -> Log.info("[" + tag +"] " + text));
    }

    public DangerousSerpulo() {
        DSLogInfo("main method has been declared");
    }

    private void dSRunTurn() {
        DSLogInfo("dSRunTurn method has been declared");

        for (Planet planet : content.planets()) {
            if (planet.name.equals("DangerousSerpulo")) {
                for (Sector sector : planet.sectors) {
                    if (sector.hasBase() && !sector.isAttacked() && sector.info.hasSpawns && sector.preset == null) {
                        int waveMax = Math.max(sector.info.winWave, sector.isBeingPlayed() ?
                                state.wave : sector.info.wave + sector.info.wavesPassed) + Mathf.random(2, 4) * 5;

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

                    sector.saveInfo();
                }
            }
        }
    }


    @Override
    public void init() {
        DSLogInfo("init method has been declared");
        Log.info("test");
        Events.on(EventType.SectorLoseEvent.class, e -> {
            if(e.sector.planet == DSerpuloPlanet.dserpulo)
                e.sector.save.delete();

            DSLogInfo("sector" + e.sector.info.name + "has been cleared");
        });
        Events.on(EventType.SectorInvasionEvent.class, e -> {
            if(e.sector.planet == DSerpuloPlanet.dserpulo)
                e.sector.save.delete();

            DSLogInfo("sector" + e.sector.info.name + "has been cleared");
        });

        //TODO fix that
        Events.on(EventType.LoseEvent.class, e -> {
            GameState s = Vars.state;
            if(s.isCampaign() && s.getPlanet() == DSerpuloPlanet.dserpulo)
                s.getSector().save.delete();

            DSLogInfo("sector" + s.getSector().info.name + "has been cleared");
        });



        Events.run(EventType.Trigger.update, () -> {
            for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
                if (element.getMethodName().equals("runTurn"))
                    DangerousSerpulo.this.dSRunTurn();

                DSLogInfo("element processing");
            }

            DSLogInfo("update trigger has been counted");
        });
    }

    @Override
    public void loadContent(){

        DSerpuloPlanet.load();
        DSerpuloSectorPresets.load();
        DSerpuloTechTree.load();

        Log.info("Loading some example content.");
        Log.info("test");
    }

}
