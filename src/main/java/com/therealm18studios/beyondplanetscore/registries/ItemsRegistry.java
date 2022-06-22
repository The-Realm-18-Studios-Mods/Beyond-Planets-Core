package com.therealm18studios.beyondplanetscore.registries;

import com.therealm18studios.beyondplanetscore.BeyondPlanetsCore;
import com.therealm18studios.beyondplanetscore.itemgroups.ItemGroups;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BeyondPlanetsCore.MODID);

    //Building Blocks Cobalt
    public static final RegistryObject<BlockItem> COBALT_BLOCK_RAW_BLOCKITEM = ITEMS.register("cobalt_block_raw", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_RAW.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_RAW_WALLITEM = ITEMS.register("cobalt_block_raw_wall", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_RAW_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_RAW_SLABITEM = ITEMS.register("cobalt_block_raw_slab", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_RAW_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_RAW_STAIRITEM = ITEMS.register("cobalt_block_raw_stairs", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_RAW_STAIR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_COMPRESSED_BLOCKITEM = ITEMS.register("cobalt_block_compressed", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_COMPRESSED.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_COMPRESSED_WALLSITEM = ITEMS.register("cobalt_block_compressed_wall", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_COMPRESSED_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_COMPRESSED_SLABITEM = ITEMS.register("cobalt_block_compressed_slab", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_COMPRESSED_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> COBALT_BLOCK_COMPRESSED_STAIRSITEM = ITEMS.register("cobalt_block_compressed_stairs", () -> new BlockItem(BlocksRegistry.COBALT_BLOCK_COMPRESSED_STAIR.get(), new Item.Properties()));

    //Building Blocks Cobalt
    public static final RegistryObject<BlockItem> LEAD_BLOCK_RAW_BLOCKITEM = ITEMS.register("lead_block_raw", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_RAW.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_RAW_WALLITEM = ITEMS.register("lead_block_raw_wall", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_RAW_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_RAW_SLABITEM = ITEMS.register("lead_block_raw_slab", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_RAW_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_RAW_STAIRSITEM = ITEMS.register("lead_block_raw_stairs", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_RAW_STAIR.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_COMPRESSED_BLOCKITEM = ITEMS.register("lead_block_compressed", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_COMPRESSED.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_COMPRESSED_WALLITEM = ITEMS.register("lead_block_compressed_wall", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_COMPRESSED_WALL.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_COMPRESSED_SLABITEM = ITEMS.register("lead_block_compressed_slab", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_COMPRESSED_SLAB.get(), new Item.Properties()));
    public static final RegistryObject<BlockItem> LEAD_BLOCK_COMPRESSED_STAIRSITEM = ITEMS.register("lead_block_compressed_stairs", () -> new BlockItem(BlocksRegistry.LEAD_BLOCK_COMPRESSED_STAIR.get(), new Item.Properties()));

    //Raw Ores
    public static final RegistryObject<Item> RAW_LEAD_ITEM = ITEMS.register("raw_ore_lead", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_TIN_ITEM = ITEMS.register("raw_ore_tin", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_URANIUM_ITEM = ITEMS.register("raw_ore_uranium", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_ZINC_ITEM = ITEMS.register("raw_ore_zinc", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_COBALT_ITEM = ITEMS.register("raw_ore_cobalt", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));


    //Ingots
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("ingot_lead", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("ingot_tin", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("ingot_uranium", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("ingot_zinc", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("ingot_cobalt", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));

    //Mars Ores
    public static final RegistryObject<BlockItem> MARS_COPPER_ORE_ITEM = ITEMS.register("mars_copper_ore", () -> new BlockItem(BlocksRegistry.MARS_COPPER_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_LEAD_ORE_ITEM = ITEMS.register("mars_lead_ore", () -> new BlockItem(BlocksRegistry.MARS_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_TIN_ORE_ITEM = ITEMS.register("mars_tin_ore", () -> new BlockItem(BlocksRegistry.MARS_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_URANIUM_ORE_ITEM = ITEMS.register("mars_uranium_ore", () -> new BlockItem(BlocksRegistry.MARS_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_ZINC_ORE_ITEM = ITEMS.register("mars_zinc_ore", () -> new BlockItem(BlocksRegistry.MARS_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_COBALT_ORE_ITEM = ITEMS.register("mars_cobalt_ore", () -> new BlockItem(BlocksRegistry.MARS_COBALT_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_COAL_ORE_ITEM = ITEMS.register("mars_coal_ore", () -> new BlockItem(BlocksRegistry.MARS_COAL_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

    //Venus Ores
    public static final RegistryObject<BlockItem> VENUS_COPPER_ORE_ITEM = ITEMS.register("venus_copper_ore", () -> new BlockItem(BlocksRegistry.VENUS_COPPER_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_LEAD_ORE_ITEM = ITEMS.register("venus_lead_ore", () -> new BlockItem(BlocksRegistry.VENUS_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_TIN_ORE_ITEM = ITEMS.register("venus_tin_ore", () -> new BlockItem(BlocksRegistry.VENUS_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_URANIUM_ORE_ITEM = ITEMS.register("venus_uranium_ore", () -> new BlockItem(BlocksRegistry.VENUS_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_ZINC_ORE_ITEM = ITEMS.register("venus_zinc_ore", () -> new BlockItem(BlocksRegistry.VENUS_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_COBALT_ORE_ITEM = ITEMS.register("venus_cobalt_ore", () -> new BlockItem(BlocksRegistry.VENUS_COBALT_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

    //Moon Ores
    public static final RegistryObject<BlockItem> MOON_COPPER_ORE_ITEM = ITEMS.register("moon_copper_ore", () -> new BlockItem(BlocksRegistry.MOON_COPPER_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MOON_LEAD_ORE_ITEM = ITEMS.register("moon_lead_ore", () -> new BlockItem(BlocksRegistry.MOON_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MOON_TIN_ORE_ITEM = ITEMS.register("moon_tin_ore", () -> new BlockItem(BlocksRegistry.MOON_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MOON_URANIUM_ORE_ITEM = ITEMS.register("moon_uranium_ore", () -> new BlockItem(BlocksRegistry.MOON_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MOON_ZINC_ORE_ITEM = ITEMS.register("moon_zinc_ore", () -> new BlockItem(BlocksRegistry.MOON_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MOON_COBALT_ORE_ITEM = ITEMS.register("moon_cobalt_ore", () -> new BlockItem(BlocksRegistry.MOON_COBALT_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MOON_COAL_ORE_ITEM = ITEMS.register("moon_coal_ore", () -> new BlockItem(BlocksRegistry.MOON_COAL_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

    //Mercury Ores
    public static final RegistryObject<BlockItem> MERCURY_COPPER_ORE_ITEM = ITEMS.register("mercury_copper_ore", () -> new BlockItem(BlocksRegistry.MERCURY_COPPER_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MERCURY_LEAD_ORE_ITEM = ITEMS.register("mercury_lead_ore", () -> new BlockItem(BlocksRegistry.MERCURY_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MERCURY_TIN_ORE_ITEM = ITEMS.register("mercury_tin_ore", () -> new BlockItem(BlocksRegistry.MERCURY_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MERCURY_URANIUM_ORE_ITEM = ITEMS.register("mercury_uranium_ore", () -> new BlockItem(BlocksRegistry.MERCURY_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MERCURY_ZINC_ORE_ITEM = ITEMS.register("mercury_zinc_ore", () -> new BlockItem(BlocksRegistry.MERCURY_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MERCURY_COBALT_ORE_ITEM = ITEMS.register("mercury_cobalt_ore", () -> new BlockItem(BlocksRegistry.MERCURY_COBALT_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MERCURY_COAL_ORE_ITEM = ITEMS.register("mercury_coal_ore", () -> new BlockItem(BlocksRegistry.MERCURY_COAL_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

    //Glacio Ores
    public static final RegistryObject<BlockItem> GLACIO_LEAD_ORE_ITEM = ITEMS.register("glacio_lead_ore", () -> new BlockItem(BlocksRegistry.GLACIO_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> GLACIO_TIN_ORE_ITEM = ITEMS.register("glacio_tin_ore", () -> new BlockItem(BlocksRegistry.GLACIO_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> GLACIO_URANIUM_ORE_ITEM = ITEMS.register("glacio_uranium_ore", () -> new BlockItem(BlocksRegistry.GLACIO_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> GLACIO_ZINC_ORE_ITEM = ITEMS.register("glacio_zinc_ore", () -> new BlockItem(BlocksRegistry.GLACIO_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> GLACIO_COBALT_ORE_ITEM = ITEMS.register("glacio_cobalt_ore", () -> new BlockItem(BlocksRegistry.GLACIO_COBALT_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

}
