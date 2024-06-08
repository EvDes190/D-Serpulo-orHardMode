package dangerousserpulo.type;

import arc.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.Saves.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.g3d.PlanetGrid.*;
import mindustry.type.Planet;
import mindustry.type.Sector;
import mindustry.ui.*;
import mindustry.world.modules.*;

import static mindustry.Vars.*;

public class DSerpuloSector extends Sector {
    public DSerpuloSector(Planet planet, Ptile tile) {
        super(planet, tile);
    }

    @Override
    public boolean hasEnemyBase() {
        return true;
    }


}