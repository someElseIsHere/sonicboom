package org.theplaceholder.sonicboom;

import me.shedaniel.autoconfig.ConfigData;

@me.shedaniel.autoconfig.annotation.Config(name = "sonicboom")
public class Config implements ConfigData {
    public float explosionSpeed = 35f;
    public float explosionThresholdSpeed = 30f;
}
