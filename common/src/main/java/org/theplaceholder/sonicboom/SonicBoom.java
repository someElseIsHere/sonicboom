package org.theplaceholder.sonicboom;

public class SonicBoom {
    public static float EXPLOSION_SPEED = 35f;
    public static float EXPLOSION_THRESHOLD_SPEED = 30f;

    public static void init() {
        if(isClothConfigPresent())
            SBConfig.register();
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
