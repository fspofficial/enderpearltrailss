package com.syanicxd.enderpearltrailss.mixin;

import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EnderPearlEntity.class)
public class EnderPearlEntityMixin {

    @Inject(method = "tick", at = @At("TAIL"))
    private void addParticleTrail(CallbackInfo ci) {
        EnderPearlEntity enderPearl = (EnderPearlEntity) (Object) this;
        World world = enderPearl.getWorld();
        if (world.isClient) {
            double x = enderPearl.getX();
            double y = enderPearl.getY();
            double z = enderPearl.getZ();
            
            for (int i = 0; i < 5; i++) {
                world.addParticle(ParticleTypes.PORTAL,
                    x + (world.random.nextDouble() - 0.5) * 0.1,
                    y + (world.random.nextDouble() - 0.5) * 0.1,
                    z + (world.random.nextDouble() - 0.5) * 0.1,
                    0, 0, 0);
            }
        }
    }
}