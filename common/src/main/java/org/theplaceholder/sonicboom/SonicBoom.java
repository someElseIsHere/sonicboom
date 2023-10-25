package org.theplaceholder.sonicboom;

public class SonicBoom {
    public static boolean isClothConfigPresent;

    public static void init() {
        SBConfig.register();
        isClothConfigPresent = ClothConfigCompatChecker.isClothConfigPresent();
    }
}
