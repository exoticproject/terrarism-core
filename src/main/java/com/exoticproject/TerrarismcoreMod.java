package com.exoticproject;

import com.exoticproject.common.CommonProxy;
import gregtech.api.GTValues;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;
@Mod(modid = "terrarismcore",
        name = "Terrarism-Core",
        acceptedMinecraftVersions = "[1.12]",
        dependencies = GTValues.MOD_VERSION_DEP)
public class TerrarismcoreMod {

    @SidedProxy(modId = "terrarismcore", clientSide = "com.exoticproject.client.ClientProxy", serverSide = "com.exoticproject.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TerrarismcoreMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}