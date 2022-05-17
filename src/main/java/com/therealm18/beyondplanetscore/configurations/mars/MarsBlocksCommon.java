package com.therealm18.beyondplanetscore.configurations.mars;

import net.minecraftforge.common.ForgeConfigSpec;

public class MarsBlocksCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> BLOCK1;
    public static final ForgeConfigSpec.ConfigValue<Boolean> STAIR1;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SLAB1;
    public static final ForgeConfigSpec.ConfigValue<Boolean> WALL1;

    static {
        BUILDER.push("Beyond Planets Core - Mars Ore Config");

        //Mars Ores
        BLOCK1 = BUILDER.comment("Should Mars Blocks be used.\nDefault = false as not finished. (true/false)").define("Mars Blocks", false);
        STAIR1 = BUILDER.comment("Should Mars Stairs be used.\nDefault = false as not finished. (true/false)").define("Mars Stairs", false);
        SLAB1 = BUILDER.comment("Should Mars Slabs be used.\nDefault = false as not finished. (true/false)").define("Mars Slabs", false);
        WALL1 = BUILDER.comment("Should Mars Walls be used.\nDefault = false as not finished. (true/false)").define("Mars Walls", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}