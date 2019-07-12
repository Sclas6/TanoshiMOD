package tanoshiMob.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Boss - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelBoss extends ModelBase {
    public ModelRenderer Lleg;
    public ModelRenderer Rleg;
    public ModelRenderer Body;
    public ModelRenderer RmimiS;
    public ModelRenderer LmimiS;
    public ModelRenderer RmimiU;
    public ModelRenderer LmimiU;
    public ModelRenderer SippoT;
    public ModelRenderer SippoS;
    public ModelRenderer Belt;
    public ModelRenderer button;

    public ModelBoss() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Rleg = new ModelRenderer(this, 40, 14);
        this.Rleg.setRotationPoint(0.0F, 22.3F, -1.8F);
        this.Rleg.addBox(-5.0F, 0.0F, -4.0F, 4, 2, 7, -0.3F);
        this.Lleg = new ModelRenderer(this, 40, 23);
        this.Lleg.setRotationPoint(0.0F, 22.3F, -1.8F);
        this.Lleg.addBox(1.0F, 0.0F, -4.0F, 4, 2, 7, -0.3F);
        this.SippoS = new ModelRenderer(this, 30, 13);
        this.SippoS.setRotationPoint(0.0F, 22.3F, -1.8F);
        this.SippoS.addBox(-1.5F, -3.5F, 5.3F, 3, 3, 5, -0.3F);
        this.setRotateAngle(SippoS, -0.17453292519943295F, 0.0F, 0.0F);
        this.RmimiS = new ModelRenderer(this, 0, 7);
        this.RmimiS.setRotationPoint(0.0F, 9.1F, -1.5F);
        this.RmimiS.addBox(-5.0F, 1.0F, -0.7F, 4, 4, 4, -0.2F);
        this.setRotateAngle(RmimiS, -0.05235987755982988F, 0.0F, 0.0F);
        this.LmimiS = new ModelRenderer(this, 16, 7);
        this.LmimiS.setRotationPoint(0.0F, 9.1F, -1.5F);
        this.LmimiS.addBox(1.0F, 1.0F, -0.7F, 4, 4, 4, -0.2F);
        this.setRotateAngle(LmimiS, -0.05235987755982988F, 0.0F, 0.0F);
        this.RmimiU = new ModelRenderer(this, 0, 1);
        this.RmimiU.setRotationPoint(0.0F, 9.1F, -1.5F);
        this.RmimiU.addBox(-4.0F, -1.7F, 0.4F, 2, 3, 2, 0.2F);
        this.setRotateAngle(RmimiU, -0.05235987755982988F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 0, 15);
        this.Body.setRotationPoint(0.0F, 9.1F, -1.5F);
        this.Body.addBox(-5.5F, 4.0F, -2.5F, 11, 10, 7, -0.3F);
        this.setRotateAngle(Body, -0.05235987755982988F, 0.0F, 0.0F);
        this.LmimiU = new ModelRenderer(this, 9, 1);
        this.LmimiU.setRotationPoint(0.0F, 9.1F, -1.5F);
        this.LmimiU.addBox(2.0F, -1.7F, 0.4F, 2, 3, 2, 0.2F);
        this.setRotateAngle(LmimiU, -0.05235987755982988F, 0.0F, 0.0F);
        this.SippoT = new ModelRenderer(this, 18, 0);
        this.SippoT.setRotationPoint(0.0F, 22.3F, -1.8F);
        this.SippoT.addBox(-1.5F, -3.5F, 3.5F, 3, 3, 3, 0.0F);
        this.setRotateAngle(SippoT, -0.17453292519943295F, 0.0F, 0.0F);
        this.Belt = new ModelRenderer(this, 28, 0);
        this.Belt.setRotationPoint(0.0F, 9.1F, -1.5F);
        this.Belt.addBox(-5.5F, 9.0F, -2.5F, 11, 1, 7, 0.1F);
        this.setRotateAngle(Belt, -0.05235987755982988F, 0.0F, 0.0F);
        this.button = new ModelRenderer(this, 34, 8);
        this.button.setRotationPoint(0.0F, 8.8F, -1.5F);
        this.button.addBox(-1.0F, 11.0F, -2.8F, 2, 2, 2, -0.2F);
        this.setRotateAngle(button, -0.05235987755982988F, 0.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Rleg.render(f5);
        this.Lleg.render(f5);
        this.SippoS.render(f5);
        this.RmimiS.render(f5);
        this.LmimiS.render(f5);
        this.RmimiU.render(f5);
        this.Body.render(f5);
        this.LmimiU.render(f5);
        this.SippoT.render(f5);
        this.Belt.render(f5);
        this.button.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}

