package dangerousserpulo.maps.planet;

import arc.math.Rand;
import mindustry.game.Waves;
import mindustry.maps.generators.BaseGenerator;
import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.type.*;
import mindustry.world.Tiles;

import static mindustry.Vars.spawner;
import static mindustry.Vars.state;

public class DSerpuloPlanetGenerator extends SerpuloPlanetGenerator{

    BaseGenerator basegen = new BaseGenerator();

    @Override
    public void generateSector(Sector sector){
        sector.generateEnemyBase = true;
    }

//    @Override
//    public void postGenerate(Tiles tiles){
//        basegen.postGenerate();
//
//        //spawn air enemies
//        if(spawner.countGroundSpawns() == 0){
//            state.rules.spawns = Waves.generate(sector.threat, new Rand(sector.id), state.rules.attackMode, true, false);
//        }
//    }
}