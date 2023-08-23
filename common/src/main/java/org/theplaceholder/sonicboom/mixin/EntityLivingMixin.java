package org.theplaceholder.sonicboom.mixin;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.theplaceholder.sonicboom.Utils;
import org.theplaceholder.sonicboom.interfaces.IEntity;

@Mixin(LivingEntity.class)
public abstract class EntityLivingMixin extends Entity implements IEntity {
    public EntityLivingMixin(EntityType<?> type, Level level) {
        super(type, level);
    }
    private Vec3 lastPos;
    public boolean isSonic = false;
    @Override
    public Vec3 getLastPos() {
        return lastPos;
    }
    @Inject(at = @At("HEAD"), method = "aiStep()V")
    public void aiStep(CallbackInfo info) {
        lastPos = this.position();
    }
    @Inject(at = @At("HEAD"), method = "tick()V")
    public void tick(CallbackInfo info) {
        if(!this.level().isClientSide) return;

        if(lastPos == null) lastPos = this.position();
        if(!isSonic && Utils.getSpeed(this) > 35){
            Utils.explode(this);
            isSonic = true;
        }
        if(Utils.getSpeed(this) < 30)
            isSonic = false;
    }
}
