package dangerousserpulo;

import arc.*;
import arc.util.*;
import dangerousserpulo.type.DSerpuloSector;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import dangerousserpulo.content.*;


public class DangerousSerpulo extends Mod{

    public DangerousSerpulo(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
        });
    }

    @Override
    public void loadContent(){
        DSerpuloPlanet.load();
//        DSerpuloSector.load();
        DSerpuloSectorPresets.load();
        DSerpuloTechTree.load();

        Log.info("Loading some example content.");
    }

}
