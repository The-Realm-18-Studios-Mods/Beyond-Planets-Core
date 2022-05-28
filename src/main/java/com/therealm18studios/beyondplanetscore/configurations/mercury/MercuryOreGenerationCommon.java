package com.therealm18studios.beyondplanetscore.configurations.mercury;

import net.minecraftforge.common.ForgeConfigSpec;

public class MercuryOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYCOPPERHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYZINCHEIGHTTOP;

    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYCOPPERHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYZINCHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYCOPPERVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MERCURYZINCVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Mercury Ore Config");

        //Mercury Copper Ores
        BUILDER.push("Beyond Planets Core - Mercury Copper Ore Config");
        MERCURYCOPPERHEIGHTTOP = BUILDER.comment("Should Mercury Copper Ore Height Top.\nDefault = 32 (number)").define("Mercury Copper Ore Height Top", 32);
        MERCURYCOPPERHEIGHTBOTTOM = BUILDER.comment("Should Mercury Copper Ore Height Bottom.\nDefault = -32 (number)").define("Mercury Copper Ore Height Bottom", -32);
        MERCURYCOPPERVEIN = BUILDER.comment("Should Mercury Copper Ore Vein Size.\nDefault = 8 (number)").define("Mercury Copper Ore Vein Size", 8);
        BUILDER.pop();

        //Mercury Lead Ores
        BUILDER.push("Beyond Planets Core - Mercury Lead Ore Config");
        MERCURYLEADHEIGHTTOP = BUILDER.comment("Should Mercury Lead Height Top.\nDefault = 56 (number)").define("Mercury Lead Ore Height Top", 56);
        MERCURYLEADHEIGHTBOTTOM = BUILDER.comment("Should Mercury Lead Height Bottom.\nDefault = -34 (number)").define("Mercury Lead Ore Height Bottom", -24);
        MERCURYLEADVEIN = BUILDER.comment("Should Mercury Lead Ore Vein Size.\nDefault = 8 (number)").define("Mercury Copper Ore Vein Size", 10);
        BUILDER.pop();

        //Mercury Tin Ores
        BUILDER.push("Beyond Planets Core - Mercury Tin Ore Config");
        MERCURYTINHEIGHTTOP = BUILDER.comment("Should Mercury Tin Height Top.\nDefault = 80 (number)").define("Mercury Tin Ore Height Top", 80);
        MERCURYTINHEIGHTBOTTOM = BUILDER.comment("Should Mercury Tin Ore Height Bottom.\nDefault = -80 (number)").define("Mercury Tin Ore Height Bottom", -80);
        MERCURYTINVEIN = BUILDER.comment("Should Mercury Tin Ore Vein Size.\nDefault = 8 (number)").define("Mercury Copper Ore Vein Size", 7);
        BUILDER.pop();

        //Mercury Uranium Ores
        BUILDER.push("Beyond Planets Core - Mercury Uranium Ore Config");
        MERCURYURANIUMHEIGHTTOP = BUILDER.comment("Should Mercury Uranium Height Top.\nDefault = 80 (number)").define("Mercury Uranium Ore Height Top", 80);
        MERCURYURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Mercury Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Mercury Uranium Ore Height Bottom", -80);
        MERCURYURANIUMVEIN = BUILDER.comment("Should Mercury Uranium Ore Vein Size.\nDefault = 8 (number)").define("Mercury Copper Ore Vein Size", 6);
        BUILDER.pop();

        //Mercury Zinc Ores
        BUILDER.push("Beyond Planets Core - Mercury Zinc Ore Config");
        MERCURYZINCHEIGHTTOP = BUILDER.comment("Should Mercury Zinc Ore spawn.\nDefault = 80 (number)").define("Mercury Zinc Ore Height Top", 80);
        MERCURYZINCHEIGHTBOTTOM = BUILDER.comment("Should Mercury Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Mercury Zinc Ore Height Bottom", -80);
        MERCURYZINCVEIN = BUILDER.comment("Should Mercury Zinc Ore Vein Size.\nDefault = 8 (number)").define("Mercury Copper Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}