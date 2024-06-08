package dangerousserpulo.content;

import mindustry.type.*;
import dangerousserpulo.type.*;

public class DSerpuloSectorPresets{
    public static SectorPreset
            dsgroundZero,
            dscraters, dsbiomassFacility, dsfrozenForest, dsruinousShores, dswindsweptIslands, dsstainedMountains, dstarFields,
            dsfungalPass, dsextractionOutpost, dssaltFlats, dsovergrowth,
            dsimpact0078, dsdesolateRift, dsnuclearComplex, dsplanetaryTerminal,
            dscoastline, dsnavalFortress;

    public static void load(){

        if(DSerpuloPlanet.dserpulo == null) return;
        dsgroundZero = new DSSectorPreset("groundZero", DSerpuloPlanet.dserpulo, 15){{
            alwaysUnlocked = true;
            addStartingItems = true;
            captureWave = 10;
            difficulty = 1;
            overrideLaunchDefaults = true;
            noLighting = true;
            startWaveTimeMultiplier = 3f;
        }};

        dssaltFlats = new DSSectorPreset("saltFlats", DSerpuloPlanet.dserpulo, 101){{
            difficulty = 5;
        }};

        dsfrozenForest = new DSSectorPreset("frozenForest", DSerpuloPlanet.dserpulo, 86){{
            captureWave = 15;
            difficulty = 2;
        }};

        dsbiomassFacility = new DSSectorPreset("biomassFacility", DSerpuloPlanet.dserpulo, 81){{
            captureWave = 20;
            difficulty = 3;
        }};

        dscraters = new DSSectorPreset("craters", DSerpuloPlanet.dserpulo, 18){{
            captureWave = 20;
            difficulty = 2;
        }};

        dsruinousShores = new DSSectorPreset("ruinousShores", DSerpuloPlanet.dserpulo, 213){{
            captureWave = 30;
            difficulty = 3;
        }};

        dswindsweptIslands = new DSSectorPreset("windsweptIslands", DSerpuloPlanet.dserpulo, 246){{
            captureWave = 30;
            difficulty = 4;
        }};

        dsstainedMountains = new DSSectorPreset("stainedMountains", DSerpuloPlanet.dserpulo, 20){{
            captureWave = 30;
            difficulty = 3;
        }};

        dsextractionOutpost = new DSSectorPreset("extractionOutpost", DSerpuloPlanet.dserpulo, 165){{
            difficulty = 5;
        }};

        dscoastline = new DSSectorPreset("coastline", DSerpuloPlanet.dserpulo, 108){{
            captureWave = 30;
            difficulty = 5;
        }};

        dsnavalFortress = new DSSectorPreset("navalFortress", DSerpuloPlanet.dserpulo, 216){{
            difficulty = 9;
        }};

        dsfungalPass = new DSSectorPreset("fungalPass", DSerpuloPlanet.dserpulo, 21){{
            difficulty = 4;
        }};

        dsovergrowth = new DSSectorPreset("overgrowth", DSerpuloPlanet.dserpulo, 134){{
            difficulty = 5;
        }};

        dstarFields = new DSSectorPreset("tarFields", DSerpuloPlanet.dserpulo, 23){{
            captureWave = 40;
            difficulty = 5;
        }};

        dsimpact0078 = new DSSectorPreset("impact0078", DSerpuloPlanet.dserpulo, 227){{
            captureWave = 45;
            difficulty = 7;
        }};

        dsdesolateRift = new DSSectorPreset("desolateRift", DSerpuloPlanet.dserpulo, 123){{
            captureWave = 18;
            difficulty = 8;
        }};

        dsnuclearComplex = new DSSectorPreset("nuclearComplex", DSerpuloPlanet.dserpulo, 130){{
            captureWave = 50;
            difficulty = 7;
        }};

        dsplanetaryTerminal = new DSSectorPreset("planetaryTerminal", DSerpuloPlanet.dserpulo, 93){{
            difficulty = 10;
            isLastSector = true;
        }};
    }
}
