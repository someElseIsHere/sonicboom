package org.theplaceholder.sonicboom;

public class ClothConfigCompatChecker {
    public static boolean isClothConfigPresent() {
        try {
            Class.forName("me.shedaniel.autoconfig.AutoConfig");
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}