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
public class ModelToki extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer head;
    public ModelRenderer Lmimi;
    public ModelRenderer Rmimi;
    public ModelRenderer Rhand;
    public ModelRenderer Lhand;
    public ModelRenderer Sippo;
    public ModelRenderer Skirt;
    public ModelRenderer Neck;
    public ModelRenderer RSippoS;
    public ModelRenderer LSippoS;
    public ModelRenderer RSippoU;
    public ModelRenderer LSippoU;
	public boolean hide = false;
	int pose = 1;

    public ModelToki() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Rhand = new ModelRenderer(this, 27, 14);
        this.Rhand.setRotationPoint(0.4F, 11.3F, 0.0F);
        this.Rhand.addBox(1.0F, -1.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotation(Rhand, 0.0F, 0.0F, -0.47123889803846897F);
        this.RSippoS = new ModelRenderer(this, 56, 8);
        this.RSippoS.setRotationPoint(-0.1F, 17.5F, 0.8F);
        this.RSippoS.addBox(1.0F, 0.6F, 0.0F, 2, 6, 2, 0.1F);
        this.setRotation(RSippoS, 1.2217304763960306F, 0.20943951023931953F, 0.0F);
        this.RSippoU = new ModelRenderer(this, 52, 12);
        this.RSippoU.setRotationPoint(0.0F, 18.7F, 0.0F);
        this.RSippoU.addBox(-1.1F, 4.0F, 0.5F, 1, 3, 1, 0.1F);
        this.setRotation(RSippoU, 1.9198621771937625F, 0.5235987755982988F, 0.0F);
        this.LSippoS = new ModelRenderer(this, 56, 0);
        this.LSippoS.setRotationPoint(0.1F, 17.5F, 0.8F);
        this.LSippoS.addBox(-3.0F, 0.6F, 0.0F, 2, 6, 2, 0.1F);
        this.setRotation(LSippoS, 1.2217304763960306F, -0.20943951023931953F, 0.0F);
        this.Lmimi = new ModelRenderer(this, 58, 16);
        this.Lmimi.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Lmimi.addBox(0.7F, -5.0F, 0.0F, 2, 5, 1, 0.2F);
        this.setRotation(Lmimi, 0.0F, 0.0F, 0.6981317007977318F);
        this.Sippo = new ModelRenderer(this, 36, 13);
        this.Sippo.setRotationPoint(0.0F, 17.0F, 0.8F);
        this.Sippo.addBox(-1.5F, 1.3F, -1.5F, 3, 6, 3, -0.2F);
        this.setRotation(Sippo, 1.7453292519943295F, 0.0F, 0.0F);
        this.Lleg = new ModelRenderer(this, 49, 22);
        this.Lleg.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.Lleg.addBox(0.1F, -0.4F, -1.5F, 3, 7, 3, -0.3F);
        this.Neck = new ModelRenderer(this, 0, 25);
        this.Neck.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.Neck.addBox(-3.0F, -4.6F, -2.5F, 6, 2, 5, 0.0F);
        this.Body = new ModelRenderer(this, 0, 13);
        this.Body.setRotationPoint(0.0F, 14.5F, 0.0F);
        this.Body.addBox(-3.0F, -5.0F, -2.5F, 6, 7, 5, -0.5F);
        this.head = new ModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0.0F, 7.0F, 0.0F);
        this.head.addBox(-4.0F, -3.5F, -3.0F, 8, 7, 6, -0.3F);
        this.LSippoU = new ModelRenderer(this, 52, 8);
        this.LSippoU.setRotationPoint(0.0F, 18.7F, 0.0F);
        this.LSippoU.addBox(-0.1F, 4.0F, 0.5F, 1, 3, 1, 0.1F);
        this.setRotation(LSippoU, 1.9198621771937625F, -0.5235987755982988F, 0.0F);
        this.Rmimi = new ModelRenderer(this, 50, 16);
        this.Rmimi.setRotationPoint(0.0F, 3.5F, 0.0F);
        this.Rmimi.addBox(-2.5F, -5.0F, 0.0F, 2, 5, 1, 0.2F);
        this.setRotation(Rmimi, 0.0F, 0.0F, -0.6981317007977318F);
        this.Rleg = new ModelRenderer(this, 36, 22);
        this.Rleg.setRotationPoint(0.0F, 17.5F, 0.0F);
        this.Rleg.addBox(-3.1F, -0.4F, -1.5F, 3, 7, 3, -0.3F);
        this.Skirt = new ModelRenderer(this, 29, 4);
        this.Skirt.setRotationPoint(0.0F, 15.2F, 0.0F);
        this.Skirt.addBox(-3.0F, 0.8F, -2.5F, 6, 2, 5, 0.4F);
        this.Lhand = new ModelRenderer(this, 27, 23);
        this.Lhand.setRotationPoint(-0.4F, 11.3F, 0.0F);
        this.Lhand.addBox(-3.1F, -1.0F, -1.0F, 2, 7, 2, 0.0F);
        this.setRotation(Lhand, 0.0F, 0.0F, 0.47123889803846897F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		if (this.isChild) {
			float f6 = 2.0F;
			GL11.glPushMatrix();
			GL11.glScalef(1.0F / f6, 1.0F / f6, 1.0F / f6);
			GL11.glTranslatef(0.0F, 24.0F * f5, 0.0F);
	        this.Rhand.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.RSippoS.offsetX, this.RSippoS.offsetY, this.RSippoS.offsetZ);
	        GL11.glTranslatef(this.RSippoS.rotationPointX * f5, this.RSippoS.rotationPointY * f5, this.RSippoS.rotationPointZ * f5);
	        GL11.glScaled(0.8D, 0.8D, 1.0D);
	        GL11.glTranslatef(-this.RSippoS.offsetX, -this.RSippoS.offsetY, -this.RSippoS.offsetZ);
	        GL11.glTranslatef(-this.RSippoS.rotationPointX * f5, -this.RSippoS.rotationPointY * f5, -this.RSippoS.rotationPointZ * f5);
	        this.RSippoS.render(f5);
	        GL11.glPopMatrix();
	        this.RSippoU.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.LSippoS.offsetX, this.LSippoS.offsetY, this.LSippoS.offsetZ);
	        GL11.glTranslatef(this.LSippoS.rotationPointX * f5, this.LSippoS.rotationPointY * f5, this.LSippoS.rotationPointZ * f5);
	        GL11.glScaled(0.8D, 0.8D, 1.0D);
	        GL11.glTranslatef(-this.LSippoS.offsetX, -this.LSippoS.offsetY, -this.LSippoS.offsetZ);
	        GL11.glTranslatef(-this.LSippoS.rotationPointX * f5, -this.LSippoS.rotationPointY * f5, -this.LSippoS.rotationPointZ * f5);
	        this.LSippoS.render(f5);
	        GL11.glPopMatrix();
	        this.Lmimi.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.Sippo.offsetX, this.Sippo.offsetY, this.Sippo.offsetZ);
	        GL11.glTranslatef(this.Sippo.rotationPointX * f5, this.Sippo.rotationPointY * f5, this.Sippo.rotationPointZ * f5);
	        GL11.glScaled(0.8D, 0.8D, 1.0D);
	        GL11.glTranslatef(-this.Sippo.offsetX, -this.Sippo.offsetY, -this.Sippo.offsetZ);
	        GL11.glTranslatef(-this.Sippo.rotationPointX * f5, -this.Sippo.rotationPointY * f5, -this.Sippo.rotationPointZ * f5);
	        this.Sippo.render(f5);
	        GL11.glPopMatrix();
	        this.Lleg.render(f5);
	        this.Neck.render(f5);
	        this.Body.render(f5);
	        this.head.render(f5);
	        this.LSippoU.render(f5);
	        this.Rmimi.render(f5);
	        this.Rleg.render(f5);
	        this.Skirt.render(f5);
	        this.Lhand.render(f5);
	        GL11.glPopMatrix();
}
		else {
	        this.Rhand.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.RSippoS.offsetX, this.RSippoS.offsetY, this.RSippoS.offsetZ);
	        GL11.glTranslatef(this.RSippoS.rotationPointX * f5, this.RSippoS.rotationPointY * f5, this.RSippoS.rotationPointZ * f5);
	        GL11.glScaled(0.8D, 0.8D, 1.0D);
	        GL11.glTranslatef(-this.RSippoS.offsetX, -this.RSippoS.offsetY, -this.RSippoS.offsetZ);
	        GL11.glTranslatef(-this.RSippoS.rotationPointX * f5, -this.RSippoS.rotationPointY * f5, -this.RSippoS.rotationPointZ * f5);
	        this.RSippoS.render(f5);
	        GL11.glPopMatrix();
	        this.RSippoU.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.LSippoS.offsetX, this.LSippoS.offsetY, this.LSippoS.offsetZ);
	        GL11.glTranslatef(this.LSippoS.rotationPointX * f5, this.LSippoS.rotationPointY * f5, this.LSippoS.rotationPointZ * f5);
	        GL11.glScaled(0.8D, 0.8D, 1.0D);
	        GL11.glTranslatef(-this.LSippoS.offsetX, -this.LSippoS.offsetY, -this.LSippoS.offsetZ);
	        GL11.glTranslatef(-this.LSippoS.rotationPointX * f5, -this.LSippoS.rotationPointY * f5, -this.LSippoS.rotationPointZ * f5);
	        this.LSippoS.render(f5);
	        GL11.glPopMatrix();
	        this.Lmimi.render(f5);
	        GL11.glPushMatrix();
	        GL11.glTranslatef(this.Sippo.offsetX, this.Sippo.offsetY, this.Sippo.offsetZ);
	        GL11.glTranslatef(this.Sippo.rotationPointX * f5, this.Sippo.rotationPointY * f5, this.Sippo.rotationPointZ * f5);
	        GL11.glScaled(0.8D, 0.8D, 1.0D);
	        GL11.glTranslatef(-this.Sippo.offsetX, -this.Sippo.offsetY, -this.Sippo.offsetZ);
	        GL11.glTranslatef(-this.Sippo.rotationPointX * f5, -this.Sippo.rotationPointY * f5, -this.Sippo.rotationPointZ * f5);
	        this.Sippo.render(f5);
	        GL11.glPopMatrix();
	        this.Lleg.render(f5);
	        this.Neck.render(f5);
	        this.Body.render(f5);
	        this.head.render(f5);
	        this.LSippoU.render(f5);
	        this.Rmimi.render(f5);
	        this.Rleg.render(f5);
	        this.Skirt.render(f5);
	        this.Lhand.render(f5);
	}
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
		this.head.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
		this.head.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Body.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Skirt.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Neck.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Lmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Rmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

			//限界可動範囲
		this.head.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
		this.head.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0F), -0.15F);
		this.Neck.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
		this.Neck.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0F), -0.15F);
			//Y
		this.Body.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
		this.Skirt.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
		this.Neck.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
		this.Lmimi.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY,0.6F), -0.6F);
		this.Rmimi.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY,0.6F), -0.6F);
		this.Rhand.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
		this.Lhand.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
		this.Rleg.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
		this.Lleg.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
			//X
		this.Rhand.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0.2F), -0.2F);
		this.Lhand.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0.2F), -0.2F);

		this.Rhand.rotateAngleZ = -0.2443461F - p_78087_3_;
		this.Lhand.rotateAngleZ = 0.2443461F + p_78087_3_;

		if (this.pose != 3) {

			if (this.pose == 2) {

				this.Rleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
				this.Rhand.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Lleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Lhand.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.7453292519943295F;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.7453292519943295F;
				this.LSippoU.rotateAngleX = MathHelper.cos(time * 0.6662F) * 0.8F * walkSpeed +  1.9198621771937625F;
				this.LSippoS.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.2217304763960306F;
				this.RSippoU.rotateAngleX = MathHelper.cos(time * 0.6662F) * 0.8F * walkSpeed +  1.7453292519943295F;
				this.RSippoS.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.9198621771937625F;

			} else {

				this.Rleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lhand.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Rhand.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.7453292519943295F;
				this.LSippoU.rotateAngleX = MathHelper.cos(time * 0.6662F) * 0.8F * walkSpeed +  1.9198621771937625F;
				this.LSippoS.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.2217304763960306F;
				this.RSippoU.rotateAngleX = MathHelper.cos(time * 0.6662F) * 0.8F * walkSpeed +  1.7453292519943295F;
				this.RSippoS.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  1.9198621771937625F;
			}

		}

    }
}
