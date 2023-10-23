package org.theplaceholder.sonicboom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import org.theplaceholder.sonicboom.interfaces.IPlayer;

public class Utils {
    public static double getSpeed(Entity entity){
        return ((IPlayer)entity).getLastPos().distanceTo(entity.position()) * 20 * 1;
    }

    public static void explode(Entity entity){
        Level level = entity.level();
        level.addParticle(ParticleTypes.EXPLOSION_EMITTER, entity.getX(), entity.getY(), entity.getZ(), 1.0D, 0.0D, 0.0D);
        level.addParticle(ParticleTypes.EXPLOSION, entity.getX(), entity.getY(), entity.getZ(), 1.0D, 0.0D, 0.0D);
        level.playLocalSound(entity.blockPosition(), SoundEvents.GENERIC_EXPLODE, SoundSource.PLAYERS,4.0F, 1, false);
    }
}
