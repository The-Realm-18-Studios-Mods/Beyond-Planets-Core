package com.therealm18studios.beyondplanetscore.configurations.moon;

import net.minecraftforge.common.ForgeConfigSpec;

public class MoonGeneralCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONCOPPER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONTIN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONLEAD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONZINC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONURANIUM;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONCOBALT;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MOONCOAL;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Moon Ore Config");

        //Moon Ores
        MOONCOPPER = BUILDER.comment("Should Moon Copper Ore spawn.\nDefault = true (true/false)").define("Moon Copper Ore", true);
        MOONLEAD = BUILDER.comment("Should Moon Lead Ore spawn.\nDefault = true (true/false)").define("Moon Lead Ore", true);
        MOONTIN = BUILDER.comment("Should Moon Tin Ore spawn.\nDefault = true (true/false)").define("Moon Tin Ore", true);
        MOONURANIUM = BUILDER.comment("Should Moon Uranium Ore spawn.\nDefault = true (true/false)").define("Moon Uranium Ore", true);
        MOONZINC = BUILDER.comment("Should Moon Zinc Ore spawn.\nDefault = true (true/false)").define("Moon Zinc Ore", true);
        MOONCOBALT = BUILDER.comment("Should Moon Cobalt Ore spawn.\nDefault = true (true/false)").define("Moon Cobalt Ore", true);
        MOONCOAL = BUILDER.comment("Should Moon Coal Ore spawn.\nDefault = true (true/false)").define("Moon Coal Ore", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}