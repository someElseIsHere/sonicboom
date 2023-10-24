package org.theplaceholder.sonicboom;

import net.fabricmc.api.ModInitializer;
import org.theplaceholder.sonicboom.config.Config;

public class SonicBoom implements ModInitializer {
    @Override
    public void onInitialize() {
        Config.register();
    }
}
