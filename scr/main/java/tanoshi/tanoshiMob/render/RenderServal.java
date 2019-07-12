package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityServal;
import tanoshiMob.model.ModelServal;

public class RenderServal extends RenderLiving {

	public RenderServal() {
		super(new ModelServal(), 0.5F);
	}

	public void renderServal(EntityServal entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityServal entityliving, double d, double d1, double d2, float f, float f1) {
		renderServal((EntityServal) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityServal entity, double d, double d1, double d2, float f, float f1) {
		renderServal((EntityServal) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Serval-texturemap.png");
	}

}