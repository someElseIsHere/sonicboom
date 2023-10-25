package org.theplaceholder.sonicboom;

public class SonicBoom {
    public static boolean isClothConfigPresent;

    public static void init() {
        isClothConfigPresent = ClothConfigCompatChecker.isClothConfigPresent();
        if(isClothConfigPresent)
            SBConfig.register();
    }
}
