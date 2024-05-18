package net.gabotb.event;

import net.gabotb.PrehistoricKingdom;
import net.gabotb.entity.ModEntities;
import net.gabotb.entity.custom.DodoEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = PrehistoricKingdom.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.DODO.get(), DodoEntity.createAttributes().build());
    }
}