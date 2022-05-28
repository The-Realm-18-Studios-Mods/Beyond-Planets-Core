package com.therealm18studios.beyondplanetscore.registries;

import com.therealm18studios.beyondplanetscore.BeyondPlanetsCore;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksRegistry {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondPlanetsCore.MODID);

//    //Mars Type 1
//    public static RegistryObject<Block> BLOCK1 = BLOCKS.register("block1", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
//    public static RegistryObject<Block> WALL1 = BLOCKS.register("wall1", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
//    public static RegistryObject<Block> SLAB1 = BLOCKS.register("slab1", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
//    public static RegistryObject<Block> STAIR1 = BLOCKS.register("stair1", () -> { return new StairBlock(() -> BLOCK1.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Mars Ores
    public static RegistryObject<Block> MARS_COPPER_ORE = BLOCKS.register("mars_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_LEAD_ORE = BLOCKS.register("mars_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_TIN_ORE = BLOCKS.register("mars_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_URANIUM_ORE = BLOCKS.register("mars_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_ZINC_ORE = BLOCKS.register("mars_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Venus Ores
    public static RegistryObject<Block> VENUS_COPPER_ORE = BLOCKS.register("venus_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_LEAD_ORE = BLOCKS.register("venus_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_TIN_ORE = BLOCKS.register("venus_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_URANIUM_ORE = BLOCKS.register("venus_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_ZINC_ORE = BLOCKS.register("venus_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Moon Ores
    public static RegistryObject<Block> MOON_COPPER_ORE = BLOCKS.register("moon_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_LEAD_ORE = BLOCKS.register("moon_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_TIN_ORE = BLOCKS.register("moon_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_URANIUM_ORE = BLOCKS.register("moon_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_ZINC_ORE = BLOCKS.register("moon_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Mercury Ores
    public static RegistryObject<Block> MERCURY_COPPER_ORE = BLOCKS.register("mercury_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_LEAD_ORE = BLOCKS.register("mercury_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_TIN_ORE = BLOCKS.register("mercury_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_URANIUM_ORE = BLOCKS.register("mercury_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_ZINC_ORE = BLOCKS.register("mercury_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
}
