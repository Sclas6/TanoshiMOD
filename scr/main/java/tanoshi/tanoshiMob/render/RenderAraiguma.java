package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityAraiguma;
import tanoshiMob.model.ModelAraiguma;

public class RenderAraiguma extends RenderLiving {

	public RenderAraiguma() {
		super(new ModelAraiguma(), 0.5F);
	}

	public void renderAraiguma(EntityAraiguma entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityAraiguma entityliving, double d, double d1, double d2, float f, float f1) {
		renderAraiguma((EntityAraiguma) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityAraiguma entity, double d, double d1, double d2, float f, float f1) {
		renderAraiguma((EntityAraiguma) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Araiguma-texturemap.png");
	}

}