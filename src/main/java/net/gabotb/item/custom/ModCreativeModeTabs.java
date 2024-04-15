package net.gabotb.item.custom;

import net.gabotb.PrehistoricKingdom;
import net.gabotb.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PrehistoricKingdom.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PREHISTORIC_KINGDOM = CREATIVE_MODE_TABS.register("prehistoric_kingdom",
    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DINOBONE.get()))
            .title(Component.translatable("creativetab.prehistoric_kingdom"))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(ModItems.DINOBONE.get());
                output.accept(ModItems.DINOSKIN.get());
                output.accept(ModBlocks.RAW_DINO_BEEF.get());
                output.accept(ModItems.DINO_NUGGET.get());
            })
            .build());
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
