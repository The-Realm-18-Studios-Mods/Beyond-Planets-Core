package com.therealm18studios.beyondplanetscore.configurations.venus;

import net.minecraftforge.common.ForgeConfigSpec;

public class VenusOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSCOPPERHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSZINCHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSCOBALTHEIGHTTOP;

    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSCOPPERHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSZINCHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSCOBALTHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSCOPPERVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSZINCVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> VENUSCOBALTVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Venus Ore Config");

        //Venus Copper Ores
        BUILDER.push("Beyond Planets Core - Venus Copper Ore Config");
        VENUSCOPPERHEIGHTTOP = BUILDER.comment("Should Venus Copper Ore Height Top.\nDefault = 32 (number)").define("Venus Copper Ore Height Top", 32);
        VENUSCOPPERHEIGHTBOTTOM = BUILDER.comment("Should Venus Copper Ore Height Bottom.\nDefault = -32 (number)").define("Venus Copper Ore Height Bottom", -32);
        VENUSCOPPERVEIN = BUILDER.comment("Should Venus Copper Ore Vein Size.\nDefault = 8 (number)").define("Venus Copper Ore Vein Size", 8);
        BUILDER.pop();

        //Venus Lead Ores
        BUILDER.push("Beyond Planets Core - Venus Lead Ore Config");
        VENUSLEADHEIGHTTOP = BUILDER.comment("Should Venus Lead Height Top.\nDefault = 56 (number)").define("Venus Lead Ore Height Top", 56);
        VENUSLEADHEIGHTBOTTOM = BUILDER.comment("Should Venus Lead Height Bottom.\nDefault = -34 (number)").define("Venus Lead Ore Height Bottom", -24);
        VENUSLEADVEIN = BUILDER.comment("Should Venus Lead Ore Vein Size.\nDefault = 8 (number)").define("Venus Lead Ore Vein Size", 10);
        BUILDER.pop();

        //Venus Tin Ores
        BUILDER.push("Beyond Planets Core - Venus Tin Ore Config");
        VENUSTINHEIGHTTOP = BUILDER.comment("Should Venus Tin Height Top.\nDefault = 80 (number)").define("Venus Tin Ore Height Top", 80);
        VENUSTINHEIGHTBOTTOM = BUILDER.comment("Should Venus Tin Ore Height Bottom.\nDefault = -80 (number)").define("Venus Tin Ore Height Bottom", -80);
        VENUSTINVEIN = BUILDER.comment("Should Venus Tin Ore Vein Size.\nDefault = 8 (number)").define("Venus Tin Ore Vein Size", 7);
        BUILDER.pop();

        //Venus Uranium Ores
        BUILDER.push("Beyond Planets Core - Venus Uranium Ore Config");
        VENUSURANIUMHEIGHTTOP = BUILDER.comment("Should Venus Uranium Height Top.\nDefault = 80 (number)").define("Venus Uranium Ore Height Top", 80);
        VENUSURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Venus Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Venus Uranium Ore Height Bottom", -80);
        VENUSURANIUMVEIN = BUILDER.comment("Should Venus Uranium Ore Vein Size.\nDefault = 8 (number)").define("Venus Uranium Ore Vein Size", 6);
        BUILDER.pop();

        //Venus Zinc Ores
        BUILDER.push("Beyond Planets Core - Venus Zinc Ore Config");
        VENUSZINCHEIGHTTOP = BUILDER.comment("Should Venus Zinc Ore spawn.\nDefault = 80 (number)").define("Venus Zinc Ore Height Top", 80);
        VENUSZINCHEIGHTBOTTOM = BUILDER.comment("Should Venus Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Venus Zinc Ore Height Bottom", -80);
        VENUSZINCVEIN = BUILDER.comment("Should Venus Zinc Ore Vein Size.\nDefault = 8 (number)").define("Venus Zinc Ore Vein Size", 6);
        BUILDER.pop();

        //Venus Cobalt Ores
        BUILDER.push("Beyond Planets Core - Venus Cobalt Ore Config");
        VENUSCOBALTHEIGHTTOP = BUILDER.comment("Should Venus Cobalt Ore spawn.\nDefault = 80 (number)").define("Venus Cobalt Ore Height Top", 80);
        VENUSCOBALTHEIGHTBOTTOM = BUILDER.comment("Should Venus Cobalt Ore Height Bottom.\nDefault = -80 (number)").define("Venus Cobalt Ore Height Bottom", -80);
        VENUSCOBALTVEIN = BUILDER.comment("Should Venus Cobalt Ore Vein Size.\nDefault = 8 (number)").define("Venus Cobalt Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}