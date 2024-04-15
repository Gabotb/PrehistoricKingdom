package net.gabotb.entity.client;// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gabotb.entity.animations.ModAnimationDefinitions;
import net.gabotb.entity.custom.DodoEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

import static net.minecraft.util.Mth.clamp;

public class DodoModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "dodomodel"), "main");
	private final ModelPart Dodo;
	private final ModelPart head;

	public DodoModel(ModelPart root) {
		this.Dodo = root.getChild("Dodo");
		this.head = Dodo.getChild("Cabeza");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Dodo = partdefinition.addOrReplaceChild("Dodo", CubeListBuilder.create(), PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition Cabeza = Dodo.addOrReplaceChild("Cabeza", CubeListBuilder.create(), PartPose.offset(0.0F, -9.0F, -5.0F));

		PartDefinition cube_r1 = Cabeza.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(25, 37).addBox(-2.5F, -3.5F, -2.5F, 6.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Cuello = Cabeza.addOrReplaceChild("Cuello", CubeListBuilder.create(), PartPose.offset(0.0F, 4.8889F, 0.5F));

		PartDefinition cube_r2 = Cuello.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 22).addBox(-4.5F, -3.0F, -3.5F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.6111F, -2.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cuell = Cuello.addOrReplaceChild("cuell", CubeListBuilder.create(), PartPose.offset(-0.1667F, 0.4812F, -2.0534F));

		PartDefinition cube_r3 = cuell.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(-1.401F, -0.7819F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6667F, 2.1797F, -0.3642F, 1.5708F, 0.9163F, 1.5708F));

		PartDefinition cube_r4 = cuell.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 1).addBox(-2.2596F, -2.232F, 0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6667F, 2.1797F, -0.3642F, 1.5708F, 1.0908F, 1.5708F));

		PartDefinition cube_r5 = cuell.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 2).addBox(-1.5F, -1.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.3333F, 0.9505F, -0.4659F, 1.5708F, 1.0908F, 1.5708F));

		PartDefinition Boca = Cabeza.addOrReplaceChild("Boca", CubeListBuilder.create(), PartPose.offset(0.0F, 1.0F, -6.0F));

		PartDefinition Sup = Boca.addOrReplaceChild("Sup", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 11.0F));

		PartDefinition cube_r6 = Sup.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 0).addBox(11.0F, -10.5F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = Sup.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(31, 1).addBox(-2.5F, 0.5F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.5F, -11.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Inf = Boca.addOrReplaceChild("Inf", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, 11.0F));

		PartDefinition cube_r8 = Inf.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(17, 34).addBox(11.0F, -8.5F, -1.5F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r9 = Inf.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(19, 18).addBox(8.0F, -8.5F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cabe = Cabeza.addOrReplaceChild("cabe", CubeListBuilder.create(), PartPose.offset(0.1333F, -2.6749F, 0.5303F));

		PartDefinition cube_r10 = cabe.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 46).addBox(11.7F, 5.3F, 1.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 46).addBox(11.1F, 4.6F, 0.3F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(2, 46).addBox(11.8F, 5.6F, -1.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6333F, 4.6749F, 11.9697F, -1.5708F, 0.7418F, -1.5708F));

		PartDefinition Ojos = Cabeza.addOrReplaceChild("Ojos", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -3.01F));

		PartDefinition OjoIzq = Ojos.addOrReplaceChild("OjoIzq", CubeListBuilder.create(), PartPose.offset(2.0F, 0.0F, 0.01F));

		PartDefinition a2 = OjoIzq.addOrReplaceChild("a2", CubeListBuilder.create().texOffs(8, 47).addBox(1.5F, -18.5F, -8.501F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.0F, 8.0F));

		PartDefinition b2 = OjoIzq.addOrReplaceChild("b2", CubeListBuilder.create().texOffs(7, 46).addBox(2.501F, -18.5F, -8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 18.0F, 8.0F));

		PartDefinition OjoDer = Ojos.addOrReplaceChild("OjoDer", CubeListBuilder.create(), PartPose.offset(-2.25F, 0.0F, -0.24F));

		PartDefinition a = OjoDer.addOrReplaceChild("a", CubeListBuilder.create().texOffs(13, 47).addBox(-0.5F, -0.5F, -0.001F, 1.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.25F, 0.0F, -0.25F));

		PartDefinition b = OjoDer.addOrReplaceChild("b", CubeListBuilder.create().texOffs(11, 46).addBox(-2.501F, -18.5F, -8.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(2.25F, 18.0F, 8.25F));

		PartDefinition ManoIzq = Dodo.addOrReplaceChild("ManoIzq", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r11 = ManoIzq.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(27, 34).addBox(-3.0F, -2.0F, -6.0F, 2.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(0, 32).addBox(-1.0F, -2.0F, -6.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition PataDer = Dodo.addOrReplaceChild("PataDer", CubeListBuilder.create(), PartPose.offset(3.5F, 8.0F, -1.625F));

		PartDefinition cube_r12 = PataDer.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(18, 47).addBox(-2.0F, 8.0F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 9).addBox(1.0F, 8.0F, 5.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 22).addBox(1.0F, 8.0F, 3.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(22, 22).addBox(1.0F, 8.0F, 1.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5F, -8.0F, 1.625F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r13 = PataDer.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 0).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.125F, 0.0F, 1.5708F, 0.0F));

		PartDefinition PataIzq = Dodo.addOrReplaceChild("PataIzq", CubeListBuilder.create(), PartPose.offset(-3.5F, 8.0F, -1.625F));

		PartDefinition cube_r14 = PataIzq.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 8).addBox(1.0F, 8.0F, -6.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(4, 8).addBox(1.0F, 8.0F, -4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(14, 47).addBox(-2.0F, 8.0F, -4.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 9).addBox(1.0F, 8.0F, -2.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, -8.0F, 1.625F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r15 = PataIzq.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 18).addBox(-0.5F, 0.0F, -1.5F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 1.125F, 0.0F, 1.5708F, 0.0F));

		PartDefinition PiernaDer = Dodo.addOrReplaceChild("PiernaDer", CubeListBuilder.create(), PartPose.offset(3.5F, 5.5F, 0.0F));

		PartDefinition cube_r16 = PiernaDer.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 35).addBox(0.0F, -2.5F, -0.5F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition PiernaIzq = Dodo.addOrReplaceChild("PiernaIzq", CubeListBuilder.create(), PartPose.offset(-4.0F, 5.5F, 0.0F));

		PartDefinition cube_r17 = PiernaIzq.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 35).addBox(0.6F, -2.5F, -1.5F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 0.6F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Torso = Dodo.addOrReplaceChild("Torso", CubeListBuilder.create(), PartPose.offset(0.0F, 0.5F, 0.0F));

		PartDefinition cube_r18 = Torso.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -4.0F, -5.0F, 10.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition Cola = Dodo.addOrReplaceChild("Cola", CubeListBuilder.create(), PartPose.offset(-1.0F, -3.3F, 6.0F));

		PartDefinition cube_r19 = Cola.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 18).addBox(-9.0F, -6.9881F, -2.706F, 6.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.2881F, -5.794F, 0.0F, 1.5708F, 0.0F));

		PartDefinition col = Cola.addOrReplaceChild("col", CubeListBuilder.create(), PartPose.offset(0.7833F, -1.4979F, 1.8667F));

		PartDefinition cube_r20 = col.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(9, 44).addBox(-10.0F, -2.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 18).addBox(-10.0F, -3.0F, -3.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(18, 18).addBox(-10.0F, -5.0F, -1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2167F, 5.2979F, -8.0667F, 0.0F, 1.5708F, 0.0F));

		PartDefinition colarriba = Cola.addOrReplaceChild("colarriba", CubeListBuilder.create(), PartPose.offset(-0.5F, -4.1F, -1.0F));

		PartDefinition cube_r21 = colarriba.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(8, 43).addBox(-0.4F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5708F, 0.829F, -1.5708F));

		PartDefinition cube_r22 = colarriba.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(14, 43).addBox(-0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.7F, 0.0F, 1.2F, -1.5708F, 0.7418F, -1.5708F));

		PartDefinition cube_r23 = colarriba.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(12, 43).addBox(-0.3F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, 3.0F, -1.5708F, 0.7418F, -1.5708F));

		PartDefinition ManoDer = Dodo.addOrReplaceChild("ManoDer", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r24 = ManoDer.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(34, 6).addBox(-4.0F, -2.0F, 6.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(10, 32).addBox(-1.0F, -2.0F, 5.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 48, 48);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.DODO_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((DodoEntity) entity).idleAnimationState, ModAnimationDefinitions.DODO_IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Dodo.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return Dodo;
	}
}