package com.therealm18studios.beyondplanetscore.configurations.mars;

import net.minecraftforge.common.ForgeConfigSpec;

public class MarsOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOPPERHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSZINCHEIGHTTOP;

    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOPPERHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSZINCHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSCOPPERVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MARSZINCVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Mars Ore Config");

        //Mars Copper Ores
        BUILDER.push("Beyond Planets Core - Mars Copper Ore Config");
        MARSCOPPERHEIGHTTOP = BUILDER.comment("Should Mars Copper Ore Height Top.\nDefault = 32 (number)").define("Mars Copper Ore Height Top", 32);
        MARSCOPPERHEIGHTBOTTOM = BUILDER.comment("Should Mars Copper Ore Height Bottom.\nDefault = -32 (number)").define("Mars Copper Ore Height Bottom", -32);
        MARSCOPPERVEIN = BUILDER.comment("Should Mars Copper Ore Vein Size.\nDefault = 8 (number)").define("Mars Copper Ore Vein Size", 8);

        //Mars Lead Ores
        BUILDER.push("Beyond Planets Core - Mars Lead Ore Config");
        MARSLEADHEIGHTTOP = BUILDER.comment("Should Mars Lead Height Top.\nDefault = 56 (number)").define("Mars Lead Ore Height Top", 56);
        MARSLEADHEIGHTBOTTOM = BUILDER.comment("Should Mars Lead Height Bottom.\nDefault = -34 (number)").define("Mars Lead Ore Height Bottom", -24);
        MARSLEADVEIN = BUILDER.comment("Should Mars Lead Ore Vein Size.\nDefault = 8 (number)").define("Mars Copper Ore Vein Size", 10);

        //Mars Tin Ores
        BUILDER.push("Beyond Planets Core - Mars Tin Ore Config");
        MARSTINHEIGHTTOP = BUILDER.comment("Should Mars Tin Height Top.\nDefault = 80 (number)").define("Mars Tin Ore Height Top", 80);
        MARSTINHEIGHTBOTTOM = BUILDER.comment("Should Mars Tin Ore Height Bottom.\nDefault = -80 (number)").define("Mars Tin Ore Height Bottom", -80);
        MARSTINVEIN = BUILDER.comment("Should Mars Tin Ore Vein Size.\nDefault = 8 (number)").define("Mars Copper Ore Vein Size", 7);

        //Mars Uranium Ores
        BUILDER.push("Beyond Planets Core - Mars Uranium Ore Config");
        MARSURANIUMHEIGHTTOP = BUILDER.comment("Should Mars Uranium Height Top.\nDefault = 80 (number)").define("Mars Uranium Ore Height Top", 80);
        MARSURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Mars Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Mars Uranium Ore Height Bottom", -80);
        MARSURANIUMVEIN = BUILDER.comment("Should Mars Uranium Ore Vein Size.\nDefault = 8 (number)").define("Mars Copper Ore Vein Size", 6);

        //Mars Zinc Ores
        BUILDER.push("Beyond Planets Core - Mars Zinc Ore Config");
        MARSZINCHEIGHTTOP = BUILDER.comment("Should Mars Zinc Ore spawn.\nDefault = 80 (number)").define("Mars Zinc Ore Height Top", 80);
        MARSZINCHEIGHTBOTTOM = BUILDER.comment("Should Mars Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Mars Zinc Ore Height Bottom", -80);
        MARSZINCVEIN = BUILDER.comment("Should Mars Zinc Ore Vein Size.\nDefault = 8 (number)").define("Mars Copper Ore Vein Size", 6);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}