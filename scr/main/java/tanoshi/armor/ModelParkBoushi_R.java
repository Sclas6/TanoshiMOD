package armor;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 4.1.1
 */
public class ModelParkBoushi_R extends ModelBiped {
    public ModelRenderer shape9;
    public ModelRenderer shape10;
    public ModelRenderer shape11;
    public ModelRenderer shape12;

    public ModelParkBoushi_R(float expand) {

  	  super(expand, 0, 64, 64);

  	this.textureWidth = 64;
    this.textureHeight = 64;
    this.shape9 = new ModelRenderer(this, 0, 49);
    this.shape9.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape9.addBox(-6.5F, -6.0F, -6.5F, 13, 2, 13, 0.0F);
    this.shape10 = new ModelRenderer(this, 0, 33);
    this.shape10.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape10.addBox(-5.5F, -10.4F, -5.5F, 11, 5, 11, -0.6F);
    this.shape11 = new ModelRenderer(this, 0, 50);
    this.shape11.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape11.addBox(4.6F, -11.8F, -5.5F, 1, 9, 2, 0.0F);
    this.setRotateAngle(shape11, -0.5235987755982988F, 0.0F, 0.0F);
 /* this.shape12 = new ModelRenderer(this, 6, 50);
    this.shape12.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.shape12.addBox(-5.5F, -11.8F, -5.5F, 1, 9, 2, 0.0F);
    this.setRotateAngle(shape12, -0.5235987755982988F, 0.0F, 0.0F);
 */

        shape9.addChild(shape10);
        this.bipedHead.addChild(shape9);

        this.bipedRightArm.addChild(shape11);
    //  this.bipedLeftArm.addChild(shape12);

        shape10.addChild(shape11);
    //  shape10.addChild(shape12);

    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
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
