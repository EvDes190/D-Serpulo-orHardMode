package dangerousserpulo.content;

import arc.struct.*;
import mindustry.game.Objectives.*;

import static mindustry.content.Blocks.*;
import static dangerousserpulo.content.DSerpuloSectorPresets.dscraters;
import static dangerousserpulo.content.DSerpuloSectorPresets.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.UnitTypes.*;
import mindustry.content.*;

public class DSerpuloTechTree{

    public static void load(){
        DSerpuloPlanet.dserpulo.techTree = nodeRoot("dangerous serpulo", coreShard, () -> {

            node(conveyor, () -> {

                node(junction, () -> {
                    node(router, () -> {
                        node(launchPad, Seq.with(new SectorComplete(dsextractionOutpost)), () -> {
                            //no longer necessary to beat the campaign
                            //node(interplanetaryAccelerator, Seq.with(new SectorComplete(planetaryTerminal)), () -> {

                            //});
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
                        node(blastMixer, () -> {

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

                            node(plastaniumCompressor, Seq.with(new SectorComplete(dswindsweptIslands)), () -> {
                                node(phaseWeaver, Seq.with(new SectorComplete(dstarFields)), () -> {

                                });
                            });
                        });

                        node(kiln, Seq.with(new SectorComplete(dscraters)), () -> {
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
                                }); //193
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

                    node(crawler, () -> {
                        node(atrax, () -> {
                            node(spiroct, () -> {
                                node(arkyid, () -> {
                                    node(toxopid, () -> {

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

                    node(navalFactory, Seq.with(new SectorComplete(dsruinousShores)), () -> {
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

                node(additiveReconstructor, Seq.with(new SectorComplete(dsbiomassFacility)), () -> {
                    node(multiplicativeReconstructor, () -> {
                        node(exponentialReconstructor, Seq.with(new SectorComplete(dsovergrowth)), () -> {
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
                                            new Research(spectre),
                                            new Research(launchPad),
                                            new Research(massDriver),
                                            new Research(impactReactor),
                                            new Research(additiveReconstructor),
                                            new Research(exponentialReconstructor)
                                            ), () -> {

                                            });
                                        });
                                    });
                                });

                                node(dsextractionOutpost, Seq.with(
                                new SectorComplete(dsstainedMountains),
                                new SectorComplete(dswindsweptIslands),
                                new Research(groundFactory),
                                new Research(nova),
                                new Research(airFactory),
                                new Research(mono)
                                ), () -> {

                                });

                                node(dssaltFlats, Seq.with(
                                new SectorComplete(dswindsweptIslands),
                                new Research(groundFactory),
                                new Research(additiveReconstructor),
                                new Research(airFactory),
                                new Research(door)
                                ), () -> {
                                    node(dscoastline, Seq.with(
                                    new SectorComplete(dswindsweptIslands),
                                    new SectorComplete(dssaltFlats),
                                    new Research(navalFactory),
                                    new Research(payloadConveyor)
                                    ), () -> {
                                        node(dsnavalFortress, Seq.with(
                                        new SectorComplete(dscoastline),
                                        new SectorComplete(dsextractionOutpost),
                                        new Research(oxynoe),
                                        new Research(minke),
                                        new Research(cyclone),
                                        new Research(ripple)
                                        ), () -> {

                                        });
                                    });
                                });
                            });
                        });

                        node(dsovergrowth, Seq.with(
                        new SectorComplete(dscraters),
                        new SectorComplete(dsfungalPass),
                        new Research(cultivator),
                        new Research(sporePress),
                        new Research(additiveReconstructor),
                        new Research(UnitTypes.mace),
                        new Research(UnitTypes.flare)
                        ), () -> {

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
                            node(dsfungalPass, Seq.with(
                            new SectorComplete(dsstainedMountains),
                            new Research(groundFactory),
                            new Research(door)
                            ), () -> {
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
