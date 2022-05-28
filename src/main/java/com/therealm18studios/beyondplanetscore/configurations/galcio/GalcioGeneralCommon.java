package com.therealm18studios.beyondplanetscore.configurations.galcio;

import net.minecraftforge.common.ForgeConfigSpec;

public class GalcioGeneralCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> GALCIOTIN;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GALCIOLEAD;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GALCIOZINC;
    public static final ForgeConfigSpec.ConfigValue<Boolean> GALCIOURANIUM;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Galcio Ore Config");

        //Galcio Ores
        GALCIOLEAD = BUILDER.comment("Should Galcio Lead Ore spawn.\nDefault = true (true/false)").define("Galcio Lead Ore", true);
        GALCIOTIN = BUILDER.comment("Should Galcio Tin Ore spawn.\nDefault = true (true/false)").define("Galcio Tin Ore", true);
        GALCIOURANIUM = BUILDER.comment("Should Galcio Uranium Ore spawn.\nDefault = true (true/false)").define("Galcio Uranium Ore", true);
        GALCIOZINC = BUILDER.comment("Should Galcio Zinc Ore spawn.\nDefault = true (true/false)").define("Galcio Zinc Ore", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}