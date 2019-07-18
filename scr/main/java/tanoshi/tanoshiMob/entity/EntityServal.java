package tanoshiMob.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import tanoshiMob.EntityAIGuide;

public class EntityServal extends EntityFriends {

	/** The time until the next egg is spawned. */
	public EntityServal(World world) {
		super(world);

		this.setSize(0.6F, 1.2F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.5D));
//		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, Items.wheat_seeds, false));
		this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityZombie.class, 1, 1.5, 1.3));
		this.tasks.addTask(7, new EntityAILookIdle(this));
        //this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
      //迢ｬ閾ｪAI 繝代�ｼ繧ｯ繧ｬ繧､繝峨�ｮ蟶ｽ蟄占｣�蛯吶�励Ξ繧､繝､繝ｼ繧定ｿｽ縺�縺九￠繧� entity speed 1.2
        this.tasks.addTask(5, new EntityAIGuide(this, 1.3F));
	}
	public int getGrowingAge() {
		return this.dataWatcher.getWatchableObjectInt(12);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	}

	protected EntityLiving createInstance() {
		return new EntityServal(this.worldObj);
	}
/*	public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_.getItem() == Items.wheat_seeds;
    }
*/
	@Override
    public EntityServal createChild(EntityAgeable p_90011_1_)
    {
        return new EntityServal(this.worldObj);
    }

    @Override
    public String getLivingSound() {
    	return null;
    }

    @Override
    public String getHurtSound() {
    	return null;
    }

    @Override
    public String getDeathSound() {
    	return /*"psomod:rappy_die"*/null;
    }

	@Override
	protected void func_145780_a(int x, int y, int z, Block block) {
		this.playSound("mob.wolf.step", 0.15F, 1.0F);
	}

	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if (this.isBurning()) {
//			this.dropItem(TanoshiItemCore.Boss, 1);
		} else {
//			this.dropItem(TanoshiItemCore.Boss, 1);
		}
	}

}
