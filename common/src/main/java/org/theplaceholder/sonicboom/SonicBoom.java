package org.theplaceholder.sonicboom;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

public class SonicBoom {
    public static boolean isClothConfigPresent;
    public static float explosionSpeed = 35f;
    public static float explosionThresholdSpeed = 30f;

    public static void init() {
        isClothConfigPresent = isClothConfigPresent();
        if(!isClothConfigPresent)
            return;

        AutoConfig.register(Config.class, GsonConfigSerializer::new);
        Config config = AutoConfig.getConfigHolder(Config.class).getConfig();
        explosionSpeed = config.explosionSpeed;
        explosionThresholdSpeed = config.explosionThresholdSpeed;
    }

    public static boolean isClothConfigPresent() {
        try {
            Class.forName("me.shedaniel.autoconfig.AutoConfig");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
