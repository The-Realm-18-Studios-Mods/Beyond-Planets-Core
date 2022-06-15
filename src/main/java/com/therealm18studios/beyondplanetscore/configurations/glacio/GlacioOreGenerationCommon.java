package com.therealm18studios.beyondplanetscore.configurations.glacio;

import net.minecraftforge.common.ForgeConfigSpec;

public class GlacioOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOZINCHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOCOBALTHEIGHTTOP;

    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOZINCHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOCOBALTHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOZINCVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> GLACIOCOBALTVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Glacio Ore Config");

        //Glacio Lead Ores
        BUILDER.push("Beyond Planets Core - Glacio Lead Ore Config");
        GLACIOLEADHEIGHTTOP = BUILDER.comment("Should Glacio Lead Height Top.\nDefault = 56 (number)").define("Glacio Lead Ore Height Top", 56);
        GLACIOLEADHEIGHTBOTTOM = BUILDER.comment("Should Glacio Lead Height Bottom.\nDefault = -34 (number)").define("Glacio Lead Ore Height Bottom", -24);
        GLACIOLEADVEIN = BUILDER.comment("Should Glacio Lead Ore Vein Size.\nDefault = 8 (number)").define("Glacio Lead Ore Vein Size", 10);
        BUILDER.pop();

        //Glacio Tin Ores
        BUILDER.push("Beyond Planets Core - Glacio Tin Ore Config");
        GLACIOTINHEIGHTTOP = BUILDER.comment("Should Glacio Tin Height Top.\nDefault = 80 (number)").define("Glacio Tin Ore Height Top", 80);
        GLACIOTINHEIGHTBOTTOM = BUILDER.comment("Should Glacio Tin Ore Height Bottom.\nDefault = -80 (number)").define("Glacio Tin Ore Height Bottom", -80);
        GLACIOTINVEIN = BUILDER.comment("Should Glacio Tin Ore Vein Size.\nDefault = 8 (number)").define("Glacio Tin Ore Vein Size", 7);
        BUILDER.pop();

        //Glacio Uranium Ores
        BUILDER.push("Beyond Planets Core - Glacio Uranium Ore Config");
        GLACIOURANIUMHEIGHTTOP = BUILDER.comment("Should Glacio Uranium Height Top.\nDefault = 80 (number)").define("Glacio Uranium Ore Height Top", 80);
        GLACIOURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Glacio Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Glacio Uranium Ore Height Bottom", -80);
        GLACIOURANIUMVEIN = BUILDER.comment("Should Glacio Uranium Ore Vein Size.\nDefault = 8 (number)").define("Glacio Uranium Ore Vein Size", 6);
        BUILDER.pop();

        //Glacio Zinc Ores
        BUILDER.push("Beyond Planets Core - Glacio Zinc Ore Config");
        GLACIOZINCHEIGHTTOP = BUILDER.comment("Should Glacio Zinc Ore spawn.\nDefault = 80 (number)").define("Glacio Zinc Ore Height Top", 80);
        GLACIOZINCHEIGHTBOTTOM = BUILDER.comment("Should Glacio Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Glacio Zinc Ore Height Bottom", -80);
        GLACIOZINCVEIN = BUILDER.comment("Should Glacio Zinc Ore Vein Size.\nDefault = 8 (number)").define("Glacio Zinc Ore Vein Size", 6);
        BUILDER.pop();

        //Glacio Cobalt Ores
        BUILDER.push("Beyond Planets Core - Glacio Cobalt Ore Config");
        GLACIOCOBALTHEIGHTTOP = BUILDER.comment("Should Glacio Cobalt Ore spawn.\nDefault = 80 (number)").define("Glacio Cobalt Ore Height Top", 80);
        GLACIOCOBALTHEIGHTBOTTOM = BUILDER.comment("Should Glacio Cobalt Ore Height Bottom.\nDefault = -80 (number)").define("Glacio Cobalt Ore Height Bottom", -80);
        GLACIOCOBALTVEIN = BUILDER.comment("Should Glacio Cobalt Ore Vein Size.\nDefault = 8 (number)").define("Glacio Cobalt Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}