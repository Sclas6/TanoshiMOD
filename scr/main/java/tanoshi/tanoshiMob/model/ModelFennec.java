package tanoshiMob.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Fennec - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelFennec extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer Head;
    public ModelRenderer Lmimi;
    public ModelRenderer Rmimi;
    public ModelRenderer Lhand;
    public ModelRenderer Rhand;
    public ModelRenderer Sippo;
    public ModelRenderer Skirt;
    public ModelRenderer Lmimi2;
    public ModelRenderer Rmimi2;
	public boolean hide = false;
	int pose = 1;

    public ModelFennec() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head = new ModelRenderer(this, 0, 2);
        this.Head.setRotationPoint(0.0F, 7.5F, 0.0F);
        this.Head.addBox(-4.0F, -4.0F, -3.5F, 8, 8, 7, -0.6F);
        this.Lmimi = new ModelRenderer(this, 53, 13);
        this.Lmimi.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.Lmimi.addBox(-1.6F, -8.0F, -1.0F, 3, 6, 2, 0.2F);
        this.setRotation(Lmimi, 0.0F, 0.0F, 0.9599310885968813F);
        this.Rleg = new ModelRenderer(this, 36, 22);
        this.Rleg.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.Rleg.addBox(-3.0F, -0.4F, -1.5F, 3, 7, 3, -0.4F);
        this.Sippo = new ModelRenderer(this, 36, 13);
        this.Sippo.setRotationPoint(0.0F, 17.9F, 0.8F);
        this.Sippo.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, 0.0F);
        this.setRotation(Sippo, 0.6373942428283291F, 0.0F, 0.0F);
        this.Skirt = new ModelRenderer(this, 30, 4);
        this.Skirt.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.Skirt.addBox(-3.5F, 1.5F, -2.5F, 7, 3, 5, -0.1F);
        this.Rmimi2 = new ModelRenderer(this, 12, 0);
        this.Rmimi2.setRotationPoint(0.0F, 5.4F, 0.0F);
        this.Rmimi2.addBox(-8.0F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotation(Rmimi2, 0.0F, 0.0F, -0.5918411493512771F);
        this.Body = new ModelRenderer(this, 0, 17);
        this.Body.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.Body.addBox(-4.0F, -5.7F, -3.0F, 8, 9, 6, -1.0F);
        this.Lmimi2 = new ModelRenderer(this, 0, 0);
        this.Lmimi2.setRotationPoint(0.0F, 5.4F, 0.0F);
        this.Lmimi2.addBox(3.0F, -0.5F, -0.5F, 5, 1, 1, 0.0F);
        this.setRotation(Lmimi2, 0.0F, 0.0F, 0.5918411493512771F);
        this.Lleg = new ModelRenderer(this, 49, 22);
        this.Lleg.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.Lleg.addBox(0.0F, -0.4F, -1.5F, 3, 7, 3, -0.4F);
        this.Lhand = new ModelRenderer(this, 28, 15);
        this.Lhand.setRotationPoint(0.4F, 12.3F, 0.0F);
        this.Lhand.addBox(1.2F, -0.6F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotation(Lhand, 0.0F, 0.0F, -0.3839724354387525F);
        this.Rhand = new ModelRenderer(this, 28, 24);
        this.Rhand.setRotationPoint(-0.4F, 12.3F, 0.0F);
        this.Rhand.addBox(-3.2F, -0.6F, -1.0F, 2, 6, 2, 0.0F);
        this.setRotation(Rhand, 0.0F, 0.0F, 0.3839724354387525F);
        this.Rmimi = new ModelRenderer(this, 54, 4);
        this.Rmimi.setRotationPoint(0.0F, 6.8F, 0.0F);
        this.Rmimi.addBox(-1.6F, -8.0F, -1.0F, 3, 6, 2, 0.2F);
        this.setRotation(Rmimi, 0.0F, 0.0F, -0.9599310885968813F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.Head.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Lmimi.offsetX, this.Lmimi.offsetY, this.Lmimi.offsetZ);
        GL11.glTranslatef(this.Lmimi.rotationPointX * f5, this.Lmimi.rotationPointY * f5, this.Lmimi.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 0.8D);
        GL11.glTranslatef(-this.Lmimi.offsetX, -this.Lmimi.offsetY, -this.Lmimi.offsetZ);
        GL11.glTranslatef(-this.Lmimi.rotationPointX * f5, -this.Lmimi.rotationPointY * f5, -this.Lmimi.rotationPointZ * f5);
        this.Lmimi.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Rleg.offsetX, this.Rleg.offsetY, this.Rleg.offsetZ);
        GL11.glTranslatef(this.Rleg.rotationPointX * f5, this.Rleg.rotationPointY * f5, this.Rleg.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Rleg.offsetX, -this.Rleg.offsetY, -this.Rleg.offsetZ);
        GL11.glTranslatef(-this.Rleg.rotationPointX * f5, -this.Rleg.rotationPointY * f5, -this.Rleg.rotationPointZ * f5);
        this.Rleg.render(f5);
        GL11.glPopMatrix();
        this.Sippo.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Skirt.offsetX, this.Skirt.offsetY, this.Skirt.offsetZ);
        GL11.glTranslatef(this.Skirt.rotationPointX * f5, this.Skirt.rotationPointY * f5, this.Skirt.rotationPointZ * f5);
        GL11.glScaled(0.8D, 0.9D, 0.9D);
        GL11.glTranslatef(-this.Skirt.offsetX, -this.Skirt.offsetY, -this.Skirt.offsetZ);
        GL11.glTranslatef(-this.Skirt.rotationPointX * f5, -this.Skirt.rotationPointY * f5, -this.Skirt.rotationPointZ * f5);
        this.Skirt.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Rmimi2.offsetX, this.Rmimi2.offsetY, this.Rmimi2.offsetZ);
        GL11.glTranslatef(this.Rmimi2.rotationPointX * f5, this.Rmimi2.rotationPointY * f5, this.Rmimi2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.7D, 0.7D);
        GL11.glTranslatef(-this.Rmimi2.offsetX, -this.Rmimi2.offsetY, -this.Rmimi2.offsetZ);
        GL11.glTranslatef(-this.Rmimi2.rotationPointX * f5, -this.Rmimi2.rotationPointY * f5, -this.Rmimi2.rotationPointZ * f5);
        this.Rmimi2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GL11.glTranslatef(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 0.9D);
        GL11.glTranslatef(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GL11.glTranslatef(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Lmimi2.offsetX, this.Lmimi2.offsetY, this.Lmimi2.offsetZ);
        GL11.glTranslatef(this.Lmimi2.rotationPointX * f5, this.Lmimi2.rotationPointY * f5, this.Lmimi2.rotationPointZ * f5);
        GL11.glScaled(1.0D, 0.7D, 0.7D);
        GL11.glTranslatef(-this.Lmimi2.offsetX, -this.Lmimi2.offsetY, -this.Lmimi2.offsetZ);
        GL11.glTranslatef(-this.Lmimi2.rotationPointX * f5, -this.Lmimi2.rotationPointY * f5, -this.Lmimi2.rotationPointZ * f5);
        this.Lmimi2.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Lleg.offsetX, this.Lleg.offsetY, this.Lleg.offsetZ);
        GL11.glTranslatef(this.Lleg.rotationPointX * f5, this.Lleg.rotationPointY * f5, this.Lleg.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Lleg.offsetX, -this.Lleg.offsetY, -this.Lleg.offsetZ);
        GL11.glTranslatef(-this.Lleg.rotationPointX * f5, -this.Lleg.rotationPointY * f5, -this.Lleg.rotationPointZ * f5);
        this.Lleg.render(f5);
        GL11.glPopMatrix();
        this.Lhand.render(f5);
        this.Rhand.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Rmimi.offsetX, this.Rmimi.offsetY, this.Rmimi.offsetZ);
        GL11.glTranslatef(this.Rmimi.rotationPointX * f5, this.Rmimi.rotationPointY * f5, this.Rmimi.rotationPointZ * f5);
        GL11.glScaled(0.9D, 1.0D, 0.8D);
        GL11.glTranslatef(-this.Rmimi.offsetX, -this.Rmimi.offsetY, -this.Rmimi.offsetZ);
        GL11.glTranslatef(-this.Rmimi.rotationPointX * f5, -this.Rmimi.rotationPointY * f5, -this.Rmimi.rotationPointZ * f5);
        this.Rmimi.render(f5);
        GL11.glPopMatrix();
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
		this.Head.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Body.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Skirt.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Lmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Rmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Lmimi2.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Rmimi2.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

			//限界可動範囲
		this.Head.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Lmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Rmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Lmimi2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Rmimi2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Head.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Lmimi.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Rmimi.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Lmimi2.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Rmimi2.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
			//Y
		this.Body.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Skirt.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Lmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
		this.Rmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
		this.Lmimi2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
		this.Rmimi2.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
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
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  0.6373942428283291F;

			} else {

				this.Rleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lhand.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Rhand.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  0.6373942428283291F;
			}

		}

    }

}
