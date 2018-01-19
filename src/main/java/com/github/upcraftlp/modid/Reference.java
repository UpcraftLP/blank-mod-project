package com.github.upcraftlp.modid;

import net.minecraft.util.text.TextFormatting;

import java.time.Year;

public class Reference {

    //Version
    public static final String MCVERSIONS = "[1.12, 1.13)";
    public static final String VERSION = "@VERSION@";

    //Misc
    public static final String CREDITS = TextFormatting.GOLD + "\u00A9 " + "2018-" + Year.now().getValue() + " UpcraftLP";

    //Meta Information
    public static final String MODNAME = "MOD NAME";
    public static final String MODID = "modid";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.1.2555,)";
    public static final String UPDATE_JSON = "@UPDATE_JSON@";

    public static final String FINGERPRINT_KEY = "@FINGERPRINTKEY@";
    
    //Proxies
    public static final String CLIENT_PROXY = "com.github.upcraftlp.modid.proxy.ClientProxy";
    public static final String SERVER_PROXY = "com.github.upcraftlp.modid.proxy.ServerProxy";
}
