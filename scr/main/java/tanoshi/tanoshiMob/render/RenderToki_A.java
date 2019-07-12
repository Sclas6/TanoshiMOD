package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderChicken;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityToki_A;
import tanoshiMob.model.ModelToki_A;

public class RenderToki_A extends RenderChicken {

	public RenderToki_A() {
		super(new ModelToki_A(), 0.5F);
	}

	public void renderToki_A(EntityToki_A entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityToki_A entityliving, double d, double d1, double d2, float f, float f1) {
		renderToki_A((EntityToki_A) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityToki_A entity, double d, double d1, double d2, float f, float f1) {
		renderToki_A((EntityToki_A) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/ModelToki_A-texturemap.png");
	}

}