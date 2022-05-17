package com.therealm18.beyondplanetscore.itemgroups;

import com.therealm18.beyondplanetscore.registries.ItemsRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

public class ItemGroups {

    public static CreativeModeTab TAB_ORES = new CreativeModeTab("beyond_planets_core.tab_ores") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.MARS_COPPER_ORE_ITEM.get(), 1);
        }
    };
    public static CreativeModeTab TAB_ITEMS = new CreativeModeTab("beyond_planets_core.tab_items") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.RAW_LEAD_ITEM.get(), 1);
        }
    };
    public static CreativeModeTab TAB_BUILDING_BLOCKS = new CreativeModeTab("beyond_planets_core.tab_building_blocks") {
        @OnlyIn(Dist.CLIENT)
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ItemsRegistry.RAW_TIN_ITEM.get(), 1);
        }
    };
}