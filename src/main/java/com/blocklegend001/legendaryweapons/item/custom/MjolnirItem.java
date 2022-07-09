package com.blocklegend001.legendaryweapons.item.custom;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import com.blocklegend001.legendaryweapons.procedures.MjolnirLightningBoltProcedure;
import com.blocklegend001.legendaryweapons.procedures.MjolnirEffettiProcedure;

import static com.blocklegend001.legendaryweapons.item.ModCreativeModeTab.LEGENDARYWEAPONS_TAB;

public class MjolnirItem extends SwordItem {
    public MjolnirItem() {
        super(new Tier() {
            public int getUses() {
                return 0;
            }

            public float getSpeed() {
                return 9f;
            }

            public float getAttackDamageBonus() {
                return 40f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 14;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }
        }, 3, -3f, new Item.Properties().tab(LEGENDARYWEAPONS_TAB).fireResistant());
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
        MjolnirLightningBoltProcedure.execute(world, entity, ar.getObject());
        return ar;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected)
            MjolnirEffettiProcedure.execute(entity);
    }
}

