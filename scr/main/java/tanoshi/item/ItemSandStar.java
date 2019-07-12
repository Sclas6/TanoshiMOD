package item;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.Facing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import tanoshiCore.TanoshiItemCore;
import tanoshiMob.entity.EntityBoss;

public class ItemSandStar extends Item
{

	@Override
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {






		ItemStack armor3 = player.getCurrentArmor(3);
		if (player.getCurrentArmor(3) != null) {
			if (armor3.getItem() == TanoshiItemCore.ParkBoushi) {
				player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 30*20, 4));
	            player.inventory.consumeInventoryItem(TanoshiItemCore.SandStar);
				{
					player.swingProgress = 0;
				}
			}
		}





		return itemstack;
	}

	@Override
	public boolean onItemUse(ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, int side,
			float posX, float posY, float posZ) {
		// サーバー側の場合は処理をスキップする
		if (world.isRemote) {
			return true;
		} else {
			Block block = world.getBlock(x, y, z);
			x += Facing.offsetsXForSide[side];
			y += Facing.offsetsYForSide[side];
			z += Facing.offsetsZForSide[side];
			double height = 0.0D;

			if (side == 1 && block.getRenderType() == 11) {
				height = 0.5D;
			}

			Entity entity = spawnEntity(world, (double) x + 0.5D, (double) y + height, (double) z + 0.5D);

			if (entity != null) {

				if (!player.capabilities.isCreativeMode) {
					--itemStack.stackSize;
				}
			}

			return true;
		}
	}




	public Entity spawnEntity(World world, double x, double y, double z) {
		EntityBoss entityliving = new EntityBoss(world);
		entityliving.setLocationAndAngles(x, y, z, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F),
				0.0F);
		entityliving.rotationYawHead = entityliving.rotationYaw;
		entityliving.renderYawOffset = entityliving.rotationYaw;
		entityliving.onSpawnWithEgg((IEntityLivingData) null);
		world.spawnEntityInWorld(entityliving);
		entityliving.playLivingSound();
		return entityliving;
	}
}
