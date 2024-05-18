package net.gabotb.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.gabotb.PrehistoricKingdom;
import net.gabotb.entity.custom.DodoEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class DodoRenderer extends MobRenderer<DodoEntity, DodoModel<DodoEntity>> {
    public DodoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DodoModel<>(pContext.bakeLayer(ModModelLayers.DODO_LAYER)),1f);
    }

    @Override
    public ResourceLocation getTextureLocation(DodoEntity dodoEntity) {
        return new ResourceLocation(PrehistoricKingdom.MOD_ID, "textures/entity/dodo.png");
    }
        @Override
        public void render(DodoEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                           MultiBufferSource pBuffer, int pPackedLight) {
            if(pEntity.isBaby()) {
                pMatrixStack.scale(0.5f, 0.5f, 0.5f);
            }

            super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
        }
    }