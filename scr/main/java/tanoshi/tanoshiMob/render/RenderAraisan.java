package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityAraisan;
import tanoshiMob.model.ModelAraisan;

public class RenderAraisan extends RenderLiving {

	public RenderAraisan() {
		super(new ModelAraisan(), 0.5F);
	}

	public void renderAraisan(EntityAraisan entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityAraisan entityliving, double d, double d1, double d2, float f, float f1) {
		renderAraisan((EntityAraisan) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityAraisan entity, double d, double d1, double d2, float f, float f1) {
		renderAraisan((EntityAraisan) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Araisan-texturemap.png");
	}

}