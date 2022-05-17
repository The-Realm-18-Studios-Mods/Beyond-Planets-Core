package com.therealm18.beyondplanetscore.configurations.venus;

import net.minecraftforge.common.ForgeConfigSpec;

public class VenusGeneralCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> VENUSCOPPER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VENUSTIN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VENUSLEAD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VENUSZINC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> VENUSURANIUM;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Mars Ore Config");

        //Mars Ores
        VENUSCOPPER = BUILDER.comment("Should Venus Copper Ore spawn.\nDefault = true (true/false)").define("Venus Copper Ore", true);
        VENUSLEAD = BUILDER.comment("Should Venus Lead Ore spawn.\nDefault = true (true/false)").define("Venus Lead Ore", true);
        VENUSTIN = BUILDER.comment("Should Venus Tin Ore spawn.\nDefault = true (true/false)").define("Venus Tin Ore", true);
        VENUSURANIUM = BUILDER.comment("Should Venus Uranium Ore spawn.\nDefault = true (true/false)").define("Venus Uranium Ore", true);
        VENUSZINC = BUILDER.comment("Should Venus Zinc Ore spawn.\nDefault = true (true/false)").define("Venus Zinc Ore", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}