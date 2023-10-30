package org.theplaceholder.sonicboom;

import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@me.shedaniel.autoconfig.annotation.Config(name = "sonicboom")
public class Config implements ConfigData {
    public float explosionSpeed = 35f;
    public float explosionThresholdSpeed = 30f;
    
    public static void register(){
        AutoConfig.register(Config.class, GsonConfigSerializer::new);
        Config config = AutoConfig.getConfigHolder(Config.class).getConfig();
        SonicBoom.explosionSpeed = config.explosionSpeed;
        SonicBoom.explosionThresholdSpeed = config.explosionThresholdSpeed;
    
    }
    
}
