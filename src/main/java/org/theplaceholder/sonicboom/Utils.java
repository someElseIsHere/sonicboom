package org.theplaceholder.sonicboom;

import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import org.theplaceholder.sonicboom.interfaces.IEntity;

public class Utils {
    public static double getSpeed(Entity entity){
        return ((IEntity)entity).getLastPos().distanceTo(entity.getPositionVec()) * 20 * 1;
    }

    public static void explode(Entity entity){
            ClientWorld world = (ClientWorld) entity.world;

            world.addParticle(ParticleTypes.EXPLOSION_EMITTER, entity.getPosX(), entity.getPosZ(), entity.getPosZ(), 1.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.EXPLOSION, entity.getPosX(), entity.getPosZ(), entity.getPosZ(), 1.0D, 0.0D, 0.0D);
            world.playSound(Minecraft.getInstance().player, entity.getPosition(), SoundEvents.ENTITY_GENERIC_EXPLODE, SoundCategory.PLAYERS, 4.0F, 1);
    }
}