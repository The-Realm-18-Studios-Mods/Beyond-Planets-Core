package com.therealm18studios.beyondplanetscore.configurations.mercury;

import net.minecraftforge.common.ForgeConfigSpec;

public class MercuryGeneralCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> MERCURYCOPPER;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MERCURYTIN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MERCURYLEAD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MERCURYZINC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MERCURYURANIUM;
    public static final ForgeConfigSpec.ConfigValue<Boolean> MERCURYCOBALT;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Mercury Ore Config");

        //Mercury Ores
        MERCURYCOPPER = BUILDER.comment("Should Mercury Copper Ore spawn.\nDefault = true (true/false)").define("Mercury Copper Ore", true);
        MERCURYLEAD = BUILDER.comment("Should Mercury Lead Ore spawn.\nDefault = true (true/false)").define("Mercury Lead Ore", true);
        MERCURYTIN = BUILDER.comment("Should Mercury Tin Ore spawn.\nDefault = true (true/false)").define("Mercury Tin Ore", true);
        MERCURYURANIUM = BUILDER.comment("Should Mercury Uranium Ore spawn.\nDefault = true (true/false)").define("Mercury Uranium Ore", true);
        MERCURYZINC = BUILDER.comment("Should Mercury Zinc Ore spawn.\nDefault = true (true/false)").define("Mercury Zinc Ore", true);
        MERCURYCOBALT = BUILDER.comment("Should Mercury Cobalt Ore spawn.\nDefault = true (true/false)").define("Mercury Cobalt Ore", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}