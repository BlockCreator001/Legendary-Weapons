package com.blocklegend001.legendaryweapons.item.custom;

import com.blocklegend001.legendaryweapons.procedures.ExcaliburEffettiProcedure;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;

import static com.blocklegend001.legendaryweapons.item.ModCreativeModeTab.LEGENDARYWEAPONS_TAB;

public class Excalibur extends SwordItem {
    public Excalibur() {
        super(new Tier() {
                  public int getUses() {
                      return 0;
                  }

                  public float getSpeed() {
                      return 2f;
                  }

                  public float getAttackDamageBonus() {
                      return 35;
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
              },

                3, -3f,

                new Properties().tab(LEGENDARYWEAPONS_TAB).fireResistant());
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(itemstack, world, entity, slot, selected);
        if (selected)
            ExcaliburEffettiProcedure.execute(entity);
    }
}
