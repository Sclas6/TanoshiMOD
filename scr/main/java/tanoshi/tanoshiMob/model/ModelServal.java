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
	public class ModelServal extends ModelBase {
	    public ModelRenderer Body;
	    public ModelRenderer Lleg;
	    public ModelRenderer Rleg;
	    public ModelRenderer head;
	    public ModelRenderer Lmimi;
	    public ModelRenderer Rmimi;
	    public ModelRenderer Lhand;
	    public ModelRenderer Rhand;
	    public ModelRenderer Sippo;
	    public ModelRenderer Skirt;
	    public ModelRenderer Ribbon;
		public boolean hide = false;
		int pose = 1;

	    public ModelServal() {
	        this.textureWidth = 64;
	        this.textureHeight = 32;
	        this.Rleg = new ModelRenderer(this, 36, 22);
	        this.Rleg.setRotationPoint(0.0F, 17.5F, 0.0F);
	        this.Rleg.addBox(-3.1F, -0.4F, -1.5F, 3, 7, 3, -0.2F);
	        this.head = new ModelRenderer(this, 0, 0);
	        this.head.setRotationPoint(0.0F, 7.0F, 0.0F);
	        this.head.addBox(-4.0F, -3.5F, -3.0F, 8, 7, 6, -0.1F);
	        this.Rhand = new ModelRenderer(this, 27, 24);
	        this.Rhand.setRotationPoint(-0.4F, 11.3F, 0.0F);
	        this.Rhand.addBox(-3.5F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
	        this.setRotation(Rhand, 0.0F, 0.0F, 0.3490658503988659F);
	        this.Lleg = new ModelRenderer(this, 49, 22);
	        this.Lleg.setRotationPoint(0.0F, 17.5F, 0.0F);
	        this.Lleg.addBox(0.1F, -0.4F, -1.5F, 3, 7, 3, -0.2F);
	        this.Rmimi = new ModelRenderer(this, 0, 26);
	        this.Rmimi.setRotationPoint(0.0F, 3.5F, 0.0F);
	        this.Rmimi.addBox(-2.5F, -5.0F, 0.0F, 2, 5, 1, 0.2F);
	        this.setRotation(Rmimi, 0.0F, 0.0F, -0.08726646259971647F);
	        this.Sippo = new ModelRenderer(this, 36, 13);
	        this.Sippo.setRotationPoint(0.0F, 17.9F, 0.8F);
	        this.Sippo.addBox(-1.5F, 0.0F, -1.5F, 3, 6, 3, -0.2F);
	        this.setRotation(Sippo, 0.6373942428283291F, 0.0F, 0.0F);
	        this.Body = new ModelRenderer(this, 0, 13);
	        this.Body.setRotationPoint(0.0F, 14.5F, 0.0F);
	        this.Body.addBox(-3.0F, -5.0F, -2.5F, 6, 7, 5, -0.3F);
	        this.Skirt = new ModelRenderer(this, 29, 4);
	        this.Skirt.setRotationPoint(0.0F, 14.5F, 0.0F);
	        this.Skirt.addBox(-3.0F, 0.8F, -2.5F, 6, 3, 5, 0.5F);
	        this.Ribbon = new ModelRenderer(this, 14, 26);
	        this.Ribbon.setRotationPoint(0.0F, 14.5F, 0.0F);
	        this.Ribbon.addBox(-1.5F, -4.5F, 0.1F, 3, 3, 3, 0.0F);
	        this.setRotation(Ribbon, 0.7853981633974483F, 0.0F, 0.0F);
	        this.Lmimi = new ModelRenderer(this, 7, 26);
	        this.Lmimi.setRotationPoint(0.0F, 3.5F, 0.0F);
	        this.Lmimi.addBox(0.7F, -5.0F, 0.0F, 2, 5, 1, 0.2F);
	        this.setRotation(Lmimi, 0.0F, 0.0F, 0.08726646259971647F);
	        this.Lhand = new ModelRenderer(this, 27, 15);
	        this.Lhand.setRotationPoint(0.4F, 11.3F, 0.0F);
	        this.Lhand.addBox(1.5F, 0.0F, -1.0F, 2, 6, 2, 0.0F);
	        this.setRotation(Lhand, 0.0F, 0.0F, -0.3490658503988659F);

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
	        this.head.render(f5);
	        this.Rleg.render(f5);
	        this.Lleg.render(f5);
	        this.Sippo.render(f5);
	        this.Rmimi.render(f5);
	        this.Lmimi.render(f5);
	        this.Lhand.render(f5);
	        this.Body.render(f5);
	        this.Skirt.render(f5);
	        this.Ribbon.render(f5);
			GL11.glPopMatrix();
	}
			else {
	        this.Rhand.render(f5);
	        this.head.render(f5);
	        this.Rleg.render(f5);
	        this.Lleg.render(f5);
	        this.Sippo.render(f5);
	        this.Rmimi.render(f5);
	        this.Lmimi.render(f5);
	        this.Lhand.render(f5);
	        this.Body.render(f5);
	        this.Skirt.render(f5);
	        this.Ribbon.render(f5);
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
			this.Ribbon.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
			this.Lmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));
			this.Rmimi.rotateAngleY = (rotationYaw / (180F / (float) Math.PI));

				//限界可動範囲
			this.head.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
			this.head.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0F), -0.15F);
				//Y
			this.Body.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
			this.Skirt.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
			this.Ribbon.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.6F), -0.6F);
			this.Lmimi.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY,0.6F), -0.6F);
			this.Rmimi.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY,0.6F), -0.6F);
			this.Rhand.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
			this.Lhand.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
			this.Rleg.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
			this.Lleg.rotateAngleY = Math.max(Math.min(this.head.rotateAngleY, 0.5F), -0.5F);
				//X
			this.Rhand.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0.2F), -0.2F);
			this.Lhand.rotateAngleX = Math.max(Math.min(this.head.rotateAngleY, 0.2F), -0.2F);
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
