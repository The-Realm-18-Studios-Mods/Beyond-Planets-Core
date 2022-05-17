package com.therealm18.beyondplanetscore.configurations.venus;

import net.minecraftforge.common.ForgeConfigSpec;

public class VenusBlocksCommon {

    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> BLOCK1;
    public static final ForgeConfigSpec.ConfigValue<Boolean> STAIR1;
    public static final ForgeConfigSpec.ConfigValue<Boolean> SLAB1;
    public static final ForgeConfigSpec.ConfigValue<Boolean> WALL1;

    static {
        BUILDER.push("Beyond Planets Core - Mars Ore Config");

        //Mars Ores
        BLOCK1 = BUILDER.comment("Should Venus Blocks be used.\nDefault = false as not finished. (true/false)").define("Venus Blocks", false);
        STAIR1 = BUILDER.comment("Should Venus Stairs be used.\nDefault = false as not finished. (true/false)").define("Venus Stairs", false);
        SLAB1 = BUILDER.comment("Should Venus Slabs be used.\nDefault = false as not finished. (true/false)").define("Venus Slabs", false);
        WALL1 = BUILDER.comment("Should Venus Walls be used.\nDefault = false as not finished. (true/false)").define("Venus Walls", false);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}