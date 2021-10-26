// Made with Blockbench 4.0.2
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports

	package net.fabricmc.lycanthropy.entity.models;

import net.fabricmc.lycanthropy.entity.WerewolfEntity;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;

public class WerewolfModel extends EntityModel<WerewolfEntity> {
private final ModelPart torso;
	private final ModelPart chest_r1;
	private final ModelPart head;
	private final ModelPart ear2_r1;
	private final ModelPart ear1_r1;
	private final ModelPart snout;
	private final ModelPart nose_r1;
	private final ModelPart jaw_r1;
	private final ModelPart arm1;
	private final ModelPart lowerarm1_r1;
	private final ModelPart upperarm1_r1;
	private final ModelPart fingersL;
	private final ModelPart clawL3_r1;
	private final ModelPart fingerL3_r1;
	private final ModelPart clawL2_r1;
	private final ModelPart fingerL2_r1;
	private final ModelPart clawL1_r1;
	private final ModelPart fingerL1_r1;
	private final ModelPart arm2;
	private final ModelPart lowerarm2_r1;
	private final ModelPart upperarm2_r1;
	private final ModelPart fingersR;
	private final ModelPart clawR3_r1;
	private final ModelPart fingerR3_r1;
	private final ModelPart clawR2_r1;
	private final ModelPart fingerR2_r1;
	private final ModelPart clawR1_r1;
	private final ModelPart fingerR1_r1;
	private final ModelPart leg1;
	private final ModelPart shin1_r1;
	private final ModelPart thigh1_r1;
	private final ModelPart leg2;
	private final ModelPart shin2_r1;
	private final ModelPart thigh2_r1;
	private final ModelPart tail;
	private final ModelPart tail1_r1;
public WerewolfModel() {
		textureWidth = 128;
		textureHeight = 128;
		torso = new ModelPart(this);
		torso.setPivot(0.0F, -11.0F, -3.0F);
		torso.setTextureOffset(0, 31).addCuboid(-6.0F, 2.981F, 0.8724F, 12.0F, 15.0F, 11.0F, 0.0F, false);

		chest_r1 = new ModelPart(this);
		chest_r1.setPivot(0.0F, 5.0F, 6.0F);
		torso.addChild(chest_r1);
		setRotationAngle(chest_r1, 0.48F, 0.0F, 0.0F);
		chest_r1.setTextureOffset(0, 0).addCuboid(-7.0F, -15.0F, -6.0F, 14.0F, 17.0F, 14.0F, 0.0F, false);

		head = new ModelPart(this);
		head.setPivot(0.0F, 23.0F, -1.0F);
		head.setTextureOffset(45, 20).addCuboid(-6.0F, -51.0F, -10.0F, 12.0F, 11.0F, 11.0F, 0.0F, false);

		ear2_r1 = new ModelPart(this);
		ear2_r1.setPivot(-7.0F, -51.0F, -1.0F);
		head.addChild(ear2_r1);
		setRotationAngle(ear2_r1, -0.4363F, 0.6545F, -0.8727F);
		ear2_r1.setTextureOffset(0, 6).addCuboid(1.0F, -1.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		ear1_r1 = new ModelPart(this);
		ear1_r1.setPivot(7.0F, -51.0F, -1.0F);
		head.addChild(ear1_r1);
		setRotationAngle(ear1_r1, -0.4363F, -0.6545F, 0.8727F);
		ear1_r1.setTextureOffset(0, 0).addCuboid(-4.0F, -1.0F, -2.0F, 3.0F, 4.0F, 2.0F, 0.0F, false);

		snout = new ModelPart(this);
		snout.setPivot(0.0F, -44.0F, 13.0F);
		head.addChild(snout);
		snout.setTextureOffset(75, 58).addCuboid(-3.0F, -1.0F, -29.0F, 6.0F, 3.0F, 6.0F, 0.0F, false);

		nose_r1 = new ModelPart(this);
		nose_r1.setPivot(0.0F, 0.0F, -24.0F);
		snout.addChild(nose_r1);
		setRotationAngle(nose_r1, 0.3054F, 0.0F, 0.0F);
		nose_r1.setTextureOffset(38, 84).addCuboid(-2.0F, -3.0F, -4.5F, 4.0F, 3.0F, 7.0F, 0.0F, false);

		jaw_r1 = new ModelPart(this);
		jaw_r1.setPivot(0.0F, 1.0F, -22.0F);
		snout.addChild(jaw_r1);
		setRotationAngle(jaw_r1, 0.1309F, 0.0F, 0.0F);
		jaw_r1.setTextureOffset(60, 86).addCuboid(-3.0F, 0.0F, -7.0F, 6.0F, 2.0F, 6.0F, 0.0F, false);

		arm1 = new ModelPart(this);
		arm1.setPivot(9.0F, -4.0F, 0.0F);
		setRotationAngle(arm1, 0.0873F, 0.0873F, 0.0F);
		

		lowerarm1_r1 = new ModelPart(this);
		lowerarm1_r1.setPivot(0.0F, 0.0F, 0.0F);
		arm1.addChild(lowerarm1_r1);
		setRotationAngle(lowerarm1_r1, -0.1309F, 0.0F, 0.0F);
		lowerarm1_r1.setTextureOffset(0, 78).addCuboid(-3.0F, -2.0F, -3.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		upperarm1_r1 = new ModelPart(this);
		upperarm1_r1.setPivot(-2.0F, -11.0F, 0.0F);
		arm1.addChild(upperarm1_r1);
		setRotationAngle(upperarm1_r1, 0.1309F, 0.0F, -0.1745F);
		upperarm1_r1.setTextureOffset(56, 63).addCuboid(-3.0F, -4.0F, -5.0F, 6.0F, 14.0F, 7.0F, 0.0F, false);

		fingersL = new ModelPart(this);
		fingersL.setPivot(1.0F, 9.0F, 3.0F);
		arm1.addChild(fingersL);
		

		clawL3_r1 = new ModelPart(this);
		clawL3_r1.setPivot(1.0F, 0.0F, -6.0F);
		fingersL.addChild(clawL3_r1);
		setRotationAngle(clawL3_r1, 0.1309F, -1.309F, 0.0F);
		clawL3_r1.setTextureOffset(9, 11).addCuboid(0.5F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		fingerL3_r1 = new ModelPart(this);
		fingerL3_r1.setPivot(1.0F, 0.0F, -6.0F);
		fingersL.addChild(fingerL3_r1);
		setRotationAngle(fingerL3_r1, 0.0F, -1.309F, 0.0F);
		fingerL3_r1.setTextureOffset(35, 36).addCuboid(0.0F, -1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		clawL2_r1 = new ModelPart(this);
		clawL2_r1.setPivot(0.0F, 0.0F, -6.0F);
		fingersL.addChild(clawL2_r1);
		setRotationAngle(clawL2_r1, 0.0873F, -0.2182F, 0.0F);
		clawL2_r1.setTextureOffset(7, 35).addCuboid(-1.5F, 2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		fingerL2_r1 = new ModelPart(this);
		fingerL2_r1.setPivot(0.0F, 0.0F, -6.0F);
		fingersL.addChild(fingerL2_r1);
		setRotationAngle(fingerL2_r1, 0.0F, -0.2182F, 0.0F);
		fingerL2_r1.setTextureOffset(42, 0).addCuboid(-2.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		clawL1_r1 = new ModelPart(this);
		clawL1_r1.setPivot(-3.0F, 0.0F, -7.0F);
		fingersL.addChild(clawL1_r1);
		setRotationAngle(clawL1_r1, 0.1309F, 0.0873F, 0.0F);
		clawL1_r1.setTextureOffset(42, 5).addCuboid(-0.5F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		fingerL1_r1 = new ModelPart(this);
		fingerL1_r1.setPivot(-3.0F, 0.0F, -7.0F);
		fingersL.addChild(fingerL1_r1);
		setRotationAngle(fingerL1_r1, 0.0F, 0.0873F, 0.0F);
		fingerL1_r1.setTextureOffset(46, 42).addCuboid(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		arm2 = new ModelPart(this);
		arm2.setPivot(-9.0F, -4.0F, 0.0F);
		setRotationAngle(arm2, 0.0873F, -0.0873F, 0.0F);
		

		lowerarm2_r1 = new ModelPart(this);
		lowerarm2_r1.setPivot(0.0F, 0.0F, 0.0F);
		arm2.addChild(lowerarm2_r1);
		setRotationAngle(lowerarm2_r1, -0.1309F, 0.0F, 0.0F);
		lowerarm2_r1.setTextureOffset(76, 42).addCuboid(-2.0F, -2.0F, -3.0F, 5.0F, 11.0F, 5.0F, 0.0F, false);

		upperarm2_r1 = new ModelPart(this);
		upperarm2_r1.setPivot(2.0F, -11.0F, 0.0F);
		arm2.addChild(upperarm2_r1);
		setRotationAngle(upperarm2_r1, 0.1309F, 0.0F, 0.1745F);
		upperarm2_r1.setTextureOffset(30, 63).addCuboid(-3.0F, -4.0F, -5.0F, 6.0F, 14.0F, 7.0F, 0.0F, false);

		fingersR = new ModelPart(this);
		fingersR.setPivot(-1.0F, 9.0F, 3.0F);
		arm2.addChild(fingersR);
		

		clawR3_r1 = new ModelPart(this);
		clawR3_r1.setPivot(-1.0F, 0.0F, -6.0F);
		fingersR.addChild(clawR3_r1);
		setRotationAngle(clawR3_r1, 0.1309F, 1.309F, 0.0F);
		clawR3_r1.setTextureOffset(9, 5).addCuboid(-1.5F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		fingerR3_r1 = new ModelPart(this);
		fingerR3_r1.setPivot(-1.0F, 0.0F, -6.0F);
		fingersR.addChild(fingerR3_r1);
		setRotationAngle(fingerR3_r1, 0.0F, 1.309F, 0.0F);
		fingerR3_r1.setTextureOffset(0, 31).addCuboid(-2.0F, -1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		clawR2_r1 = new ModelPart(this);
		clawR2_r1.setPivot(0.0F, 0.0F, -6.0F);
		fingersR.addChild(clawR2_r1);
		setRotationAngle(clawR2_r1, 0.0873F, 0.2182F, 0.0F);
		clawR2_r1.setTextureOffset(10, 0).addCuboid(0.5F, 2.0F, -1.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		fingerR2_r1 = new ModelPart(this);
		fingerR2_r1.setPivot(0.0F, 0.0F, -6.0F);
		fingersR.addChild(fingerR2_r1);
		setRotationAngle(fingerR2_r1, 0.0F, 0.2182F, 0.0F);
		fingerR2_r1.setTextureOffset(35, 31).addCuboid(0.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		clawR1_r1 = new ModelPart(this);
		clawR1_r1.setPivot(3.0F, 0.0F, -7.0F);
		fingersR.addChild(clawR1_r1);
		setRotationAngle(clawR1_r1, 0.1309F, -0.0873F, 0.0F);
		clawR1_r1.setTextureOffset(10, 8).addCuboid(-0.5F, 2.0F, 0.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);

		fingerR1_r1 = new ModelPart(this);
		fingerR1_r1.setPivot(3.0F, 0.0F, -7.0F);
		fingersR.addChild(fingerR1_r1);
		setRotationAngle(fingerR1_r1, 0.0F, -0.0873F, 0.0F);
		fingerR1_r1.setTextureOffset(0, 36).addCuboid(-1.0F, -1.0F, 0.0F, 2.0F, 3.0F, 2.0F, 0.0F, false);

		leg1 = new ModelPart(this);
		leg1.setPivot(6.0F, 4.0F, -4.0F);
		setRotationAngle(leg1, 0.0F, -0.3054F, 0.0F);
		leg1.setTextureOffset(20, 84).addCuboid(-1.0F, 9.0F, 6.0F, 4.0F, 10.0F, 5.0F, 0.0F, false);
		leg1.setTextureOffset(82, 67).addCuboid(-1.5F, 18.0F, 3.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);

		shin1_r1 = new ModelPart(this);
		shin1_r1.setPivot(1.0F, 5.0F, 7.0F);
		leg1.addChild(shin1_r1);
		setRotationAngle(shin1_r1, 0.2182F, 0.0F, 0.0F);
		shin1_r1.setTextureOffset(60, 6).addCuboid(-2.5F, 0.0F, -4.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);

		thigh1_r1 = new ModelPart(this);
		thigh1_r1.setPivot(0.0F, 1.0F, 9.0F);
		leg1.addChild(thigh1_r1);
		setRotationAngle(thigh1_r1, -0.0873F, 0.0F, 0.0F);
		thigh1_r1.setTextureOffset(0, 57).addCuboid(-2.0F, -6.0F, -6.0F, 6.0F, 12.0F, 9.0F, 0.0F, false);

		leg2 = new ModelPart(this);
		leg2.setPivot(-6.0F, 4.0F, -4.0F);
		setRotationAngle(leg2, 0.0F, 0.3054F, 0.0F);
		leg2.setTextureOffset(81, 15).addCuboid(-3.0F, 9.0F, 6.0F, 4.0F, 10.0F, 5.0F, 0.0F, false);
		leg2.setTextureOffset(75, 77).addCuboid(-3.5F, 18.0F, 3.0F, 5.0F, 2.0F, 7.0F, 0.0F, false);

		shin2_r1 = new ModelPart(this);
		shin2_r1.setPivot(-1.0F, 5.0F, 7.0F);
		leg2.addChild(shin2_r1);
		setRotationAngle(shin2_r1, 0.2182F, 0.0F, 0.0F);
		shin2_r1.setTextureOffset(42, 0).addCuboid(-2.5F, 0.0F, -4.0F, 5.0F, 6.0F, 8.0F, 0.0F, false);

		thigh2_r1 = new ModelPart(this);
		thigh2_r1.setPivot(0.0F, 1.0F, 9.0F);
		leg2.addChild(thigh2_r1);
		setRotationAngle(thigh2_r1, -0.0873F, 0.0F, 0.0F);
		thigh2_r1.setTextureOffset(46, 42).addCuboid(-4.0F, -6.0F, -6.0F, 6.0F, 12.0F, 9.0F, 0.0F, false);

		tail = new ModelPart(this);
		tail.setPivot(0.0F, 24.0F, 0.0F);
		tail.setTextureOffset(84, 86).addCuboid(-2.0F, -11.0F, 7.0F, 4.0F, 8.0F, 4.0F, 0.0F, false);

		tail1_r1 = new ModelPart(this);
		tail1_r1.setPivot(0.0F, -18.0F, 8.0F);
		tail.addChild(tail1_r1);
		setRotationAngle(tail1_r1, 0.2182F, 0.0F, 0.0F);
		tail1_r1.setTextureOffset(78, 0).addCuboid(-2.5F, -1.0F, -3.0F, 5.0F, 9.0F, 5.0F, 0.0F, false);
}
@Override
public void setAngles(WerewolfEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
}
@Override
public void render(MatrixStack matrixStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		
		torso.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		arm1.render(matrixStack, buffer, packedLight, packedOverlay);
		arm2.render(matrixStack, buffer, packedLight, packedOverlay);
		leg1.render(matrixStack, buffer, packedLight, packedOverlay);
		leg2.render(matrixStack, buffer, packedLight, packedOverlay);
		tail.render(matrixStack, buffer, packedLight, packedOverlay);
}
public void setRotationAngle(ModelPart bone, float x, float y, float z) {
		bone.pitch = x;
		bone.yaw = y;
		bone.roll = z;
}

	}