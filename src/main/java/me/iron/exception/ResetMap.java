package me.iron.exception;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ResetMap.MODID, version = ResetMap.VERSION, dependencies = "required-after:journeymap@1.12.2-5.5.5", clientSideOnly = true)
public class ResetMap {
    public static final String MODID = "resetmap";
    public static final String VERSION = "@VERSION@";
    public static Logger LOGGER;

    @Mod.Instance(ResetMap.MODID)
    public static ResetMap instance;

    public ResetMap(){
        instance = this;
    }

    @Mod.EventHandler
    public void preInit(final FMLPreInitializationEvent event) {
        LOGGER = event.getModLog();
        MinecraftForge.EVENT_BUS.register(this);

        LOGGER.info("ResetMap preInit done");
    }

    @Mod.EventHandler
    public void init(final FMLInitializationEvent event) {

        LOGGER.info("ResetMap init done");
    }

    @Mod.EventHandler
    public void postInit(final FMLPostInitializationEvent event) {
        LOGGER.info("ResetMap postInit done");
    }


}
