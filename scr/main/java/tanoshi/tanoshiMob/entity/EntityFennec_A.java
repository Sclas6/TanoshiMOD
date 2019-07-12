package tanoshiMob.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import tanoshiCore.TanoshiItemCore;

public class EntityFennec_A extends EntityAnimal {

	/** The time until the next egg is spawned. */
	public EntityFennec_A(World world) {
		super(world);

		this.setSize(0.6F, 1.2F);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new EntityAIPanic(this, 1.5D));
//		this.tasks.addTask(5, new EntityAITempt(this, 1.0D, Items.wheat_seeds, false));
		this.tasks.addTask(4, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		this.tasks.addTask(3, new EntityAIAvoidEntity(this, EntityZombie.class, 1, 1.5, 1.3));
		this.tasks.addTask(7, new EntityAILookIdle(this));
        //this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
	}

	@Override
	public boolean isAIEnabled() {
		return true;
	}

	public int getGrowingAge() {
		return this.dataWatcher.getWatchableObjectInt(12);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);

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
			return p_82704_1_ instanceof EntityFennec_A;
		}
	};
	//繁殖
	protected EntityLiving createInstance() {
		return new EntityFennec_A(this.worldObj);
	}
/*	public boolean isBreedingItem(ItemStack p_70877_1_)
    {
        return p_70877_1_.getItem() == Items.wheat_seeds;
    }
*/
    public EntityFennec_A createChild(EntityAgeable p_90011_1_)
    {
        return new EntityFennec_A(this.worldObj);
    }

    //サンドスターによるフレンズ化処理
@Override
@SideOnly(Side.CLIENT)
    public boolean interact(EntityPlayer p_70085_1_) {
		ItemStack armor3 = p_70085_1_.getCurrentArmor(3);
        ItemStack itemstack = p_70085_1_.inventory.getCurrentItem();
        if (itemstack != null && itemstack.getItem() == TanoshiItemCore.SandStar &&
        	p_70085_1_.getCurrentArmor(3) != null && armor3.getItem() == TanoshiItemCore.ParkBoushi)
        {
        	if(!worldObj.isRemote) {
            worldObj.spawnParticle("fireworksSpark", posX, posY /*+ (double)(height / 2.0F)*/, posZ, 0.0D, 0.0D, 0.0D);
            setDead();
            EntityFennec entityFennec = new EntityFennec(worldObj);
            entityFennec.setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
            entityFennec.setHealth(this.getHealth());
            entityFennec.renderYawOffset = renderYawOffset;
            worldObj.spawnEntityInWorld(entityFennec);
            playSound("tanoshimod:SandStar", 1.0F, 1.0F);
            p_70085_1_.inventory.consumeInventoryItem(TanoshiItemCore.SandStar);
        	}
        	else {
                worldObj.spawnParticle("largeexplode", posX, posY + (double)(height / 2.0F), posZ, 0.0D, 0.0D, 0.0D);
        	}
            return true;
        }
        else
        {
            return super.interact(p_70085_1_);
        }
    }
	//ここまで
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
	public float getSoundVolume()
    {
        return 0.4F;
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

	@Override
	protected void dropFewItems(boolean p_70628_1_, int p_70628_2_) {
		if (this.isBurning()) {
			//this.dropItem(TanoshiItemCore.Boss, 1);
		} else {
			//this.dropItem(TanoshiItemCore.Boss, 1);
		}
	}

}
