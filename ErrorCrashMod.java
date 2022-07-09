// 
// Decompiled by Procyon v0.5.36
// 

package me.breathtaken.duperprpr;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import net.fabricmc.api.ModInitializer;

public class ErrorCrashMod implements ModInitializer
{
    public static final Logger LOGGER;
    
    public void onInitialize() {
        ErrorCrashMod.LOGGER.info("[ErrorCrashMod] Made by SaturnV5Five, Ported by breathtaken, join discord.gg/moles");
    }
    
    static {
        LOGGER = LoggerFactory.getLogger("errorcrashmod");
    }
}
