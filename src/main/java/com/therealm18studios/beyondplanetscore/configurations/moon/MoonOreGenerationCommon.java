package com.therealm18studios.beyondplanetscore.configurations.moon;

import net.minecraftforge.common.ForgeConfigSpec;

public class MoonOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOPPERHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONZINCHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOBALTHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOALHEIGHTTOP;


    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOPPERHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONZINCHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOBALTHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOALHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOPPERVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONZINCVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOBALTVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MOONCOALVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Moon Ore Config");

        //Moon Copper Ores
        BUILDER.push("Beyond Planets Core - Moon Copper Ore Config");
        MOONCOPPERHEIGHTTOP = BUILDER.comment("Should Moon Copper Ore Height Top.\nDefault = 32 (number)").define("Moon Copper Ore Height Top", 32);
        MOONCOPPERHEIGHTBOTTOM = BUILDER.comment("Should Moon Copper Ore Height Bottom.\nDefault = -32 (number)").define("Moon Copper Ore Height Bottom", -32);
        MOONCOPPERVEIN = BUILDER.comment("Should Moon Copper Ore Vein Size.\nDefault = 8 (number)").define("Moon Copper Ore Vein Size", 8);
        BUILDER.pop();

        //Moon Lead Ores
        BUILDER.push("Beyond Planets Core - Moon Lead Ore Config");
        MOONLEADHEIGHTTOP = BUILDER.comment("Should Moon Lead Height Top.\nDefault = 56 (number)").define("Moon Lead Ore Height Top", 56);
        MOONLEADHEIGHTBOTTOM = BUILDER.comment("Should Moon Lead Height Bottom.\nDefault = -34 (number)").define("Moon Lead Ore Height Bottom", -24);
        MOONLEADVEIN = BUILDER.comment("Should Moon Lead Ore Vein Size.\nDefault = 8 (number)").define("Moon Lead Ore Vein Size", 10);
        BUILDER.pop();

        //Moon Tin Ores
        BUILDER.push("Beyond Planets Core - Moon Tin Ore Config");
        MOONTINHEIGHTTOP = BUILDER.comment("Should Moon Tin Height Top.\nDefault = 80 (number)").define("Moon Tin Ore Height Top", 80);
        MOONTINHEIGHTBOTTOM = BUILDER.comment("Should Moon Tin Ore Height Bottom.\nDefault = -80 (number)").define("Moon Tin Ore Height Bottom", -80);
        MOONTINVEIN = BUILDER.comment("Should Moon Tin Ore Vein Size.\nDefault = 8 (number)").define("Moon Tin Ore Vein Size", 7);
        BUILDER.pop();

        //Moon Uranium Ores
        BUILDER.push("Beyond Planets Core - Moon Uranium Ore Config");
        MOONURANIUMHEIGHTTOP = BUILDER.comment("Should Moon Uranium Height Top.\nDefault = 80 (number)").define("Moon Uranium Ore Height Top", 80);
        MOONURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Moon Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Moon Uranium Ore Height Bottom", -80);
        MOONURANIUMVEIN = BUILDER.comment("Should Moon Uranium Ore Vein Size.\nDefault = 8 (number)").define("Moon Uranium Ore Vein Size", 6);
        BUILDER.pop();

        //Moon Zinc Ores
        BUILDER.push("Beyond Planets Core - Moon Zinc Ore Config");
        MOONZINCHEIGHTTOP = BUILDER.comment("Should Moon Zinc Ore spawn.\nDefault = 80 (number)").define("Moon Zinc Ore Height Top", 80);
        MOONZINCHEIGHTBOTTOM = BUILDER.comment("Should Moon Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Moon Zinc Ore Height Bottom", -80);
        MOONZINCVEIN = BUILDER.comment("Should Moon Zinc Ore Vein Size.\nDefault = 8 (number)").define("Moon Zinc Ore Vein Size", 6);
        BUILDER.pop();

        //Moon Cobalt Ores
        BUILDER.push("Beyond Planets Core - Moon Cobalt Ore Config");
        MOONCOBALTHEIGHTTOP = BUILDER.comment("Should Moon Cobalt Ore spawn.\nDefault = 80 (number)").define("Moon Cobalt Ore Height Top", 80);
        MOONCOBALTHEIGHTBOTTOM = BUILDER.comment("Should Moon Cobalt Ore Height Bottom.\nDefault = -80 (number)").define("Moon Cobalt Ore Height Bottom", -80);
        MOONCOBALTVEIN = BUILDER.comment("Should Moon Cobalt Ore Vein Size.\nDefault = 8 (number)").define("Moon Cobalt Ore Vein Size", 6);
        BUILDER.pop();

        //Moon Coal Ores
        BUILDER.push("Beyond Planets Core - Moon Coal Ore Config");
        MOONCOALHEIGHTTOP = BUILDER.comment("Should Moon Coal Ore spawn.\nDefault = 80 (number)").define("Moon Coal Ore Height Top", 80);
        MOONCOALHEIGHTBOTTOM = BUILDER.comment("Should Moon Coal Ore Height Bottom.\nDefault = -80 (number)").define("Moon Coal Ore Height Bottom", -80);
        MOONCOALVEIN = BUILDER.comment("Should Moon Coal Ore Vein Size.\nDefault = 8 (number)").define("Moon Coal Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}