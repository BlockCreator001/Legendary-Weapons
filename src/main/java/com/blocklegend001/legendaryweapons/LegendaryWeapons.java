package com.blocklegend001.legendaryweapons;

import com.blocklegend001.legendaryweapons.item.ModItems;
import com.blocklegend001.legendaryweapons.utils.LegendaryWeaponsModEntities;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(LegendaryWeapons.MOD_ID)
public class LegendaryWeapons
{
    private static final Logger LOGGER = LogManager.getLogger();

    public static final String MOD_ID = "legendaryweapons";

    public LegendaryWeapons() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);

        LegendaryWeaponsModEntities.REGISTRY.register(eventBus);

        eventBus.addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);

    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }

}
