package com.therealm18studios.beyondplanetscore.configurations.menelaus;

import net.minecraftforge.common.ForgeConfigSpec;

public class MenelausOreGenerationCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    //Top Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOPPERHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSTINHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSLEADHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSURANIUMHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSZINCHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOBALTHEIGHTTOP;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOALHEIGHTTOP;

    //Bottom Level
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOPPERHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSTINHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSLEADHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSURANIUMHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSZINCHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOBALTHEIGHTBOTTOM;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOALHEIGHTBOTTOM;

    //Vein Size
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOPPERVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSTINVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSLEADVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSURANIUMVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSZINCVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOBALTVEIN;
    public static final ForgeConfigSpec.ConfigValue<Integer> MENELAUSCOALVEIN;



    // Somewhere the constructor is accessible
    static {
        BUILDER.push("Beyond Planets Core - Menelaus Ore Config");

        //Menelaus Copper Ores
        BUILDER.push("Beyond Planets Core - Menelaus Copper Ore Config");
        MENELAUSCOPPERHEIGHTTOP = BUILDER.comment("Should Menelaus Copper Ore Height Top.\nDefault = 32 (number)").define("Menelaus Copper Ore Height Top", 32);
        MENELAUSCOPPERHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Copper Ore Height Bottom.\nDefault = -32 (number)").define("Menelaus Copper Ore Height Bottom", -32);
        MENELAUSCOPPERVEIN = BUILDER.comment("Should Menelaus Copper Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Copper Ore Vein Size", 8);
        BUILDER.pop();

        //Menelaus Lead Ores
        BUILDER.push("Beyond Planets Core - Menelaus Lead Ore Config");
        MENELAUSLEADHEIGHTTOP = BUILDER.comment("Should Menelaus Lead Height Top.\nDefault = 56 (number)").define("Menelaus Lead Ore Height Top", 56);
        MENELAUSLEADHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Lead Height Bottom.\nDefault = -34 (number)").define("Menelaus Lead Ore Height Bottom", -24);
        MENELAUSLEADVEIN = BUILDER.comment("Should Menelaus Lead Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Lead Ore Vein Size", 10);
        BUILDER.pop();

        //Menelaus Tin Ores
        BUILDER.push("Beyond Planets Core - Menelaus Tin Ore Config");
        MENELAUSTINHEIGHTTOP = BUILDER.comment("Should Menelaus Tin Height Top.\nDefault = 80 (number)").define("Menelaus Tin Ore Height Top", 80);
        MENELAUSTINHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Tin Ore Height Bottom.\nDefault = -80 (number)").define("Menelaus Tin Ore Height Bottom", -80);
        MENELAUSTINVEIN = BUILDER.comment("Should Menelaus Tin Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Tin Ore Vein Size", 7);
        BUILDER.pop();

        //Menelaus Uranium Ores
        BUILDER.push("Beyond Planets Core - Menelaus Uranium Ore Config");
        MENELAUSURANIUMHEIGHTTOP = BUILDER.comment("Should Menelaus Uranium Height Top.\nDefault = 80 (number)").define("Menelaus Uranium Ore Height Top", 80);
        MENELAUSURANIUMHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Uranium Ore Height Bottom.\nDefault = -80 (number)").define("Menelaus Uranium Ore Height Bottom", -80);
        MENELAUSURANIUMVEIN = BUILDER.comment("Should Menelaus Uranium Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Uranium Ore Vein Size", 6);
        BUILDER.pop();

        //Menelaus Zinc Ores
        BUILDER.push("Beyond Planets Core - Menelaus Zinc Ore Config");
        MENELAUSZINCHEIGHTTOP = BUILDER.comment("Should Menelaus Zinc Ore spawn.\nDefault = 80 (number)").define("Menelaus Zinc Ore Height Top", 80);
        MENELAUSZINCHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Zinc Ore Height Bottom.\nDefault = -80 (number)").define("Menelaus Zinc Ore Height Bottom", -80);
        MENELAUSZINCVEIN = BUILDER.comment("Should Menelaus Zinc Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Zinc Ore Vein Size", 6);
        BUILDER.pop();

        //Menelaus Cobalt Ores
        BUILDER.push("Beyond Planets Core - Menelaus Cobalt Ore Config");
        MENELAUSCOBALTHEIGHTTOP = BUILDER.comment("Should Menelaus Cobalt Ore spawn.\nDefault = 80 (number)").define("Menelaus Cobalt Ore Height Top", 80);
        MENELAUSCOBALTHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Cobalt Ore Height Bottom.\nDefault = -80 (number)").define("Menelaus Cobalt Ore Height Bottom", -80);
        MENELAUSCOBALTVEIN = BUILDER.comment("Should Menelaus Cobalt Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Cobalt Ore Vein Size", 6);
        BUILDER.pop();

        //Menelaus Coal Ores
        BUILDER.push("Beyond Planets Core - Menelaus Coal Ore Config");
        MENELAUSCOALHEIGHTTOP = BUILDER.comment("Should Menelaus Coal Ore spawn.\nDefault = 80 (number)").define("Menelaus Coal Ore Height Top", 80);
        MENELAUSCOALHEIGHTBOTTOM = BUILDER.comment("Should Menelaus Coal Ore Height Bottom.\nDefault = -80 (number)").define("Menelaus Coal Ore Height Bottom", -80);
        MENELAUSCOALVEIN = BUILDER.comment("Should Menelaus Coal Ore Vein Size.\nDefault = 8 (number)").define("Menelaus Coal Ore Vein Size", 6);
        BUILDER.pop();

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}