package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityBoss;
import tanoshiMob.model.ModelBoss;

public class RenderBoss extends RenderLiving {

	public RenderBoss() {
		super(new ModelBoss(), 0.5F);
	}

	public void renderBoss(EntityBoss entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityBoss entityliving, double d, double d1, double d2, float f, float f1) {
		renderBoss((EntityBoss) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityBoss entity, double d, double d1, double d2, float f, float f1) {
		renderBoss((EntityBoss) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Boss-texturemap.png");
	}

}