package org.theplaceholder.sonicboom.config;

import dev.architectury.injectables.annotations.ExpectPlatform;

public class Config {
    @ExpectPlatform
    public static void register() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static float getExplosionSpeed() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static float getExplosionThresholdSpeed() {
        throw new AssertionError();
    }
}
