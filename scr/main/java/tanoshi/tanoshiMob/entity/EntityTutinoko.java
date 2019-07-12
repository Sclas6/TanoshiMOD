package tanoshiMob.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tanoshiCore.TanoshiItemCore;

public class EntityTutinoko extends EntityFriends {

	/** The time until the next egg is spawned. */
	public EntityTutinoko(World world) {
		super(world);

		this.setSize(0.6F, 1.2F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.5D));
		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, TanoshiItemCore.Japari_Coin, false));
		this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(4, new EntityAIAvoidEntity(this, EntityZombie.class, 1, 1.5, 1.3));
		this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
      //独自AI パークガイドの帽子装備プレイヤーを追いかける entity speed 1.2
      //this.tasks.addTask(5, new EntityAIGuide(this, 1.0F));
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
		return new EntityTutinoko(this.worldObj);
	}/*
	public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_.getItem() == Items.wheat_seeds;
    }*/

	@Override
    public EntityTutinoko createChild(EntityAgeable p_90011_1_)
    {
        return new EntityTutinoko(this.worldObj);
    }

	@Override
	@SideOnly(Side.CLIENT)
	    public boolean interact(EntityPlayer p_70085_1_) {
	        ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
	        if (itemstack != null && itemstack.getItem() == TanoshiItemCore.Japari_Coin)
	        {
	        	if(!worldObj.isRemote) {
	            worldObj.spawnParticle("fireworksSpark", posX, posY /*+ (double)(height / 2.0F)*/, posZ, 0.0D, 0.0D, 0.0D);
	            playSound("tanoshimod:japari_coin", 1.0F, 1.0F);
	            p_70085_1_.inventory.consumeInventoryItem(TanoshiItemCore.Japari_Coin);
	            	if(this.onGround == true) {
	            		this.jump();
	            		}
	        	}
	            return true;
	        }
	        else
	        {
	            return super.interact(p_70085_1_);
	        }
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
