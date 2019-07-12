package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityFennec_A;
import tanoshiMob.model.ModelFennec_A;

public class RenderFennec_A extends RenderLiving {

	public RenderFennec_A() {
		super(new ModelFennec_A(), 0.5F);
	}

	public void renderFennec_A(EntityFennec_A entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityFennec_A entityliving, double d, double d1, double d2, float f, float f1) {
		renderFennec_A((EntityFennec_A) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityFennec_A entity, double d, double d1, double d2, float f, float f1) {
		renderFennec_A((EntityFennec_A) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Fennec_A-texturemap.png");
	}

}