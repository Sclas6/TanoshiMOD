package tanoshiMob.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Serval - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelTutinoko extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer Head;
    public ModelRenderer Lhand;
    public ModelRenderer Rhand;
    public ModelRenderer Sippo;
    public ModelRenderer shape17;
    public ModelRenderer Hood;
    public ModelRenderer Hood2;
    public ModelRenderer Hood3;
    public ModelRenderer Hood4;
    public ModelRenderer Eye;
	public boolean hide = false;
	int pose = 1;

    public ModelTutinoko() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.Rleg = new ModelRenderer(this, 12, 38);
        this.Rleg.setRotationPoint(0.0F, 16.5F, 0.0F);
        this.Rleg.addBox(-3.1F, -0.4F, -1.5F, 3, 8, 3, -0.2F);
        this.Eye = new ModelRenderer(this, 2, 12);
        this.Eye.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Eye.addBox(-4.0F, 5.0F, -1.5F, 8, 2, 2, -0.1F);
        this.Lleg = new ModelRenderer(this, 0, 38);
        this.Lleg.setRotationPoint(0.0F, 16.5F, 0.0F);
        this.Lleg.addBox(0.1F, -0.4F, -1.5F, 3, 8, 3, -0.2F);
        this.Lhand = new ModelRenderer(this, 55, 56);
        this.Lhand.setRotationPoint(0.4F, 10.3F, 0.0F);
        this.Lhand.addBox(1.5F, 0.0F, -1.0F, 2, 6, 2, -0.2F);
        this.Hood4 = new ModelRenderer(this, 24, 26);
        this.Hood4.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Hood4.addBox(2.5F, -1.5F, -2.3F, 1, 5, 4, 0.02F);
        this.Hood2 = new ModelRenderer(this, 1, 17);
        this.Hood2.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Hood2.addBox(-3.5F, -3.5F, -2.8F, 7, 2, 4, 0.01F);
        this.Hood = new ModelRenderer(this, 1, 25);
        this.Hood.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Hood.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 4, -0.01F);
        this.shape17 = new ModelRenderer(this, 38, 0);
        this.shape17.setRotationPoint(0.0F, 17.9F, 0.0F);
        this.shape17.addBox(-1.5F, 3.9F, -3.5F, 3, 6, 3, -0.6F);
        this.setRotation(shape17, 1.2311552543568F, 0.0F, 0.0F);
        this.Sippo = new ModelRenderer(this, 52, 0);
        this.Sippo.setRotationPoint(0.0F, 15.5F, 0.8F);
        this.Sippo.addBox(-1.5F, 0.0F, -1.5F, 3, 7, 3, -0.4F);
        this.setRotation(Sippo, 0.5462880558742251F, 0.0F, 0.0F);
        this.Rhand = new ModelRenderer(this, 55, 47);
        this.Rhand.setRotationPoint(-0.4F, 10.3F, 0.0F);
        this.Rhand.addBox(-3.5F, 0.0F, -1.0F, 2, 6, 2, -0.2F);
        this.Hood3 = new ModelRenderer(this, 24, 17);
        this.Hood3.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Hood3.addBox(-3.5F, -1.5F, -2.3F, 1, 5, 4, 0.02F);
        this.Body = new ModelRenderer(this, 0, 50);
        this.Body.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.Body.addBox(-3.0F, -5.0F, -2.5F, 6, 9, 5, -0.5F);
        this.Head = new ModelRenderer(this, 22, 48);
        this.Head.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.Head.addBox(-4.0F, -3.0F, -4.0F, 8, 8, 8, -1.5F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        GL11.glPushMatrix();
        GL11.glTranslatef(this.Rleg.offsetX, this.Rleg.offsetY, this.Rleg.offsetZ);
        GL11.glTranslatef(this.Rleg.rotationPointX * f5, this.Rleg.rotationPointY * f5, this.Rleg.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Rleg.offsetX, -this.Rleg.offsetY, -this.Rleg.offsetZ);
        GL11.glTranslatef(-this.Rleg.rotationPointX * f5, -this.Rleg.rotationPointY * f5, -this.Rleg.rotationPointZ * f5);
        this.Rleg.render(f5);
        GL11.glPopMatrix();
        this.Eye.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Lleg.offsetX, this.Lleg.offsetY, this.Lleg.offsetZ);
        GL11.glTranslatef(this.Lleg.rotationPointX * f5, this.Lleg.rotationPointY * f5, this.Lleg.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Lleg.offsetX, -this.Lleg.offsetY, -this.Lleg.offsetZ);
        GL11.glTranslatef(-this.Lleg.rotationPointX * f5, -this.Lleg.rotationPointY * f5, -this.Lleg.rotationPointZ * f5);
        this.Lleg.render(f5);
        GL11.glPopMatrix();
        this.Lhand.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hood4.offsetX, this.Hood4.offsetY, this.Hood4.offsetZ);
        GL11.glTranslatef(this.Hood4.rotationPointX * f5, this.Hood4.rotationPointY * f5, this.Hood4.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.2D);
        GL11.glTranslatef(-this.Hood4.offsetX, -this.Hood4.offsetY, -this.Hood4.offsetZ);
        GL11.glTranslatef(-this.Hood4.rotationPointX * f5, -this.Hood4.rotationPointY * f5, -this.Hood4.rotationPointZ * f5);
        this.Hood4.render(f5);
        GL11.glPopMatrix();
        this.Hood2.render(f5);
        this.Hood.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.shape17.offsetX, this.shape17.offsetY, this.shape17.offsetZ);
        GL11.glTranslatef(this.shape17.rotationPointX * f5, this.shape17.rotationPointY * f5, this.shape17.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.9D, 1.0D);
        GL11.glTranslatef(-this.shape17.offsetX, -this.shape17.offsetY, -this.shape17.offsetZ);
        GL11.glTranslatef(-this.shape17.rotationPointX * f5, -this.shape17.rotationPointY * f5, -this.shape17.rotationPointZ * f5);
        this.shape17.render(f5);
        GL11.glPopMatrix();
        this.Sippo.render(f5);
        this.Rhand.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Hood3.offsetX, this.Hood3.offsetY, this.Hood3.offsetZ);
        GL11.glTranslatef(this.Hood3.rotationPointX * f5, this.Hood3.rotationPointY * f5, this.Hood3.rotationPointZ * f5);
        GL11.glScaled(1.0D, 1.0D, 1.2D);
        GL11.glTranslatef(-this.Hood3.offsetX, -this.Hood3.offsetY, -this.Hood3.offsetZ);
        GL11.glTranslatef(-this.Hood3.rotationPointX * f5, -this.Hood3.rotationPointY * f5, -this.Hood3.rotationPointZ * f5);
        this.Hood3.render(f5);
        GL11.glPopMatrix();
        this.Body.render(f5);
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

	public void setRotationAngles(float time, float walkSpeed, float p_78087_3_, float rotationYaw, float rotationPitch,
			float p_78087_6_, Entity p_78087_7_) {
		this.Head.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Eye.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Hood.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Hood2.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Hood3.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Hood4.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.Head.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Hood.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Hood2.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Hood3.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Hood4.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

			//限界可動範囲
		this.Head.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Hood.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Hood2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Hood3.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Hood4.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Eye.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Head.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Hood.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Hood2.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Hood3.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Hood4.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Eye.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
			//Y
		this.Body.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Rhand.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.Lhand.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.Rleg.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
		this.Lleg.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.5F), -0.5F);
			//X
		this.Rhand.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0.2F), -0.2F);
		this.Lhand.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0.2F), -0.2F);
			/*
		this.Rhand.rotateAngleZ = -0.2443461F - p_78087_3_;
		this.Lhand.rotateAngleZ = 0.2443461F + p_78087_3_;
			 */
		if (this.pose != 3) {

			if (this.pose == 2) {

				this.Rleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
				this.Rhand.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Lleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Lhand.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  0.5462880558742251F;
				this.shape17.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.2311552543568F;

			} else {

				this.Rleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lhand.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Rhand.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  0.5462880558742251F;
				this.shape17.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.2311552543568F;
			}

		}

    }
}
