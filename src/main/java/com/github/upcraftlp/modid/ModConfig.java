package com.github.upcraftlp.modid;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static com.github.upcraftlp.modid.Reference.MODID;

/**
 * @author UpcraftLP
 */
@Config(modid = MODID, name = "craftdevmods/" + MODID) //--> /config/craftdevmods/modid.cfg
public class ModConfig {

    @Mod.EventBusSubscriber(modid = MODID)
    public static class Handler {

        @SubscribeEvent
        public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
            if(event.getModID().equals(Reference.MODID)) {
                ConfigManager.load(Reference.MODID, Config.Type.INSTANCE);
            }
        }
    }
    
}
