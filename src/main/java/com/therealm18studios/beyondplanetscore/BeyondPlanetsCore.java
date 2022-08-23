package com.therealm18studios.beyondplanetscore;

import com.therealm18studios.beyondplanetscore.configurations.glacio.GlacioOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.configurations.mars.MarsOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.configurations.mercury.MercuryOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.configurations.moon.MoonOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.configurations.venus.VenusOreGenerationCommon;
import com.therealm18studios.beyondplanetscore.registries.BlocksRegistry;
import com.therealm18studios.beyondplanetscore.registries.ItemsRegistry;
import com.therealm18studios.beyondplanetscore.world.modifier.PlanetBiomeModifier;
import com.therealm18studios.beyondplanetscore.world.oregen.OreGeneration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(BeyondPlanetsCore.MODID)
public class BeyondPlanetsCore
{
    public static final String MODID = "beyond_planets_core";

    public BeyondPlanetsCore() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);

        //Config

        /**
         * Order of current planet layouts
         * 1) Mars (Beyond Earth)
         * 2) Venus (Beyond Earth)
         * 3) Moon (Beyond Earth)
         * 4) Mercury (Beyond Earth)
         * 5) Glacio (Beyond Earth)
         */
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarsOreGenerationCommon.SPEC, "TheRealM18Studios//beyond_planets_core//Beyond Earth//Mars//ore_configuration-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VenusOreGenerationCommon.SPEC, "TheRealM18Studios//beyond_planets_core//Beyond Earth//Venus//ore_configuration-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MoonOreGenerationCommon.SPEC, "TheRealM18Studios//beyond_planets_core//Beyond Earth//Moon//ore_configuration-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MercuryOreGenerationCommon.SPEC, "TheRealM18Studios//beyond_planets_core//Beyond Earth//Mercury//ore_configuration-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GlacioOreGenerationCommon.SPEC, "TheRealM18Studios//beyond_planets_core//Beyond Earth//Glacio//ore_configuration-common.toml");

        //Registries
        ItemsRegistry.ITEMS.register(bus);
        BlocksRegistry.BLOCKS.register(bus);
        PlanetBiomeModifier.FEATURES.register(bus);
        OreGeneration.CONFIGURED_FEATURES.register(bus);
        OreGeneration.PLACED_FEATURES.register(bus);
    }
}