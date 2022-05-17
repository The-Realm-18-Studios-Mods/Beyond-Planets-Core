package com.therealm18.beyondplanetscore;

import com.therealm18.beyondplanetscore.configurations.ItemsCommon;
import com.therealm18.beyondplanetscore.configurations.mars.MarsBlocksCommon;
import com.therealm18.beyondplanetscore.configurations.mars.MarsGeneralCommon;
import com.therealm18.beyondplanetscore.configurations.mars.MarsOreGenerationCommon;
import com.therealm18.beyondplanetscore.configurations.venus.VenusBlocksCommon;
import com.therealm18.beyondplanetscore.configurations.venus.VenusGeneralCommon;
import com.therealm18.beyondplanetscore.configurations.venus.VenusOreGenerationCommon;
import com.therealm18.beyondplanetscore.registries.BlocksRegistry;
import com.therealm18.beyondplanetscore.registries.ItemsRegistry;
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
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarsGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Mars//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarsOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Mars//ore_configuration-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MarsBlocksCommon.SPEC, "BeyondPlanets//beyond_planets_core//Blocks//Decoration//mars_decoration-common.toml");

        //Venus
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VenusGeneralCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Venus//general-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VenusOreGenerationCommon.SPEC, "BeyondPlanets//beyond_planets_core//Ores//Venus//ore_configuration-common.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, VenusBlocksCommon.SPEC, "BeyondPlanets//beyond_planets_core//Blocks//Decoration//venus_decoration-common.toml");

        //Items
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ItemsCommon.SPEC, "BeyondPlanets//beyond_planets_core//Items//ores-common.toml");

        //Registries
        ItemsRegistry.ITEMS.register(bus);
        BlocksRegistry.BLOCKS.register(bus);
    }
}