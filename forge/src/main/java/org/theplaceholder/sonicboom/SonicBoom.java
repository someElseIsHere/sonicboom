package org.theplaceholder.sonicboom;

import net.minecraftforge.fml.common.Mod;
import org.theplaceholder.sonicboom.config.Config;

@Mod("sonicboom")
public class SonicBoom {
    public SonicBoom() {
        Config.register();
    }
}
