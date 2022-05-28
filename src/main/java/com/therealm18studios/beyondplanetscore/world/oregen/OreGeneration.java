package com.therealm18studios.beyondplanetscore.world.oregen;

import com.therealm18studios.beyondplanetscore.BeyondPlanetsCore;
import com.therealm18studios.beyondplanetscore.configurations.mars.MarsGeneralCommon;
import com.therealm18studios.beyondplanetscore.configurations.mars.MarsOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.configurations.moon.MoonGeneralCommon;
import com.therealm18studios.beyondplanetscore.configurations.moon.MoonOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.configurations.venus.VenusGeneralCommon;
import com.therealm18studios.beyondplanetscore.configurations.venus.VenusOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.registries.BlocksRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;
import net.mrscauthd.beyond_earth.registries.BiomesRegistry;
import net.mrscauthd.beyond_earth.registries.FeatureRegistry;

import java.util.List;

@Mod.EventBusSubscriber(modid = BeyondPlanetsCore.MODID)
public class OreGeneration {

    /** MARS ORES: */
    public static final RuleTest MARS_MATCH = new TagMatchTest(net.mrscauthd.beyond_earth.world.oregen.OreGeneration.MARS_ORE_REPLACEABLES);

    // MARS_COPPER_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MARS_COPPER_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("mars_copper_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MARS_MATCH, BlocksRegistry.MARS_COPPER_ORE.get().defaultBlockState(), 10)));
    public static final RegistryObject<PlacedFeature> MARS_COPPER_ORE = FeatureRegistry.PLACED_FEATURES.register("mars_copper_ore", () -> new PlacedFeature(MARS_COPPER_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MarsOreGenerationCommon.MARSCOPPERVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSCOPPERHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSCOPPERHEIGHTTOP.get())))));

    // MARS_LEAD_ORE_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MARS_LEAD_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("mars_lead_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MARS_MATCH, BlocksRegistry.MARS_LEAD_ORE.get().defaultBlockState(), 11)));
    public static final RegistryObject<PlacedFeature> MARS_LEAD_ORE = FeatureRegistry.PLACED_FEATURES.register("mars_lead_ore", () -> new PlacedFeature(MARS_LEAD_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MarsOreGenerationCommon.MARSLEADVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(MarsOreGenerationCommon.MARSLEADHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSLEADHEIGHTTOP.get())))));

    // MARS_TIN_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MARS_TIN_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("mars_tin_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MARS_MATCH, BlocksRegistry.MARS_TIN_ORE.get().defaultBlockState(), 7)));
    public static final RegistryObject<PlacedFeature> MARS_TIN_ORE = FeatureRegistry.PLACED_FEATURES.register("mars_tin_ore", () -> new PlacedFeature(MARS_TIN_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MarsOreGenerationCommon.MARSTINVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSTINHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSTINHEIGHTTOP.get())))));

    // MARS_URANIUM_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MARS_URANIUM_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("mars_uranium_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MARS_MATCH, BlocksRegistry.MARS_URANIUM_ORE.get().defaultBlockState(), 8)));
    public static final RegistryObject<PlacedFeature> MARS_URANIUM_ORE = FeatureRegistry.PLACED_FEATURES.register("mars_uranium_ore", () -> new PlacedFeature(MARS_URANIUM_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MarsOreGenerationCommon.MARSURANIUMVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSURANIUMHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSURANIUMHEIGHTTOP.get())))));

    // MARS_ZINC_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MARS_ZINC_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("mars_zinc_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MARS_MATCH, BlocksRegistry.MARS_ZINC_ORE.get().defaultBlockState(), 8)));
    public static final RegistryObject<PlacedFeature> MARS_ZINC_ORE = FeatureRegistry.PLACED_FEATURES.register("mars_zinc_ore", () -> new PlacedFeature(MARS_ZINC_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MarsOreGenerationCommon.MARSZINCVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSZINCHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MarsOreGenerationCommon.MARSZINCHEIGHTTOP.get())))));




    /** VENUS ORES: */
    public static final RuleTest VENUS_MATCH = new TagMatchTest(net.mrscauthd.beyond_earth.world.oregen.OreGeneration.VENUS_ORE_REPLACEABLES);

    // VENUS_COPPER_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> VENUS_COPPER_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("venus_copper_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(VENUS_MATCH, BlocksRegistry.VENUS_COPPER_ORE.get().defaultBlockState(), 10)));
    public static final RegistryObject<PlacedFeature> VENUS_COPPER_ORE = FeatureRegistry.PLACED_FEATURES.register("venus_copper_ore", () -> new PlacedFeature(VENUS_COPPER_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(VenusOreGenerationCommon.VENUSCOPPERVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSCOPPERHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSCOPPERHEIGHTTOP.get())))));

    // VENUS_LEAD_ORE_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> VENUS_LEAD_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("venus_lead_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(VENUS_MATCH, BlocksRegistry.VENUS_LEAD_ORE.get().defaultBlockState(), 11)));
    public static final RegistryObject<PlacedFeature> VENUS_LEAD_ORE = FeatureRegistry.PLACED_FEATURES.register("venus_lead_ore", () -> new PlacedFeature(VENUS_LEAD_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(VenusOreGenerationCommon.VENUSLEADVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(VenusOreGenerationCommon.VENUSLEADHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSLEADHEIGHTTOP.get())))));

    // VENUS_TIN_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> VENUS_TIN_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("venus_tin_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(VENUS_MATCH, BlocksRegistry.VENUS_TIN_ORE.get().defaultBlockState(), 7)));
    public static final RegistryObject<PlacedFeature> VENUS_TIN_ORE = FeatureRegistry.PLACED_FEATURES.register("venus_tin_ore", () -> new PlacedFeature(VENUS_TIN_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(VenusOreGenerationCommon.VENUSTINVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSTINHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSTINHEIGHTTOP.get())))));

    // VENUS_URANIUM_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> VENUS_URANIUM_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("venus_uranium_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(VENUS_MATCH, BlocksRegistry.VENUS_URANIUM_ORE.get().defaultBlockState(), 8)));
    public static final RegistryObject<PlacedFeature> VENUS_URANIUM_ORE = FeatureRegistry.PLACED_FEATURES.register("venus_uranium_ore", () -> new PlacedFeature(VENUS_URANIUM_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(VenusOreGenerationCommon.VENUSURANIUMVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSURANIUMHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSURANIUMHEIGHTTOP.get())))));

    // VENUS_ZINC_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> VENUS_ZINC_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("venus_zinc_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(VENUS_MATCH, BlocksRegistry.VENUS_ZINC_ORE.get().defaultBlockState(), 8)));
    public static final RegistryObject<PlacedFeature> VENUS_ZINC_ORE = FeatureRegistry.PLACED_FEATURES.register("venus_zinc_ore", () -> new PlacedFeature(VENUS_ZINC_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(VenusOreGenerationCommon.VENUSZINCVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSZINCHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(VenusOreGenerationCommon.VENUSZINCHEIGHTTOP.get())))));




    /** MOON ORES: */
    public static final RuleTest MOON_MATCH = new TagMatchTest(net.mrscauthd.beyond_earth.world.oregen.OreGeneration.MOON_ORE_REPLACEABLES);

    // MOON_COPPER_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MOON_COPPER_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("moon_copper_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MOON_MATCH, BlocksRegistry.MOON_COPPER_ORE.get().defaultBlockState(), 10)));
    public static final RegistryObject<PlacedFeature> MOON_COPPER_ORE = FeatureRegistry.PLACED_FEATURES.register("moon_copper_ore", () -> new PlacedFeature(MOON_COPPER_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MoonOreGenerationCommon.MOONCOPPERVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONCOPPERHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONCOPPERHEIGHTTOP.get())))));

    // MOON_LEAD_ORE_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MOON_LEAD_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("moon_lead_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MOON_MATCH, BlocksRegistry.MOON_LEAD_ORE.get().defaultBlockState(), 11)));
    public static final RegistryObject<PlacedFeature> MOON_LEAD_ORE = FeatureRegistry.PLACED_FEATURES.register("moon_lead_ore", () -> new PlacedFeature(MOON_LEAD_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MoonOreGenerationCommon.MOONLEADVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.absolute(MoonOreGenerationCommon.MOONLEADHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONLEADHEIGHTTOP.get())))));

    // MOON_TIN_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MOON_TIN_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("moon_tin_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MOON_MATCH, BlocksRegistry.MOON_TIN_ORE.get().defaultBlockState(), 7)));
    public static final RegistryObject<PlacedFeature> MOON_TIN_ORE = FeatureRegistry.PLACED_FEATURES.register("moon_tin_ore", () -> new PlacedFeature(MOON_TIN_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MoonOreGenerationCommon.MOONTINVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONTINHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONTINHEIGHTTOP.get())))));

    // MOON_URANIUM_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MOON_URANIUM_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("moon_uranium_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MOON_MATCH, BlocksRegistry.MOON_URANIUM_ORE.get().defaultBlockState(), 8)));
    public static final RegistryObject<PlacedFeature> MOON_URANIUM_ORE = FeatureRegistry.PLACED_FEATURES.register("moon_uranium_ore", () -> new PlacedFeature(MOON_URANIUM_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MoonOreGenerationCommon.MOONURANIUMVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONURANIUMHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONURANIUMHEIGHTTOP.get())))));

    // MOON_ZINC_ORE
    public static final RegistryObject<ConfiguredFeature<?,?>> MOON_ZINC_ORE_CONFIGURED = FeatureRegistry.CONFIGURED_FEATURES.register("moon_zinc_ore", () -> new ConfiguredFeature(Feature.ORE, new OreConfiguration(MOON_MATCH, BlocksRegistry.MOON_ZINC_ORE.get().defaultBlockState(), 8)));
    public static final RegistryObject<PlacedFeature> MOON_ZINC_ORE = FeatureRegistry.PLACED_FEATURES.register("moon_zinc_ore", () -> new PlacedFeature(MOON_ZINC_ORE_CONFIGURED.getHolder().get(), commonOrePlacement(MoonOreGenerationCommon.MOONZINCVEIN.get(), HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONZINCHEIGHTBOTTOM.get()), VerticalAnchor.aboveBottom(MoonOreGenerationCommon.MOONZINCHEIGHTTOP.get())))));

    @SubscribeEvent
    public static void biomesLoading(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();

        if (biome.equals(BiomesRegistry.MARS_DESERT) || biome.equals(BiomesRegistry.MARS_ROCKY_PLAINS) || biome.equals(BiomesRegistry.MARS_ICE_SPIKES)) {
            if (MarsGeneralCommon.MARSCOPPER.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MARS_COPPER_ORE.getHolder().get());
            }
            if (MarsGeneralCommon.MARSLEAD.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MARS_LEAD_ORE.getHolder().get());
            }
            if (MarsGeneralCommon.MARSTIN.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MARS_TIN_ORE.getHolder().get());
            }
            if (MarsGeneralCommon.MARSURANIUM.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MARS_URANIUM_ORE.getHolder().get());
            }
            if (MarsGeneralCommon.MARSZINC.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MARS_ZINC_ORE.getHolder().get());
            }
        }

        if (biome.equals(BiomesRegistry.VENUS_DESERT) || biome.equals(BiomesRegistry.INFERNAL_VENUS_BARRENS)) {
            if (VenusGeneralCommon.VENUSCOPPER.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(VENUS_COPPER_ORE.getHolder().get());
            }
            if (VenusGeneralCommon.VENUSLEAD.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(VENUS_LEAD_ORE.getHolder().get());
            }
            if (VenusGeneralCommon.VENUSTIN.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(VENUS_TIN_ORE.getHolder().get());
            }
            if (VenusGeneralCommon.VENUSURANIUM.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(VENUS_URANIUM_ORE.getHolder().get());
            }
            if (VenusGeneralCommon.VENUSZINC.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(VENUS_ZINC_ORE.getHolder().get());
            }
        }

        if (biome.equals(BiomesRegistry.MOON_DESERT)) {
            if (MoonGeneralCommon.MOONCOPPER.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MOON_COPPER_ORE.getHolder().get());
            }
            if (MoonGeneralCommon.MOONLEAD.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MOON_LEAD_ORE.getHolder().get());
            }
            if (MoonGeneralCommon.MOONTIN.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MOON_TIN_ORE.getHolder().get());
            }
            if (MoonGeneralCommon.MOONURANIUM.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MOON_URANIUM_ORE.getHolder().get());
            }
            if (MoonGeneralCommon.MOONZINC.get()) {
                event.getGeneration().getFeatures(GenerationStep.Decoration.UNDERGROUND_ORES).add(MOON_ZINC_ORE.getHolder().get());
            }
        }
    }

    /** ORE PLACEMENTS */
    private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
        return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
    }

    private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
        return orePlacement(CountPlacement.of(p_195344_), p_195345_);
    }

    private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
        return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
    }
}
