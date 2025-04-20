package dangerousserpulo.content;

import dangerousserpulo.DangerousSerpulo;
import mindustry.type.*;
import dangerousserpulo.type.*;

import static mindustry.content.Planets.serpulo;

public class DSerpuloSectorPresets{
    public static SectorPreset
            dsgroundZero,
            dscraters, dsbiomassFacility, dstaintedWoods, dsfrozenForest, dsruinousShores, dsfacility32m, dswindsweptIslands, dsstainedMountains, dstarFields,
            dsfrontier, dsfungalPass, dsinfestedCanyons, dsatolls, dsmycelialBastion, dsextractionOutpost, dssaltFlats, dstestingGrounds, dsovergrowth, //polarAerodrome,
            dsimpact0078, dsdesolateRift, dsnuclearComplex, dsplanetaryTerminal,
            dscoastline, dsnavalFortress, dsweatheredChannels, dsseaPort,

    dsgeothermalStronghold, dscruxscape;

    public static void load(){

        if(DSerpuloPlanet.dserpulo == null) return;
        dstaintedWoods = new SectorPreset("taintedWoods", DSerpuloPlanet.dserpulo, 221){{
            captureWave = 33;
            difficulty = 5;
        }};

        dsinfestedCanyons = new SectorPreset("infestedCanyons", DSerpuloPlanet.dserpulo, 210){{
            difficulty = 4;
        }};

        dstestingGrounds = new SectorPreset("testingGrounds", DSerpuloPlanet.dserpulo, 3){{
            difficulty = 7;
            captureWave = 33;
        }};

        dsweatheredChannels = new SectorPreset("weatheredChannels", DSerpuloPlanet.dserpulo, 39){{
            captureWave = 40;
            difficulty = 9;
        }};

        dsfrontier = new SectorPreset("frontier", DSerpuloPlanet.dserpulo, 50){{
            difficulty = 4;
        }};

        dsatolls = new SectorPreset("atolls", DSerpuloPlanet.dserpulo, 1){{
            difficulty = 7;
        }};

        dsmycelialBastion = new SectorPreset("mycelialBastion", DSerpuloPlanet.dserpulo, 260){{
            difficulty = 8;
        }};

        dsgeothermalStronghold = new SectorPreset("geothermalStronghold", DSerpuloPlanet.dserpulo, 264){{
            difficulty = 10;
        }};

        dscruxscape = new SectorPreset("cruxscape", DSerpuloPlanet.dserpulo, 54){{
            difficulty = 10;
        }};

        dsseaPort = new SectorPreset("seaPort", DSerpuloPlanet.dserpulo, 47){{
            difficulty = 4;
        }};

        dsfacility32m = new SectorPreset("facility32m", DSerpuloPlanet.dserpulo, 64){{
            captureWave = 25;
            difficulty = 4;
        }};
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
