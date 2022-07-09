package com.blocklegend001.legendaryweapons.item.custom;

import com.blocklegend001.legendaryweapons.LegendaryWeapons;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import com.blocklegend001.legendaryweapons.item.ModCreativeModeTab;
import com.blocklegend001.legendaryweapons.item.custom.FireballstaffEntity;

import static com.blocklegend001.legendaryweapons.item.ModCreativeModeTab.LEGENDARYWEAPONS_TAB;

public class FireballstaffItem extends Item {
    public FireballstaffItem() {
        super(new Item.Properties().tab(LEGENDARYWEAPONS_TAB).durability(0));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    @Override
    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    @Override
    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (true) {
                FireballstaffEntity entityarrow = FireballstaffEntity.shoot(world, entity, world.getRandom(), 1f, 5, 5);
                itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
            }
        }
    }
}

