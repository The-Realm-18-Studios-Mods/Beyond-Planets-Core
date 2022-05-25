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

//    //Decoration Blocks Todo
//    public static final RegistryObject<BlockItem> BLOCK1ITEM = ITEMS.register("block1", () -> new BlockItem(BlocksRegistry.BLOCK1.get(), new Item.Properties()));
//    public static final RegistryObject<BlockItem> WALL1ITEM = ITEMS.register("wall1", () -> new BlockItem(BlocksRegistry.WALL1.get(), new Item.Properties()));
//    public static final RegistryObject<BlockItem> SLAB1ITEM = ITEMS.register("slab1", () -> new BlockItem(BlocksRegistry.SLAB1.get(), new Item.Properties()));
//    public static final RegistryObject<BlockItem> STAIR1ITEM = ITEMS.register("stair1", () -> new BlockItem(BlocksRegistry.STAIR1.get(), new Item.Properties()));

    //Raw Ores
    public static final RegistryObject<Item> RAW_LEAD_ITEM = ITEMS.register("raw_lead_ore", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_TIN_ITEM = ITEMS.register("raw_tin_ore", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_URANIUM_ITEM = ITEMS.register("raw_uranium_ore", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> RAW_ZINC_ITEM = ITEMS.register("raw_zinc_ore", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));


    //Ingots
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));
    public static final RegistryObject<Item> ZINC_INOGT = ITEMS.register("zinc_ingot", () -> new Item(new Item.Properties().tab(ItemGroups.TAB_ITEMS)));

    //Mars Ores
    public static final RegistryObject<BlockItem> MARS_COPPER_ORE_ITEM = ITEMS.register("mars_copper_ore", () -> new BlockItem(BlocksRegistry.MARS_COPPER_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_LEAD_ORE_ITEM = ITEMS.register("mars_lead_ore", () -> new BlockItem(BlocksRegistry.MARS_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_TIN_ORE_ITEM = ITEMS.register("mars_tin_ore", () -> new BlockItem(BlocksRegistry.MARS_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_URANIUM_ORE_ITEM = ITEMS.register("mars_uranium_ore", () -> new BlockItem(BlocksRegistry.MARS_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> MARS_ZINC_ORE_ITEM = ITEMS.register("mars_zinc_ore", () -> new BlockItem(BlocksRegistry.MARS_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

    //Venus Ores
    public static final RegistryObject<BlockItem> VENUS_COPPER_ORE_ITEM = ITEMS.register("venus_copper_ore", () -> new BlockItem(BlocksRegistry.VENUS_COPPER_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_LEAD_ORE_ITEM = ITEMS.register("venus_lead_ore", () -> new BlockItem(BlocksRegistry.VENUS_LEAD_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_TIN_ORE_ITEM = ITEMS.register("venus_tin_ore", () -> new BlockItem(BlocksRegistry.VENUS_TIN_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_URANIUM_ORE_ITEM = ITEMS.register("venus_uranium_ore", () -> new BlockItem(BlocksRegistry.VENUS_URANIUM_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));
    public static final RegistryObject<BlockItem> VENUS_ZINC_ORE_ITEM = ITEMS.register("venus_zinc_ore", () -> new BlockItem(BlocksRegistry.VENUS_ZINC_ORE.get(), new Item.Properties().tab(ItemGroups.TAB_ORES)));

}
