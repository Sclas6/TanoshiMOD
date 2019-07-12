package tanoshiMob.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Araiguma - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelAraiguma extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer Lhand;
    public ModelRenderer Rhand;
    public ModelRenderer Head;
    public ModelRenderer Noze;
    public ModelRenderer Lmimi;
    public ModelRenderer Rmimi;
    public ModelRenderer Sippo;
	public boolean hide = false;
	int pose = 1;

    public ModelAraiguma() {
    	this.textureWidth = 64;
        this.textureHeight = 32;
        this.Lmimi = new ModelRenderer(this, 33, 27);
        this.Lmimi.setRotationPoint(0.0F, 17.3F, 0.0F);
        this.Lmimi.addBox(-1.1F, -4.0F, -4.5F, 3, 3, 2, -0.5F);
        this.setRotation(Lmimi, 0.0F, 0.0F, 0.3490658503988659F);
        this.Head = new ModelRenderer(this, 32, 0);
        this.Head.setRotationPoint(0.0F, 17.3F, 0.0F);
        this.Head.addBox(-3.5F, -3.0F, -6.1F, 7, 6, 6, -1.0F);
        this.setRotation(Head, -0.05235987755982988F, 0.0F, 0.0F);
        this.Sippo = new ModelRenderer(this, 33, 16);
        this.Sippo.setRotationPoint(0.0F, 18.6F, 0.0F);
        this.Sippo.addBox(-1.5F, -5.4F, 3.7F, 3, 3, 7, -0.3F);
        this.setRotation(Sippo, -0.7285004297824331F, 0.0F, 0.0F);
        this.Lhand = new ModelRenderer(this, 1, 10);
        this.Lhand.setRotationPoint(0.0F, 21.6F, 1.5F);
        this.Lhand.addBox(1.0F, -2.7F, -5.0F, 2, 7, 2, -0.2F);
        this.setRotation(Lhand, -0.05235987755982988F, 0.0F, -0.5235987755982988F);
        this.Lleg = new ModelRenderer(this, 1, 19);
        this.Lleg.setRotationPoint(0.0F, 22.0F, 1.5F);
        this.Lleg.addBox(0.5F, -3.0F, 2.3F, 2, 6, 2, -0.2F);
        this.setRotation(Lleg, 0.0F, 0.0F, -0.3490658503988659F);
        this.Body = new ModelRenderer(this, 0, 17);
        this.Body.setRotationPoint(0.0F, 18.6F, 1.5F);
        this.Body.addBox(-3.0F, -2.5F, -5.0F, 6, 5, 10, -0.2F);
        this.setRotation(Body, -0.05235987755982988F, 0.0F, 0.0F);
        this.Rhand = new ModelRenderer(this, 23, 10);
        this.Rhand.setRotationPoint(0.0F, 21.6F, 1.5F);
        this.Rhand.addBox(-3.0F, -2.7F, -5.0F, 2, 7, 2, -0.2F);
        this.setRotation(Rhand, -0.05235987755982988F, 0.0F, 0.5235987755982988F);
        this.Noze = new ModelRenderer(this, 25, 0);
        this.Noze.setRotationPoint(0.0F, 17.3F, 0.0F);
        this.Noze.addBox(-1.0F, 0.0F, -6.2F, 2, 2, 2, -0.6F);
        this.setRotation(Noze, -0.05235987755982988F, 0.0F, 0.0F);
        this.Rleg = new ModelRenderer(this, 23, 19);
        this.Rleg.setRotationPoint(0.0F, 22.0F, 1.5F);
        this.Rleg.addBox(-2.5F, -3.0F, 2.3F, 2, 6, 2, -0.2F);
        this.setRotation(Rleg, 0.0F, 0.0F, 0.3490658503988659F);
        this.Rmimi = new ModelRenderer(this, 44, 27);
        this.Rmimi.setRotationPoint(0.0F, 17.3F, 0.0F);
        this.Rmimi.addBox(-1.9F, -4.0F, -4.5F, 3, 3, 2, -0.5F);
        this.setRotation(Rmimi, 0.0F, 0.0F, -0.3490658503988659F);
    }

	@Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.Lmimi.render(f5);
        this.Rhand.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Head.offsetX, this.Head.offsetY, this.Head.offsetZ);
        GL11.glTranslatef(this.Head.rotationPointX * f5, this.Head.rotationPointY * f5, this.Head.rotationPointZ * f5);
        GL11.glScaled(0.8D, 1.0D, 1.0D);
        GL11.glTranslatef(-this.Head.offsetX, -this.Head.offsetY, -this.Head.offsetZ);
        GL11.glTranslatef(-this.Head.rotationPointX * f5, -this.Head.rotationPointY * f5, -this.Head.rotationPointZ * f5);
        this.Head.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
        GL11.glTranslatef(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
        GL11.glScaled(0.8D, 0.9D, 1.0D);
        GL11.glTranslatef(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
        GL11.glTranslatef(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
        this.Body.render(f5);
        GL11.glPopMatrix();
        this.Lhand.render(f5);
        this.Sippo.render(f5);
        this.Lleg.render(f5);
        this.Noze.render(f5);
        this.Rleg.render(f5);
        this.Rmimi.render(f5);
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
		this.Lmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Rmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

			//限界可動範囲
		this.Head.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Lmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Rmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Noze.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Head.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Lmimi.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Rmimi.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Noze.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
		this.Sippo.rotateAngleX = Math.max(Math.min(this.Head.rotateAngleY, 0F), -0.15F);
			//Y
		this.Body.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Noze.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY, 0.6F), -0.6F);
		this.Lmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
		this.Rmimi.rotateAngleY = Math.max(Math.min(this.Head.rotateAngleY,0.6F), -0.6F);
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
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  -0.7285004297824331F;

			} else {

				this.Rleg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lhand.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed;
				this.Lleg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Rhand.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
				this.Sippo.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed +  -0.7285004297824331F;
			}

		}

    }

}
