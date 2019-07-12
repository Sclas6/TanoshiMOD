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
	public class ModelServal_A extends ModelBase {
		public ModelRenderer Body;
	    public ModelRenderer Tail;
	    public ModelRenderer Tail2;
	    public ModelRenderer BackLeftLeg;
	    public ModelRenderer BackRightLeg;
	    public ModelRenderer FrontLeftLeg;
	    public ModelRenderer FrontRightLeg;
	    public ModelRenderer headmain;
	    public ModelRenderer headnose;
	    public ModelRenderer headear1;
	    public ModelRenderer headear2;

		public boolean hide = false;
		int pose = 1;

	    public ModelServal_A() {
	    	this.FrontRightLeg = new ModelRenderer(this, 9, 9);
	        this.FrontRightLeg.setRotationPoint(0.0F, 16.3F, 0.0F);
	        this.FrontRightLeg.addBox(-2.1F, 0.0F, -4.5F, 2, 8, 2, -0.3F);
	        this.BackRightLeg = new ModelRenderer(this, 17, 19);
	        this.BackRightLeg.setRotationPoint(0.0F, 17.3F, 0.0F);
	        this.BackRightLeg.addBox(-2.1F, 0.0F, 3.0F, 2, 7, 2, -0.3F);
	        this.headear1 = new ModelRenderer(this, 24, 17);
	        this.headear1.setRotationPoint(0.0F, 14.0F, 0.0F);
	        this.headear1.addBox(0.5F, -2.3F, -6.4F, 1, 1, 2, 0.0F);
	        this.headear2 = new ModelRenderer(this, 34, 17);
	        this.headear2.setRotationPoint(0.0F, 14.0F, 0.0F);
	        this.headear2.addBox(-1.5F, -2.3F, -6.4F, 1, 1, 2, 0.0F);
	        this.Body = new ModelRenderer(this, 0, 19);
	        this.Body.setRotationPoint(0.0F, 14.0F, 0.0F);
	        this.Body.addBox(-2.0F, 0.0F, -4.3F, 4, 4, 9, 0.0F);
	        this.Tail2 = new ModelRenderer(this, 27, 25);
	        this.Tail2.setRotationPoint(0.0F, 19.9F, 6.85F);
	        this.Tail2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
	        this.setRotation(Tail2, -0.45378560551852565F, 0.0F, 0.0F);
	        this.BackLeftLeg = new ModelRenderer(this, 0, 19);
	        this.BackLeftLeg.setRotationPoint(0.0F, 17.3F, 0.0F);
	        this.BackLeftLeg.addBox(0.1F, 0.0F, 3.0F, 2, 7, 2, -0.3F);
	        this.headmain = new ModelRenderer(this, 19, 0);
	        this.headmain.setRotationPoint(0.0F, 14.0F, 0.0F);
	        this.headmain.addBox(-2.5F, -2.0F, -9.6F, 5, 5, 5, -0.4F);
	        this.headnose = new ModelRenderer(this, 18, 11);
	        this.headnose.setRotationPoint(0.0F, 14.0F, 0.0F);
	        this.headnose.addBox(-1.5F, 0.1F, -8.4F, 3, 2, 2, 0.0F);
	        this.FrontLeftLeg = new ModelRenderer(this, 0, 9);
	        this.FrontLeftLeg.setRotationPoint(0.0F, 16.3F, 0.0F);
	        this.FrontLeftLeg.addBox(0.1F, 0.0F, -4.5F, 2, 8, 2, -0.3F);
	        this.Tail = new ModelRenderer(this, 25, 17);
	        this.Tail.setRotationPoint(0.0F, 15.8F, 3.4F);
	        this.Tail.addBox(-0.5F, -1.4F, 0.0F, 1, 1, 6, 0.0F);
	        this.setRotation(Tail, -0.9599310885968813F, 0.0F, 0.0F);

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
				this.FrontLeftLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
		        GL11.glTranslatef(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
		        GL11.glScaled(1.0D, 0.9D, 1.0D);
		        GL11.glTranslatef(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
		        GL11.glTranslatef(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
		        this.Body.render(f5);
		        GL11.glPopMatrix();
		        this.BackRightLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headear2.offsetX, this.headear2.offsetY, this.headear2.offsetZ);
		        GL11.glTranslatef(this.headear2.rotationPointX * f5, this.headear2.rotationPointY * f5, this.headear2.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 0.9D, 0.9D);
		        GL11.glTranslatef(-this.headear2.offsetX, -this.headear2.offsetY, -this.headear2.offsetZ);
		        GL11.glTranslatef(-this.headear2.rotationPointX * f5, -this.headear2.rotationPointY * f5, -this.headear2.rotationPointZ * f5);
		        this.headear2.render(f5);
		        GL11.glPopMatrix();
		        this.BackLeftLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.Tail.offsetX, this.Tail.offsetY, this.Tail.offsetZ);
		        GL11.glTranslatef(this.Tail.rotationPointX * f5, this.Tail.rotationPointY * f5, this.Tail.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 1.0D, 0.9D);
		        GL11.glTranslatef(-this.Tail.offsetX, -this.Tail.offsetY, -this.Tail.offsetZ);
		        GL11.glTranslatef(-this.Tail.rotationPointX * f5, -this.Tail.rotationPointY * f5, -this.Tail.rotationPointZ * f5);
		        this.Tail.render(f5);
		        GL11.glPopMatrix();
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.Tail2.offsetX, this.Tail2.offsetY, this.Tail2.offsetZ);
		        GL11.glTranslatef(this.Tail2.rotationPointX * f5, this.Tail2.rotationPointY * f5, this.Tail2.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 1.0D, 0.9D);
		        GL11.glTranslatef(-this.Tail2.offsetX, -this.Tail2.offsetY, -this.Tail2.offsetZ);
		        GL11.glTranslatef(-this.Tail2.rotationPointX * f5, -this.Tail2.rotationPointY * f5, -this.Tail2.rotationPointZ * f5);
		        this.Tail2.render(f5);
		        GL11.glPopMatrix();
		        this.FrontRightLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headmain.offsetX, this.headmain.offsetY, this.headmain.offsetZ);
		        GL11.glTranslatef(this.headmain.rotationPointX * f5, this.headmain.rotationPointY * f5, this.headmain.rotationPointZ * f5);
		        GL11.glScaled(1.0D, 0.9D, 0.8D);
		        GL11.glTranslatef(-this.headmain.offsetX, -this.headmain.offsetY, -this.headmain.offsetZ);
		        GL11.glTranslatef(-this.headmain.rotationPointX * f5, -this.headmain.rotationPointY * f5, -this.headmain.rotationPointZ * f5);
		        this.headmain.render(f5);
		        GL11.glPopMatrix();
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headnose.offsetX, this.headnose.offsetY, this.headnose.offsetZ);
		        GL11.glTranslatef(this.headnose.rotationPointX * f5, this.headnose.rotationPointY * f5, this.headnose.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 1.0D, 1.0D);
		        GL11.glTranslatef(-this.headnose.offsetX, -this.headnose.offsetY, -this.headnose.offsetZ);
		        GL11.glTranslatef(-this.headnose.rotationPointX * f5, -this.headnose.rotationPointY * f5, -this.headnose.rotationPointZ * f5);
		        this.headnose.render(f5);
		        GL11.glPopMatrix();
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headear1.offsetX, this.headear1.offsetY, this.headear1.offsetZ);
		        GL11.glTranslatef(this.headear1.rotationPointX * f5, this.headear1.rotationPointY * f5, this.headear1.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 0.9D, 0.9D);
		        GL11.glTranslatef(-this.headear1.offsetX, -this.headear1.offsetY, -this.headear1.offsetZ);
		        GL11.glTranslatef(-this.headear1.rotationPointX * f5, -this.headear1.rotationPointY * f5, -this.headear1.rotationPointZ * f5);
		        this.headear1.render(f5);
		        GL11.glPopMatrix();

			GL11.glPopMatrix();
	}
			else {
				this.FrontLeftLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.Body.offsetX, this.Body.offsetY, this.Body.offsetZ);
		        GL11.glTranslatef(this.Body.rotationPointX * f5, this.Body.rotationPointY * f5, this.Body.rotationPointZ * f5);
		        GL11.glScaled(1.0D, 0.9D, 1.0D);
		        GL11.glTranslatef(-this.Body.offsetX, -this.Body.offsetY, -this.Body.offsetZ);
		        GL11.glTranslatef(-this.Body.rotationPointX * f5, -this.Body.rotationPointY * f5, -this.Body.rotationPointZ * f5);
		        this.Body.render(f5);
		        GL11.glPopMatrix();
		        this.BackRightLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headear2.offsetX, this.headear2.offsetY, this.headear2.offsetZ);
		        GL11.glTranslatef(this.headear2.rotationPointX * f5, this.headear2.rotationPointY * f5, this.headear2.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 0.9D, 0.9D);
		        GL11.glTranslatef(-this.headear2.offsetX, -this.headear2.offsetY, -this.headear2.offsetZ);
		        GL11.glTranslatef(-this.headear2.rotationPointX * f5, -this.headear2.rotationPointY * f5, -this.headear2.rotationPointZ * f5);
		        this.headear2.render(f5);
		        GL11.glPopMatrix();
		        this.BackLeftLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.Tail.offsetX, this.Tail.offsetY, this.Tail.offsetZ);
		        GL11.glTranslatef(this.Tail.rotationPointX * f5, this.Tail.rotationPointY * f5, this.Tail.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 1.0D, 0.9D);
		        GL11.glTranslatef(-this.Tail.offsetX, -this.Tail.offsetY, -this.Tail.offsetZ);
		        GL11.glTranslatef(-this.Tail.rotationPointX * f5, -this.Tail.rotationPointY * f5, -this.Tail.rotationPointZ * f5);
		        this.Tail.render(f5);
		        GL11.glPopMatrix();
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.Tail2.offsetX, this.Tail2.offsetY, this.Tail2.offsetZ);
		        GL11.glTranslatef(this.Tail2.rotationPointX * f5, this.Tail2.rotationPointY * f5, this.Tail2.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 1.0D, 0.9D);
		        GL11.glTranslatef(-this.Tail2.offsetX, -this.Tail2.offsetY, -this.Tail2.offsetZ);
		        GL11.glTranslatef(-this.Tail2.rotationPointX * f5, -this.Tail2.rotationPointY * f5, -this.Tail2.rotationPointZ * f5);
		        this.Tail2.render(f5);
		        GL11.glPopMatrix();
		        this.FrontRightLeg.render(f5);
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headmain.offsetX, this.headmain.offsetY, this.headmain.offsetZ);
		        GL11.glTranslatef(this.headmain.rotationPointX * f5, this.headmain.rotationPointY * f5, this.headmain.rotationPointZ * f5);
		        GL11.glScaled(1.0D, 0.9D, 0.8D);
		        GL11.glTranslatef(-this.headmain.offsetX, -this.headmain.offsetY, -this.headmain.offsetZ);
		        GL11.glTranslatef(-this.headmain.rotationPointX * f5, -this.headmain.rotationPointY * f5, -this.headmain.rotationPointZ * f5);
		        this.headmain.render(f5);
		        GL11.glPopMatrix();
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headnose.offsetX, this.headnose.offsetY, this.headnose.offsetZ);
		        GL11.glTranslatef(this.headnose.rotationPointX * f5, this.headnose.rotationPointY * f5, this.headnose.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 1.0D, 1.0D);
		        GL11.glTranslatef(-this.headnose.offsetX, -this.headnose.offsetY, -this.headnose.offsetZ);
		        GL11.glTranslatef(-this.headnose.rotationPointX * f5, -this.headnose.rotationPointY * f5, -this.headnose.rotationPointZ * f5);
		        this.headnose.render(f5);
		        GL11.glPopMatrix();
		        GL11.glPushMatrix();
		        GL11.glTranslatef(this.headear1.offsetX, this.headear1.offsetY, this.headear1.offsetZ);
		        GL11.glTranslatef(this.headear1.rotationPointX * f5, this.headear1.rotationPointY * f5, this.headear1.rotationPointZ * f5);
		        GL11.glScaled(0.9D, 0.9D, 0.9D);
		        GL11.glTranslatef(-this.headear1.offsetX, -this.headear1.offsetY, -this.headear1.offsetZ);
		        GL11.glTranslatef(-this.headear1.rotationPointX * f5, -this.headear1.rotationPointY * f5, -this.headear1.rotationPointZ * f5);
		        this.headear1.render(f5);
		        GL11.glPopMatrix();

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
			this.headmain.rotateAngleX = (rotationPitch / (180F / (float) Math.PI));
			this.headmain.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
		this.Body.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
			this.headnose.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
			//this.Ribbon.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
			this.headear1.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
			this.headear2.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

				//限界可動範囲
			this.headmain.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.6F), -0.6F);
			this.headmain.rotateAngleX = Math.max(Math.min(this.headmain.rotateAngleY, 0F), -0.0F);
			this.headnose.rotateAngleX = Math.max(Math.min(this.headmain.rotateAngleY, 0F), -0.0F);
			this.Body.rotateAngleX = Math.max(Math.min(this.headmain.rotateAngleY, 0F), -0.0F);
				//Y
			this.headmain.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.6F), -0.6F);
			this.headnose.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.6F), -0.6F);
			this.Body.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.5F), -0.5F);
			//this.Ribbon.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.6F), -0.6F);
			this.headear1.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY,0.6F), -0.6F);
			this.headear2.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY,0.6F), -0.6F);
			this.FrontRightLeg.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.4F), -0.4F);
			this.FrontLeftLeg.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.4F), -0.4F);
			this.BackRightLeg.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.4F), -0.4F);
			this.BackLeftLeg.rotateAngleY = Math.max(Math.min(this.headmain.rotateAngleY, 0.4F), -0.4F);
				//X
			this.FrontRightLeg.rotateAngleX = Math.max(Math.min(this.headmain.rotateAngleY, 0.2F), -0.2F);
			this.FrontLeftLeg.rotateAngleX = Math.max(Math.min(this.headmain.rotateAngleY, 0.2F), -0.2F);
				/*
			this.Rhand.rotateAngleZ = -0.2443461F - p_78087_3_;
			this.Lhand.rotateAngleZ = 0.2443461F + p_78087_3_;
				 */
			if (this.pose != 3) {

				if (this.pose == 2) {

					this.FrontRightLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
					this.FrontLeftLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
					this.BackRightLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
					this.BackLeftLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
					this.Tail.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed  - 0.9599310885968813F;
					this.Tail2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed - 0.45378560551852565F;

				} else {

					this.FrontRightLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
					this.FrontLeftLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
					this.BackRightLeg.rotateAngleX = MathHelper.cos(time * 0.6662F) * 1.0F * walkSpeed;
					this.BackLeftLeg.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI + 0.3F) * 1.0F * walkSpeed;
					this.Tail.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed  - 0.9599310885968813F;
					this.Tail2.rotateAngleX = MathHelper.cos(time * 0.6662F + (float) Math.PI) * 1.0F * walkSpeed - 0.45378560551852565F;
				}

			}

	    }

	}
