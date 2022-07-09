package com.blocklegend001.legendaryweapons.item;

import com.blocklegend001.legendaryweapons.LegendaryWeapons;
import com.blocklegend001.legendaryweapons.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LegendaryWeapons.MOD_ID);

    public static final RegistryObject<Item> MJOLLNIR = ITEMS.register("mjolnir", () -> new MjolnirItem());

    public static final RegistryObject<Item> FLAMINGSWORD = ITEMS.register("flamingsword", () -> new FlamingSword());

    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur", () -> new Excalibur());

    public static final RegistryObject<Item> BATTLEAXE = ITEMS.register("battleaxe", () -> new Battleaxe());

    public static final RegistryObject<Item> FIREBALLSTAFFITEM = ITEMS.register("fireballstaffitem", () -> new FireballstaffItem());

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}