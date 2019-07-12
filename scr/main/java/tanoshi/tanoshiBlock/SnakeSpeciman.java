package tanoshiBlock;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import tanoshiCore.TanoshiItemCore;
import tanoshiCore.TanoshiMod;
import tanoshiMob.entity.EntityTutinoko;

public class SnakeSpeciman extends BlockSnow {
	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;

	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;

	public SnakeSpeciman() {
//		super(Material.rock);
		setCreativeTab(TanoshiMod.tabTanoshi);
		setBlockName("Snake_Specimen_block");
		setHardness(1.5F);/* 硬さ */
		setBlockTextureName("tanoshimod:SandStartile");
		setResistance(1.0F);
		setStepSound(Block.soundTypeWood);
		setLightLevel(0.3F);/* 明るさ 1.0F = 15 */
		setHarvestLevel("pickaxe", 1);
}
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("tanoshimod:Snake_Specimen");
        this.SideIcon = par1IconRegister.registerIcon("tanoshimod:Snake_Specimen_side");
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
         if(par1 == 0 || par1 == 1)
         {
                  return TopIcon;
         }
         else
         {
                  return SideIcon;
         }
    }

    @SideOnly(Side.CLIENT)
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX,
			float posY, float posZ) {

		{
			ItemStack armor3 = player.getCurrentArmor(3);
	        ItemStack itemstack = player.inventory.getCurrentItem();
	        if (itemstack != null && itemstack.getItem() == TanoshiItemCore.SandStar &&
	        		player.getCurrentArmor(3) != null && armor3.getItem() == TanoshiItemCore.ParkBoushi)
	        {
	        	if(!world.isRemote) {
	            world.spawnParticle("largeexplode", posX, posY /*+ (double)(height / 2.0F)*/, posZ, 0.0D, 0.0D, 0.0D);
	            world.setBlockToAir(x,y,z);
	            EntityTutinoko entitytutinoko = new EntityTutinoko(world);
	            entitytutinoko.setLocationAndAngles(x, y, z, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
	            entitytutinoko.setHealth(entitytutinoko.getHealth());
	            entitytutinoko.renderYawOffset = entitytutinoko.rotationYaw;
	            world.spawnEntityInWorld(entitytutinoko);
	            world.playSoundEffect(x, y, z, "tanoshimod:SandStar", 1.0F, 1.0F);
	            player.inventory.consumeInventoryItem(TanoshiItemCore.SandStar);
	        	}
	        	else {
	                world.spawnParticle("largeexplode", posX, posY, posZ, 0.0D, 0.0D, 0.0D);
	        	}
	            return true;
	        }
	        else
	        {
	            return super.onBlockActivated(world, x, y, z, player, side, posZ, posZ, posZ);
	        }
		}
	}

    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return null;
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

	@Override
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {

		p_149734_1_.playSoundEffect((double)p_149734_2_ + 0.5D, (double)p_149734_3_ + 0.5D, (double)p_149734_4_ + 0.5D, "random.click", 0.3F, 0.6F);

    }

    protected boolean canSilkHarvest()
    {
        return true;
    }
	/*@Override
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
		this.setBlockBounds(0.16F, 0.0F, 0.16F, 0.84F, 0.1F, 0.84F);
	}*/



}
