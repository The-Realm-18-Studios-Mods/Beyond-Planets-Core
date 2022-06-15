package com.therealm18studios.beyondplanetscore.configurations.glacio;

import net.minecraftforge.common.ForgeConfigSpec;

public class GlacioGeneralCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> GLACIOTIN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GLACIOLEAD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GLACIOZINC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GLACIOURANIUM;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GLACIOCOBALT;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Glacio Ore Config");

        //Glacio Ores
        GLACIOLEAD = BUILDER.comment("Should Glacio Lead Ore spawn.\nDefault = true (true/false)").define("Glacio Lead Ore", true);
        GLACIOTIN = BUILDER.comment("Should Glacio Tin Ore spawn.\nDefault = true (true/false)").define("Glacio Tin Ore", true);
        GLACIOURANIUM = BUILDER.comment("Should Glacio Uranium Ore spawn.\nDefault = true (true/false)").define("Glacio Uranium Ore", true);
        GLACIOZINC = BUILDER.comment("Should Glacio Zinc Ore spawn.\nDefault = true (true/false)").define("Glacio Zinc Ore", true);
        GLACIOCOBALT = BUILDER.comment("Should Glacio Cobalt Ore spawn.\nDefault = true (true/false)").define("Glacio Cobalt Ore", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}