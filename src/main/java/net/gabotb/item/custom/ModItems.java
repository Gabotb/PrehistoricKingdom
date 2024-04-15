package net.gabotb.item.custom;

import net.gabotb.PrehistoricKingdom;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PrehistoricKingdom.MOD_ID);

public static final RegistryObject<Item> DINOBONE = ITEMS.register("dinobone",
        ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DINOSKIN = ITEMS.register("dinoskin",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DINO_NUGGET = ITEMS.register("dino_nugget",
            ()-> new Item(new Item.Properties().food(ModFoods.DINO_NUGGET)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
