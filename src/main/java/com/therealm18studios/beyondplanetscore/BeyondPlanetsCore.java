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

        //Mars
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarsGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Mars//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarsOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Mars//ore_configuration-common.toml");

        //Venus
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VenusGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Venus//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VenusOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Venus//ore_configuration-common.toml");


        //Moon
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MoonGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Moon//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MoonOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Moon//ore_configuration-common.toml");


        //Moon
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MercuryGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Mercury//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MercuryOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Mercury//ore_configuration-common.toml");


        //Glacio
//        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GlacioGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Glacio//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, GlacioOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Glacio//ore_configuration-common.toml");

        //Registries
        ItemsRegistry.ITEMS.register(bus);
        BlocksRegistry.BLOCKS.register(bus);
        PlanetBiomeModifier.BIOME_MODIFIER_SERIALIZERS.register(bus);
        OreGeneration.CONFIGURED_FEATURES.register(bus);
        OreGeneration.PLACED_FEATURES.register(bus);
    }
}