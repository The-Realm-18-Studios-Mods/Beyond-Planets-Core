package com.therealm18studios.beyondplanetscore.configurations.supported;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModsSupportCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    // Futurepack
    public static final ForgeConfigSpec.ConfigValue<Boolean> BEYONDEARTH;

    // Futurepack
    public static final ForgeConfigSpec.ConfigValue<Boolean> FUTUREPACK;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Supported Mods Config");

        BEYONDEARTH = BUILDER.comment("Should we enable biomes for Beyond Earth?\nDefault = false (true/false)").define("Enable Beyond Earth Planets?", false);

        FUTUREPACK = BUILDER.comment("Should we enable biomes for Futurepack?\nDefault = false (true/false)").define("Enable Futurepack Planets?", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}