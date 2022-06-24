package com.therealm18studios.beyondplanetscore.world.modifier;

import com.therealm18studios.beyondplanetscore.configurations.supported.ModsSupportCommon;
import com.therealm18studios.beyondplanetscore.world.oregen.OreGeneration;
import futurepack.data.FPWorldData;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.mrscauthd.beyond_earth.registries.BiomesRegistry;

public class PlanetBiomeModifier {
    @SubscribeEvent
    public static void biomesLoading(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();

        if (ModsSupportCommon.BEYONDEARTH.get()) {
            if (biome.equals(BiomesRegistry.MARS_DESERT) || biome.equals(BiomesRegistry.MARS_ROCKY_PLAINS) || biome.equals(BiomesRegistry.MARS_ICE_SPIKES)) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_COPPER_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_LEAD_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_TIN_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_URANIUM_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_ZINC_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_COBALT_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_COAL_ORE.getHolder().get());
            }

            if (biome.equals(BiomesRegistry.VENUS_DESERT) || biome.equals(BiomesRegistry.INFERNAL_VENUS_BARRENS)) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_COPPER_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_LEAD_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_TIN_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_URANIUM_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_ZINC_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_COBALT_ORE.getHolder().get());
            }

            if (biome.equals(BiomesRegistry.MOON_DESERT)) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_COPPER_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_LEAD_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_TIN_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_URANIUM_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_ZINC_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_COBALT_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_COAL_ORE.getHolder().get());
            }

            if (biome.equals(BiomesRegistry.MERCURY)) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_COPPER_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_LEAD_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_TIN_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_URANIUM_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_ZINC_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_COAL_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_COBALT_ORE.getHolder().get());
            }

            if (biome.equals(BiomesRegistry.GLACIO) || biome.equals(BiomesRegistry.GLACIO_ICE_SPIKES)) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_LEAD_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_TIN_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_URANIUM_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_ZINC_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_COBALT_ORE.getHolder().get());
            }
        }
        if (ModsSupportCommon.FUTUREPACK.get()) {
            if (biome.equals(FPWorldData.MENELAUS) || biome.equals(FPWorldData.MENELAUS_FLAT) || biome.equals(FPWorldData.MENELAUS_FOREST) || biome.equals(FPWorldData.MENELAUS_LOCATION) || biome.equals(FPWorldData.MENELAUS_MUSHROOM) || biome.equals(FPWorldData.MENELAUS_PLATAU) || biome.equals(FPWorldData.MENELAUS_SEA)) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_COAL_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_COBALT_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_COPPER_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_LEAD_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_TIN_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_URANIUM_ORE.getHolder().get());
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MENELAUS_ZINC_ORE.getHolder().get());

            }
        }
    }
}
