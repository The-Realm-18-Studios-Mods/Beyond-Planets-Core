package com.therealm18studios.beyondplanetscore.registries;

import com.therealm18studios.beyondplanetscore.BeyondPlanetsCore;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.mrscauthd.beyond_earth.registries.BiomesRegistry;

public class BlocksRegistry {

    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BeyondPlanetsCore.MODID);

    //Minecraft

    //Building Blocks Gold
    public static RegistryObject<Block> GOLD_BLOCK_RAW_WALL = BLOCKS.register("gold_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GOLD_BLOCK_RAW_SLAB = BLOCKS.register("gold_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GOLD_BLOCK_RAW_STAIR = BLOCKS.register("gold_block_raw_stairs", () -> { return new StairBlock(() -> Blocks.RAW_GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GOLD_BLOCK_COMPRESSED_WALL = BLOCKS.register("gold_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GOLD_BLOCK_COMPRESSED_SLAB = BLOCKS.register("gold_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GOLD_BLOCK_COMPRESSED_STAIR = BLOCKS.register("gold_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.GOLD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Iron
    public static RegistryObject<Block> IRON_BLOCK_RAW_WALL = BLOCKS.register("iron_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> IRON_BLOCK_RAW_SLAB = BLOCKS.register("iron_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> IRON_BLOCK_RAW_STAIR = BLOCKS.register("iron_block_raw_stairs", () -> { return new StairBlock(() -> Blocks.RAW_IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> IRON_BLOCK_COMPRESSED_WALL = BLOCKS.register("iron_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> IRON_BLOCK_COMPRESSED_SLAB = BLOCKS.register("iron_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> IRON_BLOCK_COMPRESSED_STAIR = BLOCKS.register("iron_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.IRON_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Lapis
    public static RegistryObject<Block> LAPIS_BLOCK_COMPRESSED_WALL = BLOCKS.register("lapis_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LAPIS_BLOCK_COMPRESSED_SLAB = BLOCKS.register("lapis_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LAPIS_BLOCK_COMPRESSED_STAIR = BLOCKS.register("lapis_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.LAPIS_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Copper
    public static RegistryObject<Block> COPPER_BLOCK_RAW_WALL = BLOCKS.register("copper_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COPPER_BLOCK_RAW_SLAB = BLOCKS.register("copper_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COPPER_BLOCK_RAW_STAIR = BLOCKS.register("copper_block_raw_stairs", () -> { return new StairBlock(() -> Blocks.RAW_COPPER_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Diamond
    public static RegistryObject<Block> DIAMOND_BLOCK_COMPRESSED_WALL = BLOCKS.register("diamond_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> DIAMOND_BLOCK_COMPRESSED_SLAB = BLOCKS.register("diamond_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> DIAMOND_BLOCK_COMPRESSED_STAIR = BLOCKS.register("diamond_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.DIAMOND_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Emerald
    public static RegistryObject<Block> EMERALD_BLOCK_COMPRESSED_WALL = BLOCKS.register("emerald_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> EMERALD_BLOCK_COMPRESSED_SLAB = BLOCKS.register("emerald_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> EMERALD_BLOCK_COMPRESSED_STAIR = BLOCKS.register("emerald_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.EMERALD_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Redstone
    public static RegistryObject<Block> REDSTONE_BLOCK_COMPRESSED_WALL = BLOCKS.register("redstone_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> REDSTONE_BLOCK_COMPRESSED_SLAB = BLOCKS.register("redstone_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> REDSTONE_BLOCK_COMPRESSED_STAIR = BLOCKS.register("redstone_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.REDSTONE_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Coal
    public static RegistryObject<Block> COAL_BLOCK_COMPRESSED_WALL = BLOCKS.register("coal_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COAL_BLOCK_COMPRESSED_SLAB = BLOCKS.register("coal_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COAL_BLOCK_COMPRESSED_STAIR = BLOCKS.register("coal_block_compressed_stairs", () -> { return new StairBlock(() -> Blocks.COAL_BLOCK.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});


    //Beyond Planets - Core

    //Building Blocks Cobalt
    public static RegistryObject<Block> COBALT_BLOCK_RAW = BLOCKS.register("cobalt_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_RAW_WALL = BLOCKS.register("cobalt_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_RAW_SLAB = BLOCKS.register("cobalt_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_RAW_STAIR = BLOCKS.register("cobalt_block_raw_stairs", () -> { return new StairBlock(() -> COBALT_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_COMPRESSED = BLOCKS.register("cobalt_block_compressed", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_COMPRESSED_WALL = BLOCKS.register("cobalt_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_COMPRESSED_SLAB = BLOCKS.register("cobalt_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> COBALT_BLOCK_COMPRESSED_STAIR = BLOCKS.register("cobalt_block_compressed_stairs", () -> { return new StairBlock(() -> COBALT_BLOCK_COMPRESSED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Lead
    public static RegistryObject<Block> LEAD_BLOCK_RAW = BLOCKS.register("lead_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_RAW_WALL = BLOCKS.register("lead_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_RAW_SLAB = BLOCKS.register("lead_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_RAW_STAIR = BLOCKS.register("lead_block_raw_stairs", () -> { return new StairBlock(() -> LEAD_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_COMPRESSED = BLOCKS.register("lead_block_compressed", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_COMPRESSED_WALL = BLOCKS.register("lead_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_COMPRESSED_SLAB = BLOCKS.register("lead_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> LEAD_BLOCK_COMPRESSED_STAIR = BLOCKS.register("lead_block_compressed_stairs", () -> { return new StairBlock(() -> LEAD_BLOCK_COMPRESSED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Tin
    public static RegistryObject<Block> TIN_BLOCK_RAW = BLOCKS.register("tin_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_RAW_WALL = BLOCKS.register("tin_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_RAW_SLAB = BLOCKS.register("tin_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_RAW_STAIR = BLOCKS.register("tin_block_raw_stairs", () -> { return new StairBlock(() -> TIN_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_COMPRESSED = BLOCKS.register("tin_block_compressed", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_COMPRESSED_WALL = BLOCKS.register("tin_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_COMPRESSED_SLAB = BLOCKS.register("tin_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> TIN_BLOCK_COMPRESSED_STAIR = BLOCKS.register("tin_block_compressed_stairs", () -> { return new StairBlock(() -> TIN_BLOCK_COMPRESSED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    
    //Building Blocks Uranium
    public static RegistryObject<Block> URANIUM_BLOCK_RAW = BLOCKS.register("uranium_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_RAW_WALL = BLOCKS.register("uranium_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_RAW_SLAB = BLOCKS.register("uranium_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_RAW_STAIR = BLOCKS.register("uranium_block_raw_stairs", () -> { return new StairBlock(() -> URANIUM_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_COMPRESSED = BLOCKS.register("uranium_block_compressed", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_COMPRESSED_WALL = BLOCKS.register("uranium_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_COMPRESSED_SLAB = BLOCKS.register("uranium_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> URANIUM_BLOCK_COMPRESSED_STAIR = BLOCKS.register("uranium_block_compressed_stairs", () -> { return new StairBlock(() -> URANIUM_BLOCK_COMPRESSED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Building Blocks Zinc
    public static RegistryObject<Block> ZINC_BLOCK_RAW = BLOCKS.register("zinc_block_raw", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_RAW_WALL = BLOCKS.register("zinc_block_raw_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_RAW_SLAB = BLOCKS.register("zinc_block_raw_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_RAW_STAIR = BLOCKS.register("zinc_block_raw_stairs", () -> { return new StairBlock(() -> ZINC_BLOCK_RAW.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_COMPRESSED = BLOCKS.register("zinc_block_compressed", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_COMPRESSED_WALL = BLOCKS.register("zinc_block_compressed_wall", () -> { return new WallBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_COMPRESSED_SLAB = BLOCKS.register("zinc_block_compressed_slab", () -> { return new SlabBlock(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> ZINC_BLOCK_COMPRESSED_STAIR = BLOCKS.register("zinc_block_compressed_stairs", () -> { return new StairBlock(() -> ZINC_BLOCK_COMPRESSED.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Mars Ores
    public static RegistryObject<Block> MARS_COPPER_ORE = BLOCKS.register("mars_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_LEAD_ORE = BLOCKS.register("mars_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_TIN_ORE = BLOCKS.register("mars_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_URANIUM_ORE = BLOCKS.register("mars_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_ZINC_ORE = BLOCKS.register("mars_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_COBALT_ORE = BLOCKS.register("mars_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MARS_COAL_ORE = BLOCKS.register("mars_coal_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Venus Ores
    public static RegistryObject<Block> VENUS_COPPER_ORE = BLOCKS.register("venus_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_LEAD_ORE = BLOCKS.register("venus_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_TIN_ORE = BLOCKS.register("venus_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_URANIUM_ORE = BLOCKS.register("venus_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_ZINC_ORE = BLOCKS.register("venus_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> VENUS_COBALT_ORE = BLOCKS.register("venus_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Moon Ores
    public static RegistryObject<Block> MOON_COPPER_ORE = BLOCKS.register("moon_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_LEAD_ORE = BLOCKS.register("moon_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_TIN_ORE = BLOCKS.register("moon_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_URANIUM_ORE = BLOCKS.register("moon_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_ZINC_ORE = BLOCKS.register("moon_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_COBALT_ORE = BLOCKS.register("moon_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MOON_COAL_ORE = BLOCKS.register("moon_coal_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Mercury Ores
    public static RegistryObject<Block> MERCURY_COPPER_ORE = BLOCKS.register("mercury_copper_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_LEAD_ORE = BLOCKS.register("mercury_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_TIN_ORE = BLOCKS.register("mercury_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_URANIUM_ORE = BLOCKS.register("mercury_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_ZINC_ORE = BLOCKS.register("mercury_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_COBALT_ORE = BLOCKS.register("mercury_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> MERCURY_COAL_ORE = BLOCKS.register("mercury_coal_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});

    //Glacio Ores
    public static RegistryObject<Block> GLACIO_LEAD_ORE = BLOCKS.register("glacio_lead_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_TIN_ORE = BLOCKS.register("glacio_tin_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_URANIUM_ORE = BLOCKS.register("glacio_uranium_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_ZINC_ORE = BLOCKS.register("glacio_zinc_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
    public static RegistryObject<Block> GLACIO_COBALT_ORE = BLOCKS.register("glacio_cobalt_ore", () -> { return new Block(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.STONE).strength(5f, 1f).requiresCorrectToolForDrops());});
}
