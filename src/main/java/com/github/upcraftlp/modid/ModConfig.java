package mod.upcraftlp.modid;

import com.google.common.collect.Maps;
import net.minecraft.item.EnumDyeColor;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.Map;

import static mod.upcraftlp.modid.Reference.MODID;

/**
 * @author UpcraftLP
 */
@Config(modid = MODID, name = "craftdevmods/" + MODID) //--> /config/craftdevmods/modid.cfg
public class ModConfig {

    public static class Handler {

        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if(event.getModID().equals(Reference.MODID)) {
                ConfigManager.load(Reference.MODID, Config.Type.INSTANCE);
            }
        }
    }
    
}
