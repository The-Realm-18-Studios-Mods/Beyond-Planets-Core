package com.therealm18studios.beyondplanetscore.configurations.galcio;

import net.minecraftforge.common.ForgeConfigSpec;

public class GalcioOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOZINCHEIGHTTOP;

    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOZINCHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GALCIOZINCVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Galcio Ore Config");

        //Galcio Lead Ores
        BUILDER.push("Beyond Planets Core - Galcio Lead Ore Config");
        GALCIOLEADHEIGHTTOP = BUILDER.comment("Should Galcio Lead Height Top.\nDefault = 56 (number)").define("Galcio Lead Ore Height Top", 56);
        GALCIOLEADHEIGHTBOTTOM = BUILDER.comment("Should Galcio Lead Height Bottom.\nDefault = -34 (number)").define("Galcio Lead Ore Height Bottom", -24);
        GALCIOLEADVEIN = BUILDER.comment("Should Galcio Lead Ore Vein Size.\nDefault = 8 (number)").define("Galcio Copper Ore Vein Size", 10);
        BUILDER.pop();

        //Galcio Tin Ores
        BUILDER.push("Beyond Planets Core - Galcio Tin Ore Config");
        GALCIOTINHEIGHTTOP = BUILDER.comment("Should Galcio Tin Height Top.\nDefault = 80 (number)").define("Galcio Tin Ore Height Top", 80);
        GALCIOTINHEIGHTBOTTOM = BUILDER.comment("Should Galcio Tin Ore Height Bottom.\nDefault = -80 (number)").define("Galcio Tin Ore Height Bottom", -80);
        GALCIOTINVEIN = BUILDER.comment("Should Galcio Tin Ore Vein Size.\nDefault = 8 (number)").define("Galcio Copper Ore Vein Size", 7);
        BUILDER.pop();

        //Galcio Uranium Ores
        BUILDER.push("Beyond Planets Core - Galcio Uranium Ore Config");
        GALCIOURANIUMHEIGHTTOP = BUILDER.comment("Should Galcio Uranium Height Top.\nDefault = 80 (number)").define("Galcio Uranium Ore Height Top", 80);
        GALCIOURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Galcio Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Galcio Uranium Ore Height Bottom", -80);
        GALCIOURANIUMVEIN = BUILDER.comment("Should Galcio Uranium Ore Vein Size.\nDefault = 8 (number)").define("Galcio Copper Ore Vein Size", 6);
        BUILDER.pop();

        //Galcio Zinc Ores
        BUILDER.push("Beyond Planets Core - Galcio Zinc Ore Config");
        GALCIOZINCHEIGHTTOP = BUILDER.comment("Should Galcio Zinc Ore spawn.\nDefault = 80 (number)").define("Galcio Zinc Ore Height Top", 80);
        GALCIOZINCHEIGHTBOTTOM = BUILDER.comment("Should Galcio Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Galcio Zinc Ore Height Bottom", -80);
        GALCIOZINCVEIN = BUILDER.comment("Should Galcio Zinc Ore Vein Size.\nDefault = 8 (number)").define("Galcio Copper Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}