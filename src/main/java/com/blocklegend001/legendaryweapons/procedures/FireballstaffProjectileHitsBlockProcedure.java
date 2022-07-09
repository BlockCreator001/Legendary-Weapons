package com.blocklegend001.legendaryweapons.procedures;

import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

public class FireballstaffProjectileHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level && !_level.isClientSide())
            _level.explode(null, x, y, z, 8, Explosion.BlockInteraction.DESTROY);
    }
}
