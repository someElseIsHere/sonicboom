package org.theplaceholder.sonicboom.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;

@Config(name = "sonicboom")
public class SBConfig implements ConfigData {
    public float explosionSpeed = 35f;
    public float explosionThresholdSpeed = 30f;
}
