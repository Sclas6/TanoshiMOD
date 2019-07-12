package tanoshiMob.entity;

import net.minecraft.block.Block;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.world.World;

public class EntityFriends extends EntityAnimal {

    public EntityFriends(World world)
    {
        super(world);
	}

	@Override
	public boolean isAIEnabled() {
		return true;
	}

	protected void fall(float p_70069_1_) {
	}

	@Override
	public boolean canBeCollidedWith() {
		return true;
	}

	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
		return EnumCreatureAttribute.UNDEFINED;
	}

	public static final IEntitySelector entitySelectorMyself = new IEntitySelector() {
	@Override
		public boolean isEntityApplicable(Entity p_82704_1_) {
			return p_82704_1_ instanceof EntityServal;
		}
	};
	//繁殖
    public EntityFriends createChild(EntityAgeable p_90011_1_)
    {
        return new EntityFriends(this.worldObj);
    }

	@Override
	protected void func_145780_a(int x, int y, int z, Block block) {
		this.playSound("mob.wolf.step", 0.15F, 1.0F);
	}

	// リード
	@Override
	protected void updateLeashedState() {
		super.updateLeashedState();

		if (this.getLeashed() && this.getLeashedToEntity() != null
				&& this.getLeashedToEntity().worldObj == this.worldObj) {
		}
	}
}
