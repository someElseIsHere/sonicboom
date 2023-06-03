package org.theplaceholder.sonicboom.mixin;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.theplaceholder.sonicboom.Utils;
import org.theplaceholder.sonicboom.interfaces.IEntity;

@Mixin(LivingEntity.class)
public abstract class EntityLivingMixin extends Entity implements IEntity {

    public EntityLivingMixin(EntityType<?> entityTypeIn, World worldIn) {
        super(entityTypeIn, worldIn);
    }

    private Vector3d lastPos;
    public boolean isSonic = false;

    @Override
    public Vector3d getLastPos() {
        return lastPos;
    }

    @Inject(at = @At("HEAD"), method = "livingTick()V")
    public void aiStep(CallbackInfo info) {
        lastPos = this.getPositionVec();
    }

    @Inject(at = @At("HEAD"), method = "tick()V")
    public void tick(CallbackInfo info) {
        if (lastPos == null) return;

        if (this.world.isRemote) {
            if (!isSonic && Utils.getSpeed(this) > 50) {
                Utils.explode(this);
                isSonic = true;
            }
            if (Utils.getSpeed(this) < 1)
                isSonic = false;
        }
    }
}
