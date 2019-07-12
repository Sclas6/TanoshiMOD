package tanoshiMob.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * ModelToki_A - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelToki_A extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer LLeg2;
    public ModelRenderer RLeg2;
    public ModelRenderer LLeg;
    public ModelRenderer RLeg;
    public ModelRenderer Head;
    public ModelRenderer Hair;
    public ModelRenderer Mouth;
    public ModelRenderer Sippo;
    public ModelRenderer FearR;
    public ModelRenderer FearL;
    public ModelRenderer Eye;
	public boolean hide = false;
	int pose = 1;

    public ModelToki_A() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Eye = new ModelRenderer(this, 0, 0);
        this.Eye.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Eye.addBox(-2.0F, -7.0F, -6.3F, 4, 1, 1, -0.3F);
        this.Neck = new ModelRenderer(this, 0, 6);
        this.Neck.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Neck.addBox(-2.0F, -6.3F, -4.5F, 4, 6, 4, -0.3F);
        this.Hair = new ModelRenderer(this, 16, 1);
        this.Hair.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Hair.addBox(-1.5F, -2.9F, -7.7F, 3, 1, 5, 0.2F);
        this.setRotation(Hair, -0.9560913642424937F, 0.0F, 0.0F);
        this.Sippo = new ModelRenderer(this, 37, 0);
        this.Sippo.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Sippo.addBox(-3.0F, -4.5F, 4.6F, 6, 4, 7, -0.3F);
        this.setRotation(Sippo, -1.1344640137963142F, 0.0F, 0.0F);
        this.LLeg2 = new ModelRenderer(this, 1, 21);
        this.LLeg2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.LLeg2.addBox(1.0F, 7.0F, -2.5F, 1, 1, 3, 0.0F);
        this.RLeg = new ModelRenderer(this, 28, 16);
        this.RLeg.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.RLeg.addBox(-2.0F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
        this.FearR = new ModelRenderer(this, 38, 15);
        this.FearR.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.FearR.addBox(-4.0F, -3.0F, -1.6F, 2, 6, 11, -0.6F);
        this.setRotation(FearR, -0.7853981633974483F, 0.0F, 0.0F);
        this.LLeg = new ModelRenderer(this, 23, 16);
        this.LLeg.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.LLeg.addBox(1.0F, 0.0F, -0.5F, 1, 8, 1, 0.0F);
        this.Body = new ModelRenderer(this, 0, 16);
        this.Body.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Body.addBox(-3.0F, -3.0F, -3.6F, 6, 6, 10, 0.0F);
        this.setRotation(Body, -0.7853981633974483F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 16, 8);
        this.Head.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Head.addBox(-1.5F, -8.0F, -7.2F, 3, 3, 5, 0.22F);
        this.RLeg2 = new ModelRenderer(this, 1, 17);
        this.RLeg2.setRotationPoint(0.0F, 16.0F, 0.0F);
        this.RLeg2.addBox(-2.0F, 7.0F, -2.5F, 1, 1, 3, 0.0F);
        this.FearL = new ModelRenderer(this, 38, 15);
        this.FearL.mirror = true;
        this.FearL.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.FearL.addBox(2.0F, -3.0F, -1.6F, 2, 6, 11, -0.6F);
        this.setRotation(FearL, -0.7853981633974483F, 0.0F, 0.0F);
        this.Mouth = new ModelRenderer(this, 33, 17);
        this.Mouth.setRotationPoint(0.0F, 15.0F, 0.0F);
        this.Mouth.addBox(-0.5F, -8.0F, -11.0F, 1, 1, 6, 0.0F);
        this.setRotation(Mouth, 0.2617993877991494F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Eye.offsetX, this.Eye.offsetY, this.Eye.offsetZ);
        GL11.glTranslatef(this.Eye.rotationPointX * f5, this.Eye.rotationPointY * f5, this.Eye.rotationPointZ * f5);
        GL11.glScaled(1.1D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Eye.offsetX, -this.Eye.offsetY, -this.Eye.offsetZ);
        GL11.glTranslatef(-this.Eye.rotationPointX * f5, -this.Eye.rotationPointY * f5, -this.Eye.rotationPointZ * f5);
        this.Eye.render(f5);
        GL11.glPopMatrix();
        this.Neck.render(f5);
        this.Hair.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Sippo.offsetX, this.Sippo.offsetY, this.Sippo.offsetZ);
        GL11.glTranslatef(this.Sippo.rotationPointX * f5, this.Sippo.rotationPointY * f5, this.Sippo.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 1.0D);
        GL11.glTranslatef(-this.Sippo.offsetX, -this.Sippo.offsetY, -this.Sippo.offsetZ);
        GL11.glTranslatef(-this.Sippo.rotationPointX * f5, -this.Sippo.rotationPointY * f5, -this.Sippo.rotationPointZ * f5);
        this.Sippo.render(f5);
        GL11.glPopMatrix();
        this.LLeg2.render(f5);
        this.RLeg.render(f5);
        this.FearR.render(f5);
        this.LLeg.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GL11.glTranslatef(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 1.0D);
        GL11.glTranslatef(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GL11.glTranslatef(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GL11.glPopMatrix();
        this.Head.render(f5);
        this.RLeg2.render(f5);
        this.FearL.render(f5);
        this.Mouth.render(f5);
    }



	public void setRotationAngles(float time, float walkSpeed, float p_78087_3_, float rotationYaw, float rotationPitch,
			float p_78087_6_, Entity p_78087_7_) {
		this.Head.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Eye.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Mouth.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
//		this.FearR.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Head.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Eye.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Mouth.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Body.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Neck.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Hair.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Mouth.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Sippo.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
//		this.FearR.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

			//限界可動範囲
		this.Head.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Eye.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Mouth.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Head.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Eye.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Mouth.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0.2617993877991494F), 0.2617993877991494F -0.15F);
			//Y
		this.Body.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Neck.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Sippo.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.FearR.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
		this.FearL.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
		this.Hair.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.RLeg.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.LLeg.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.RLeg2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.LLeg2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
			//X
//		this.FearR.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0.2F), -0.2F);
//		this.FearL.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0.2F), -0.2F);

		this.FearR.rotateAngleZ =  -p_78087_3_;
		this.FearL.rotateAngleZ =  p_78087_3_;

		if (this.pose != 3) {

			if (this.pose == 2) {

				this.RLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
				this.RLeg2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
//				this.FearR.rotateAngleX = MathHelper.cos(time * -0.7853981633974483F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
				this.LLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.LLeg2.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
//				this.FearL.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;

			} else {

				this.RLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.RLeg2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
//				this.FearR.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.LLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.LLeg2.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
//				this.FearL.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
			}

		}

    }

    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
