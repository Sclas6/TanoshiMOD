package tanoshiMob;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import tanoshiCore.TanoshiItemCore;

public class EntityAIGuide extends EntityAIBase {

	EntityCreature owner;

	EntityPlayer target;

	float speed;

	public EntityAIGuide(EntityCreature entity, float f) {
			owner = entity;
			speed = f;
			setMutexBits(3);
	}

@Override
public boolean shouldExecute() {
	target = owner.worldObj.getClosestPlayerToEntity(owner, 15.0D);
	if(target != null) {
		if(owner.getDistanceSqToEntity(target) < 8.0D) {
			// 既に接近してたら何もしない
			return false;
		}
		ItemStack armor1 = target.getCurrentArmor(3);
		if(target.getCurrentArmor(3) != null) {
			if(armor1.getItem() == TanoshiItemCore.ParkBoushi) {
				 //debug
				 //System.out.println("AIPanic startExecute()");
				return true;
			}
		}
	}
	return false;
}

@Override
public boolean continueExecuting() {
	return super.continueExecuting();
}

@Override
public void startExecuting() {
}

@Override
public void resetTask() {
	target = null;
}

@Override
public void updateTask() {
	if(target != null) {
		owner.getNavigator().tryMoveToEntityLiving(target, speed);
	}
}

	}

