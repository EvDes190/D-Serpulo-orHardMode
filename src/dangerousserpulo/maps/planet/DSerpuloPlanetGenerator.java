package dangerousserpulo.maps.planet;

import mindustry.maps.planet.SerpuloPlanetGenerator;
import mindustry.type.*;

public class DSerpuloPlanetGenerator extends SerpuloPlanetGenerator{
    @Override
    public void generateSector(Sector sector){
        sector.generateEnemyBase = true;
    }
}