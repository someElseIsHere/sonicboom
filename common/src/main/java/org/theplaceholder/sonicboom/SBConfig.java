package org.theplaceholder.sonicboom;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name = "sonicboom")
public class SBConfig implements ConfigData {
    public static void register() {
        AutoConfig.register(SBConfig.class, GsonConfigSerializer::new);
    }

    public static float getExplosionSpeed() {
        return AutoConfig.getConfigHolder(SBConfig.class).getConfig().explosionSpeed;
    }

    public static float getExplosionThresholdSpeed() {
        return AutoConfig.getConfigHolder(SBConfig.class).getConfig().explosionThresholdSpeed;
    }

    public float explosionSpeed = 35f;
    public float explosionThresholdSpeed = 30f;
}
