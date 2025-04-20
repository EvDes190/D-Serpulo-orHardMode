package dangerousserpulo.content;

import arc.struct.*;
import mindustry.game.Objectives.*;

import static mindustry.content.Blocks.*;
import static dangerousserpulo.content.DSerpuloSectorPresets.dscraters;
import static dangerousserpulo.content.DSerpuloSectorPresets.*;
import static mindustry.content.SectorPresets.*;
import static mindustry.content.SectorPresets.facility32m;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;
import mindustry.content.*;
import mindustry.type.ItemStack;

public class DSerpuloTechTree{
    public static void load(){
        Planets.serpulo.techTree = nodeRoot("dangerous serpulo", coreShard, () -> {

            node(conveyor, () -> {

                node(junction, () -> {
                    node(router, () -> {
                        node(advancedLaunchPad, Seq.with(new SectorComplete(dsextractionOutpost)), () -> {
//                            node(landingPad, () -> {
//                                node(interplanetaryAccelerator, Seq.with(new SectorComplete(planetaryTerminal)), () -> {
//
//                                });
//                            });
                        });

                        node(distributor);
                        node(sorter, () -> {
                            node(invertedSorter);
                            node(overflowGate, () -> {
                                node(underflowGate);
                            });
                        });
                        node(container, Seq.with(new SectorComplete(dsbiomassFacility)), () -> {
                            node(unloader);
                            node(vault, Seq.with(new SectorComplete(dsstainedMountains)), () -> {

                            });
                        });

                        node(itemBridge, () -> {
                            node(titaniumConveyor, Seq.with(new SectorComplete(dscraters)), () -> {
                                node(phaseConveyor, () -> {
                                    node(massDriver, () -> {

                                    });
                                });

                                node(payloadConveyor, () -> {
                                    node(payloadRouter, () -> {

                                    });
                                });

                                node(armoredConveyor, () -> {
                                    node(plastaniumConveyor, () -> {

                                    });
                                });
                            });
                        });
                    });
                });
            });

            node(coreFoundation, () -> {
                node(coreNucleus, () -> {

                });
            });

            node(mechanicalDrill, () -> {

                node(mechanicalPump, () -> {
                    node(conduit, () -> {
                        node(liquidJunction, () -> {
                            node(liquidRouter, () -> {
                                node(liquidContainer, () -> {
                                    node(liquidTank);
                                });

                                node(bridgeConduit);

                                node(pulseConduit, Seq.with(new SectorComplete(dswindsweptIslands)), () -> {
                                    node(phaseConduit, () -> {

                                    });

                                    node(platedConduit, () -> {

                                    });

                                    node(rotaryPump, () -> {
                                        node(impulsePump, () -> {

                                        });
                                    });
                                });
                            });
                        });
                    });
                });

                node(graphitePress, () -> {
                    node(pneumaticDrill, Seq.with(new SectorComplete(dsfrozenForest)), () -> {
                        node(cultivator, Seq.with(new SectorComplete(dsbiomassFacility)), () -> {

                        });

                        node(laserDrill, () -> {
                            node(blastDrill, Seq.with(new SectorComplete(dsnuclearComplex)), () -> {

                            });

                            node(waterExtractor, Seq.with(new SectorComplete(dssaltFlats)), () -> {
                                node(oilExtractor, () -> {

                                });
                            });
                        });
                    });

                    node(pyratiteMixer, () -> {
                        node(blastMixer, Seq.with(new SectorComplete(dsfacility32m)), () -> {

                        });
                    });

                    node(siliconSmelter, () -> {

                        node(sporePress, () -> {
                            node(coalCentrifuge, () -> {
                                node(multiPress, () -> {
                                    node(siliconCrucible, () -> {

                                    });
                                });
                            });

                            node(plastaniumCompressor, Seq.with(new SectorComplete(dswindsweptIslands), new OnSector(dstarFields)), () -> {
                                node(phaseWeaver, Seq.with(new SectorComplete(dstarFields)), () -> {

                                });
                            });
                        });

                        node(kiln, Seq.with(new OnSector(dscraters)), () -> {
                            node(pulverizer, () -> {
                                node(incinerator, () -> {
                                    node(melter, () -> {
                                        node(surgeSmelter, () -> {

                                        });

                                        node(separator, () -> {
                                            node(disassembler, () -> {

                                            });
                                        });

                                        node(cryofluidMixer, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        //logic disabled until further notice
                        node(microProcessor, () -> {
                            node(switchBlock, () -> {
                                node(message, () -> {
                                    node(logicDisplay, () -> {
                                        node(largeLogicDisplay, () -> {

                                        });
                                    });

                                    node(memoryCell, () -> {
                                        node(memoryBank, () -> {

                                        });
                                    });
                                });

                                node(logicProcessor, () -> {
                                    node(hyperProcessor, () -> {

                                    });
                                });
                            });
                        });

                        node(illuminator, () -> {

                        });
                    });
                });


                node(combustionGenerator, Seq.with(new Research(Items.coal)), () -> {
                    node(powerNode, () -> {
                        node(powerNodeLarge, () -> {
                            node(diode, () -> {
                                node(surgeTower, () -> {

                                });
                            });
                        });

                        node(battery, () -> {
                            node(batteryLarge, () -> {

                            });
                        });

                        node(mender, () -> {
                            node(mendProjector, () -> {
                                node(forceProjector, Seq.with(new SectorComplete(dsimpact0078)), () -> {
                                    node(overdriveProjector, Seq.with(new SectorComplete(dsimpact0078)), () -> {
                                        node(overdriveDome, Seq.with(new SectorComplete(dsimpact0078)), () -> {

                                        });
                                    });
                                });

                                node(repairPoint, () -> {
                                    node(repairTurret, () -> {

                                    });
                                });
                            });
                        });

                        node(steamGenerator, Seq.with(new SectorComplete(dscraters)), () -> {
                            node(thermalGenerator, () -> {
                                node(differentialGenerator, () -> {
                                    node(thoriumReactor, Seq.with(new Research(Liquids.cryofluid)), () -> {
                                        node(impactReactor, () -> {

                                        });

                                        node(rtgGenerator, () -> {

                                        });
                                    });
                                });
                            });
                        });

                        node(solarPanel, () -> {
                            node(largeSolarPanel, () -> {

                            });
                        });
                    });
                });
            });

            node(duo, () -> {
                node(copperWall, () -> {
                    node(copperWallLarge, () -> {
                        node(scrapWall, () -> {
                            node(scrapWallLarge, () -> {
                                node(scrapWallHuge, () -> {
                                    node(scrapWallGigantic);
                                });
                            });
                        });

                        node(titaniumWall, () -> {
                            node(titaniumWallLarge);

                            node(door, () -> {
                                node(doorLarge);
                            });

                            node(plastaniumWall, () -> {
                                node(plastaniumWallLarge, () -> {

                                });
                            });
                            node(thoriumWall, () -> {
                                node(thoriumWallLarge);
                                node(surgeWall, () -> {
                                    node(surgeWallLarge);
                                    node(phaseWall, () -> {
                                        node(phaseWallLarge);
                                    });
                                });
                            });
                        });
                    });
                });

                node(scatter, () -> {
                    node(hail, Seq.with(new SectorComplete(dscraters)), () -> {
                        node(salvo, () -> {
                            node(swarmer, () -> {
                                node(cyclone, () -> {
                                    node(spectre, Seq.with(new SectorComplete(dsnuclearComplex)), () -> {

                                    });
                                });
                            });

                            node(ripple, () -> {
                                node(fuse, () -> {

                                });
                            });
                        });
                    });
                });

                node(scorch, () -> {
                    node(arc, () -> {
                        node(wave, () -> {
                            node(parallax, () -> {
                                node(segment, () -> {

                                });
                            });

                            node(tsunami, () -> {

                            });
                        });

                        node(lancer, () -> {
                            node(meltdown, () -> {
                                node(foreshadow, () -> {

                                });
                            });

                            node(shockMine, () -> {

                            });
                        });
                    });
                });
            });

            node(groundFactory, () -> {

                node(dagger, () -> {
                    node(mace, () -> {
                        node(fortress, () -> {
                            node(scepter, () -> {
                                node(reign, () -> {

                                });
                            });
                        });
                    });

                    node(nova, () -> {
                        node(pulsar, () -> {
                            node(quasar, () -> {
                                node(vela, () -> {
                                    node(corvus, () -> {

                                    });
                                });
                            });
                        });
                    });

                    //override research requirements to have graphite, not coal
                    node(crawler, ItemStack.with(Items.silicon, 400, Items.graphite, 400), () -> {
                        node(atrax, () -> {
                            node(spiroct, () -> {
                                node(arkyid, () -> {
                                    node(toxopid, Seq.with(new SectorComplete(dsmycelialBastion)), () -> {

                                    });
                                });
                            });
                        });
                    });
                });

                node(airFactory, () -> {
                    node(flare, () -> {
                        node(horizon, () -> {
                            node(zenith, () -> {
                                node(antumbra, () -> {
                                    node(eclipse, () -> {

                                    });
                                });
                            });
                        });

                        node(mono, () -> {
                            node(poly, () -> {
                                node(mega, () -> {
                                    node(quad, () -> {
                                        node(oct, () -> {

                                        });
                                    });
                                });
                            });
                        });
                    });

                    node(navalFactory, Seq.with(new OnSector(dswindsweptIslands)), () -> {
                        node(risso, () -> {
                            node(minke, () -> {
                                node(bryde, () -> {
                                    node(sei, () -> {
                                        node(omura, () -> {

                                        });
                                    });
                                });
                            });

                            node(retusa, Seq.with(new SectorComplete(dswindsweptIslands)), () -> {
                                node(oxynoe, Seq.with(new SectorComplete(dscoastline)), () -> {
                                    node(cyerce, () -> {
                                        node(aegires, () -> {
                                            node(navanax, Seq.with(new SectorComplete(dsnavalFortress)), () -> {

                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });
                });

                node(additiveReconstructor, Seq.with(new SectorComplete(dscraters)), () -> {
                    node(multiplicativeReconstructor, Seq.with(new SectorComplete(dsfrontier)), () -> {
                        node(exponentialReconstructor, () -> {
                            node(tetrativeReconstructor, () -> {

                            });
                        });
                    });
                });
            });

            node(dsgroundZero, () -> {
                node(dsfrozenForest, Seq.with(
                        new SectorComplete(dsgroundZero),
                        new Research(junction),
                        new Research(router)
                ), () -> {
                    node(dscraters, Seq.with(
                            new SectorComplete(dsfrozenForest),
                            new Research(mender),
                            new Research(combustionGenerator)
                    ), () -> {
                        node(dsfungalPass, Seq.with(
                                new SectorComplete(dscraters),
                                new Research(groundFactory),
                                new Research(dagger)
                        ), () -> {
                            node(dsfrontier, Seq.with(
                                    new SectorComplete(dsbiomassFacility),
                                    new SectorComplete(dsfungalPass),
                                    new Research(groundFactory),
                                    new Research(airFactory),
                                    new Research(additiveReconstructor),
                                    new Research(mace),
                                    new Research(mono)
                            ), () -> {
                                node(dsovergrowth, Seq.with(
                                        new SectorComplete(dsfrontier),
                                        new SectorComplete(dswindsweptIslands),
                                        new Research(multiplicativeReconstructor),
                                        new Research(fortress),
                                        new Research(ripple),
                                        new Research(salvo),
                                        new Research(cultivator),
                                        new Research(sporePress)
                                ), () -> {
                                    node(dsmycelialBastion, Seq.with(
                                            new Research(atrax),
                                            new Research(spiroct),
                                            new Research(arkyid),
                                            new Research(multiplicativeReconstructor),
                                            new Research(exponentialReconstructor)
                                    ), () -> {

                                    });

                                    node(dsatolls, Seq.with(
                                            new SectorComplete(dswindsweptIslands),
                                            new Research(multiplicativeReconstructor),
                                            new Research(mega)
                                    ), () -> {

                                    });
                                });
                            });

                            node(dstaintedWoods, Seq.with(
                                    new SectorComplete(dsbiomassFacility),
                                    new SectorComplete(dsfungalPass),
                                    new Research(Items.sporePod),
                                    new Research(wave)
                            ), () -> {

                            });
                        });

                        node(dsruinousShores, Seq.with(
                                new SectorComplete(dscraters),
                                new Research(graphitePress),
                                new Research(kiln),
                                new Research(mechanicalPump)
                        ), () -> {
                            node(dswindsweptIslands, Seq.with(
                                    new SectorComplete(dsruinousShores),
                                    new Research(pneumaticDrill),
                                    new Research(hail),
                                    new Research(siliconSmelter),
                                    new Research(steamGenerator)
                            ), () -> {
                                node(dsseaPort, Seq.with(
                                        new SectorComplete(dsbiomassFacility),
                                        new SectorComplete(dsfrontier),
                                        new SectorComplete(dsfungalPass),
                                        new Research(navalFactory),
                                        new Research(risso),
                                        new Research(retusa),
                                        new Research(steamGenerator),
                                        new Research(cultivator),
                                        new Research(coalCentrifuge)
                                ), () -> {

                                });

                                node(dstarFields, Seq.with(
                                        new SectorComplete(dswindsweptIslands),
                                        new Research(coalCentrifuge),
                                        new Research(conduit),
                                        new Research(wave)
                                ), () -> {
                                    node(dsimpact0078, Seq.with(
                                            new SectorComplete(dstarFields),
                                            new Research(Items.thorium),
                                            new Research(lancer),
                                            new Research(salvo),
                                            new Research(coreFoundation)
                                    ), () -> {
                                        node(dsdesolateRift, Seq.with(
                                                new SectorComplete(dsimpact0078),
                                                new Research(thermalGenerator),
                                                new Research(thoriumReactor),
                                                new Research(coreNucleus)
                                        ), () -> {
                                            node(dsplanetaryTerminal, Seq.with(
                                                    new SectorComplete(dsdesolateRift),
                                                    new SectorComplete(dsnuclearComplex),
                                                    new SectorComplete(dsovergrowth),
                                                    new SectorComplete(dsextractionOutpost),
                                                    new SectorComplete(dssaltFlats),
                                                    new Research(risso),
                                                    new Research(minke),
                                                    new Research(bryde),
                                                    new Research(sei),
                                                    new Research(omura),
                                                    new Research(spectre),
                                                    new Research(advancedLaunchPad),
                                                    new Research(massDriver),
                                                    new Research(impactReactor),
                                                    new Research(additiveReconstructor),
                                                    new Research(exponentialReconstructor),
                                                    new Research(tetrativeReconstructor)
                                            ), () -> {
                                                node(dsgeothermalStronghold, Seq.with(
                                                        new Research(omura),
                                                        new Research(navanax),
                                                        new Research(eclipse),
                                                        new Research(oct),
                                                        new Research(reign),
                                                        new Research(corvus),
                                                        new Research(toxopid)
                                                ), () -> {

                                                });

                                                node(dscruxscape, Seq.with(
                                                        new Research(omura),
                                                        new Research(navanax),
                                                        new Research(eclipse),
                                                        new Research(oct),
                                                        new Research(reign),
                                                        new Research(corvus),
                                                        new Research(toxopid)
                                                ), () -> {

                                                });
                                            });
                                        });
                                    });
                                });

                                node(dsfacility32m, Seq.with(
                                        new Research(pneumaticDrill),
                                        new SectorComplete(dsstainedMountains)
                                ), () -> {
                                    node(dsextractionOutpost, Seq.with(
                                            new SectorComplete(dswindsweptIslands),
                                            new SectorComplete(dsfungalPass),
                                            new SectorComplete(dsfacility32m),
                                            new Research(groundFactory),
                                            new Research(nova),
                                            new Research(airFactory),
                                            new Research(mono)
                                    ), () -> {
                                        //TODO: removed for now
                                        /*node(polarAerodrome, Seq.with(
                                        new SectorComplete(fungalPass),
                                        new SectorComplete(desolateRift),
                                        new SectorComplete(overgrowth),
                                        new Research(multiplicativeReconstructor),
                                        new Research(zenith),
                                        new Research(swarmer),
                                        new Research(cyclone),
                                        new Research(blastDrill),
                                        new Research(blastDrill),
                                        new Research(massDriver)
                                        ), () -> {

                                        });
                                        */
                                    });
                                });

                                node(dssaltFlats, Seq.with(
                                        new SectorComplete(dswindsweptIslands),
                                        new SectorComplete(dsfungalPass),
                                        new SectorComplete(dsfrontier),
                                        new Research(groundFactory),
                                        new Research(additiveReconstructor),
                                        new Research(airFactory),
                                        new Research(door)
                                ), () -> {
                                    node(dstestingGrounds, Seq.with(
                                            new Research(cryofluidMixer),
                                            new Research(Liquids.cryofluid),
                                            new Research(waterExtractor),
                                            new Research(ripple)
                                    ), () -> {

                                    });

                                    node(dscoastline, Seq.with(
                                            new SectorComplete(dswindsweptIslands),
                                            new SectorComplete(dssaltFlats),
                                            new Research(navalFactory),
                                            new Research(payloadConveyor)
                                    ), () -> {

                                        node(dsnavalFortress, Seq.with(
                                                new SectorComplete(dscoastline),
                                                new SectorComplete(dsextractionOutpost),
                                                new Research(coreNucleus),
                                                new Research(massDriver),
                                                new Research(oxynoe),
                                                new Research(minke),
                                                new Research(bryde),
                                                new Research(cyclone),
                                                new Research(ripple)
                                        ), () -> {
                                            node(dsweatheredChannels, Seq.with(
                                                    new SectorComplete(dsimpact0078),
                                                    new Research(bryde),
                                                    new Research(surgeSmelter),
                                                    new Research(overdriveProjector)
                                            ), () -> {

                                            });
                                        });
                                    });
                                });
                            });
                        });
                    });

                    node(dsbiomassFacility, Seq.with(
                            new SectorComplete(dsfrozenForest),
                            new Research(powerNode),
                            new Research(steamGenerator),
                            new Research(scatter),
                            new Research(graphitePress)
                    ), () -> {

                        node(dsstainedMountains, Seq.with(
                                new SectorComplete(dsbiomassFacility),
                                new Research(pneumaticDrill),
                                new Research(siliconSmelter)
                        ), () -> {

                            //TODO bad order
                            node(dsinfestedCanyons, Seq.with(
                                    new SectorComplete(dsfungalPass),
                                    new SectorComplete(dsfrontier),
                                    new Research(navalFactory),
                                    new Research(risso),
                                    new Research(minke),
                                    new Research(additiveReconstructor)
                            ), () -> {
                                //TODO difficulty jump!
                                node(dsnuclearComplex, Seq.with(
                                        new SectorComplete(dsfungalPass),
                                        new Research(thermalGenerator),
                                        new Research(laserDrill),
                                        new Research(Items.plastanium),
                                        new Research(swarmer)
                                ), () -> {

                                });
                            });


                        });
                    });
                });
            });

            nodeProduce(Items.copper, () -> {
                nodeProduce(Liquids.water, () -> {

                });

                nodeProduce(Items.lead, () -> {
                    nodeProduce(Items.titanium, () -> {
                        nodeProduce(Liquids.cryofluid, () -> {

                        });

                        nodeProduce(Items.thorium, () -> {
                            nodeProduce(Items.surgeAlloy, () -> {

                            });

                            nodeProduce(Items.phaseFabric, () -> {

                            });
                        });
                    });

                    nodeProduce(Items.metaglass, () -> {

                    });
                });

                nodeProduce(Items.sand, () -> {
                    nodeProduce(Items.scrap, () -> {
                        nodeProduce(Liquids.slag, () -> {

                        });
                    });

                    nodeProduce(Items.coal, () -> {
                        nodeProduce(Items.graphite, () -> {
                            nodeProduce(Items.silicon, () -> {

                            });
                        });

                        nodeProduce(Items.pyratite, () -> {
                            nodeProduce(Items.blastCompound, () -> {

                            });
                        });

                        nodeProduce(Items.sporePod, () -> {

                        });

                        nodeProduce(Liquids.oil, () -> {
                            nodeProduce(Items.plastanium, () -> {

                            });
                        });
                    });
                });
            });
        });
    }
}
