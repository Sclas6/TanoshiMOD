package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityServal_A;
import tanoshiMob.model.ModelServal_A;

public class RenderServal_A extends RenderLiving {

	public RenderServal_A() {
		super(new ModelServal_A(), 0.5F);
	}

	public void renderServal_A(EntityServal_A entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityServal_A entityliving, double d, double d1, double d2, float f, float f1) {
		renderServal_A((EntityServal_A) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityServal_A entity, double d, double d1, double d2, float f, float f1) {
		renderServal_A((EntityServal_A) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Serval_A-texturemap.png");
	}

}