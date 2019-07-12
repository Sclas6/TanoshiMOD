package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityToki;
import tanoshiMob.model.ModelToki;

public class RenderToki extends RenderChicken {

	public RenderToki() {
		super(new ModelToki(), 0.5F);
	}

	public void renderToki(EntityToki entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityToki entityliving, double d, double d1, double d2, float f, float f1) {
		renderToki((EntityToki) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityToki entity, double d, double d1, double d2, float f, float f1) {
		renderToki((EntityToki) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Toki-texturemap.png");
	}

}