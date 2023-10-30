package org.theplaceholder.sonicboom;

public class SonicBoom {
    public static float explosionSpeed = 35f;
    public static float explosionThresholdSpeed = 30f;

    public static void init() {
        if(isClothConfigPresent())
            Config.register();
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
