package org.theplaceholder.sonicboom.config.fabric;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;
import org.theplaceholder.sonicboom.config.SBConfig;

public class ConfigImpl {
    public static void register() {
        AutoConfig.register(SBConfig.class, GsonConfigSerializer::new);
    }

    public static float getExplosionSpeed() {
        return AutoConfig.getConfigHolder(SBConfig.class).getConfig().explosionSpeed;
    }

    public static float getExplosionThresholdSpeed() {
        return AutoConfig.getConfigHolder(SBConfig.class).getConfig().explosionThresholdSpeed;
    }
}
