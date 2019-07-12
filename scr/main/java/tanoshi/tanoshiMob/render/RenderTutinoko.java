package tanoshiMob.render;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import tanoshiMob.entity.EntityTutinoko;
import tanoshiMob.model.ModelTutinoko;

public class RenderTutinoko extends RenderLiving {

	public RenderTutinoko() {
		super(new ModelTutinoko(), 0.5F);
	}

	public void renderTutinoko(EntityTutinoko entity, double d, double d1, double d2, float f, float f1) {
		super.doRender(entity, d, d1, d2, f, f1);
	}

	public void doRenderLiving(EntityTutinoko entityliving, double d, double d1, double d2, float f, float f1) {
		renderTutinoko((EntityTutinoko) entityliving, d, d1, d2, f, f1);
	}

	public void doRender(EntityTutinoko entity, double d, double d1, double d2, float f, float f1) {
		renderTutinoko((EntityTutinoko) entity, d, d1, d2, f, f1);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("tanoshimod:textures/mobs/Tutinoko-texturemap.png");
	}

}