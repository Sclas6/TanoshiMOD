package tanoshiMob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

/**
 * Fennec - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelFennec_A extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Lhand;
    public ModelRenderer Rhand;
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer Head;
    public ModelRenderer Noze;
    public ModelRenderer Lmimi;
    public ModelRenderer Rmimi;
    public ModelRenderer Sippo;
	public boolean hide = false;
	int pose = 1;

    public ModelFennec_A() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Body = new ModelRenderer(this, 0, 20);
        this.Body.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.Body.addBox(-2.0F, -2.0F, -4.0F, 4, 4, 8, 0.0F);
        this.Lmimi = new ModelRenderer(this, 24, 22);
        this.Lmimi.setRotationPoint(0.0F, 16.0F, -3.5F);
        this.Lmimi.addBox(0.3F, -1.4F, -1.4F, 5, 3, 2, -0.3F);
        this.setRotation(Lmimi, 0.0F, 0.0F, -0.7330382858376184F);
        this.Lleg = new ModelRenderer(this, 0, 16);
        this.Lleg.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Lleg.addBox(0.9F, 0.0F, 2.9F, 1, 5, 1, 0.0F);
        this.Lhand = new ModelRenderer(this, 0, 22);
        this.Lhand.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Lhand.addBox(0.9F, 0.0F, -3.0F, 1, 5, 1, 0.0F);
        this.Head = new ModelRenderer(this, 0, 6);
        this.Head.setRotationPoint(0.0F, 16.0F, -3.5F);
        this.Head.addBox(-2.5F, -2.5F, -2.5F, 5, 5, 5, -0.6F);
        this.Rmimi = new ModelRenderer(this, 24, 27);
        this.Rmimi.setRotationPoint(0.0F, 16.0F, -3.5F);
        this.Rmimi.addBox(-5.3F, -1.4F, -1.4F, 5, 3, 2, -0.3F);
        this.setRotation(Rmimi, 0.0F, 0.0F, 0.7330382858376184F);
        this.Sippo = new ModelRenderer(this, 20, 6);
        this.Sippo.setRotationPoint(0.0F, 18.0F, 3.5F);
        this.Sippo.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F);
        this.setRotation(Sippo, -0.6108652381980153F, 0.0F, 0.0F);
        this.Rhand = new ModelRenderer(this, 4, 22);
        this.Rhand.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Rhand.addBox(-1.9F, 0.0F, -3.0F, 1, 5, 1, 0.0F);
        this.Noze = new ModelRenderer(this, 24, 15);
        this.Noze.setRotationPoint(0.0F, 16.0F, -3.5F);
        this.Noze.addBox(-1.5F, -0.3F, -4.4F, 3, 3, 4, -0.8F);
        this.Rleg = new ModelRenderer(this, 4, 16);
        this.Rleg.setRotationPoint(0.0F, 19.0F, 0.0F);
        this.Rleg.addBox(-1.9F, 0.0F, 2.9F, 1, 5, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.Body.render(f5);
        this.Lmimi.render(f5);
        this.Lleg.render(f5);
        this.Lhand.render(f5);
        this.Head.render(f5);
        this.Rmimi.render(f5);
        this.Sippo.render(f5);
        this.Rhand.render(f5);
        this.Noze.render(f5);
        this.Rleg.render(f5);
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
