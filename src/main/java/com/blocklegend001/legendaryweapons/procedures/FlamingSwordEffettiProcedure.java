package com.blocklegend001.legendaryweapons.procedures;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;

public class FlamingSwordEffettiProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        if (entity instanceof LivingEntity _entity)
            _entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1, 2));
        if (entity instanceof LivingEntity _entity)
            _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 1, 2));
        if (entity instanceof LivingEntity _entity)
            _entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 1, 2));
    }
}
