package com.blocklegend001.legendaryweapons.procedures;

import net.minecraft.world.entity.Entity;

public class FlamingSwordLivingEntityIsHitWithToolProcedure {
    public static void execute(Entity entity) {
        if (entity == null)
            return;
        entity.setSecondsOnFire(60);
    }
}
