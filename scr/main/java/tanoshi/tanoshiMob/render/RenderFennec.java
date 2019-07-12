package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityFennec;
import tanoshiMob.model.ModelFennec;

public class RenderFennec extends RenderLiving {

	public RenderFennec() {
		super(new ModelFennec(), 0.5F);
	}

	public void renderFennec(EntityFennec entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityFennec entityliving, double d, double d1, double d2, float f, float f1) {
		renderFennec((EntityFennec) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityFennec entity, double d, double d1, double d2, float f, float f1) {
		renderFennec((EntityFennec) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Fennec-texturemap.png");
	}

}