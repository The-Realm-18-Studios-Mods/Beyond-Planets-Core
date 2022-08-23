package com.therealm18studios.beyondplanetscore.world.modifier;

import com.therealm18studios.beyondplanetscore.BeyondPlanetsCore;
import com.therealm18studios.beyondplanetscore.world.oregen.OreGeneration;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.mrscauthd.beyond_earth.registries.BiomesRegistry;

@Mod.EventBusSubscriber(modid = BeyondPlanetsCore.MODID)
public class PlanetBiomeModifier {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(Registry.FEATURE_REGISTRY, BeyondPlanetsCore.MODID);

    @SubscribeEvent
    public static void biomesLoading(BiomeLoadingEvent event) {
        ResourceLocation biomes = event.getName();

        if (biomes.equals(BiomesRegistry.MARS_DESERT) || biomes.equals(BiomesRegistry.MARS_ROCKY_PLAINS) || biomes.equals(BiomesRegistry.MARS_ICE_SPIKES)) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_COPPER_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_LEAD_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_TIN_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_URANIUM_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_ZINC_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_COBALT_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MARS_COAL_ORE.getHolder().get());
        }

        if (biomes.equals(BiomesRegistry.VENUS_DESERT) || biomes.equals(BiomesRegistry.INFERNAL_VENUS_BARRENS)) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_COPPER_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_LEAD_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_TIN_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_URANIUM_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_ZINC_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.VENUS_COBALT_ORE.getHolder().get());
        }

        if (biomes.equals(BiomesRegistry.MOON_DESERT)) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_COPPER_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_LEAD_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_TIN_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_URANIUM_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_ZINC_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_COBALT_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MOON_COAL_ORE.getHolder().get());
        }

        if (biomes.equals(BiomesRegistry.MERCURY)) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_COPPER_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_LEAD_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_TIN_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_URANIUM_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_ZINC_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_COAL_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.MERCURY_COBALT_ORE.getHolder().get());
        }

        if (biomes.equals(BiomesRegistry.GLACIO) || biomes.equals(BiomesRegistry.GLACIO_ICE_SPIKES)) {
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_LEAD_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_TIN_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_URANIUM_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_ZINC_ORE.getHolder().get());
            event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(OreGeneration.GLACIO_COBALT_ORE.getHolder().get());
        }
    }
}
