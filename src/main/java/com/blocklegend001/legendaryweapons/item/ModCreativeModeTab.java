package com.blocklegend001.legendaryweapons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LEGENDARYWEAPONS_TAB = new CreativeModeTab("legendaryweaponstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.MJOLLNIR.get());
        }
    };
}
