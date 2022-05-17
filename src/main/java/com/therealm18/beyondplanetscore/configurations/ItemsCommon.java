package com.therealm18.beyondplanetscore.configurations;

import net.minecraftforge.common.ForgeConfigSpec;

public class ItemsCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> MARSCOPPER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MARSTIN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MARSLEAD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MARSZINC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MARSURANIUM;

    static {
        BUILDER.push("Beyond Planets Core - Mars Ore Config");

        //Mars Ores
        MARSCOPPER = BUILDER.comment("Should Mars Copper Ore spawn.\nDefault = true (true/false)").define("Mars Copper Ore", true);
        MARSLEAD = BUILDER.comment("Should Mars Lead Ore spawn.\nDefault = true (true/false)").define("Mars Lead Ore", true);
        MARSTIN = BUILDER.comment("Should Mars Tin Ore spawn.\nDefault = true (true/false)").define("Mars Tin Ore", true);
        MARSURANIUM = BUILDER.comment("Should Mars Uranium Ore spawn.\nDefault = true (true/false)").define("Mars Uranium Ore", true);
        MARSZINC = BUILDER.comment("Should Mars Zinc Ore spawn.\nDefault = true (true/false)").define("Mars Zinc Ore", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}