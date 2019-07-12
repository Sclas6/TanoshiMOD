package tanoshiBlock;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import tanoshiCore.TanoshiItemCore;
import tanoshiCore.TanoshiMod;

public class SandStar extends Block {
	@SideOnly(Side.CLIENT)
	private IIcon TopIcon;

	@SideOnly(Side.CLIENT)
	private IIcon SideIcon;

	public SandStar() {
		super(Material.rock);
		setCreativeTab(TanoshiMod.tabTanoshi);
		setBlockName("SandStar_tile");
		setHardness(1.5F);/* 硬さ */
		setBlockTextureName("tanoshimod:SandStartile");
		setResistance(1.0F);
		setStepSound(Block.soundTypeSand);
		setLightLevel(0.9F);/* 明るさ 1.0F = 15 */
		setHarvestLevel("pickaxe", 2);
}
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("tanoshimod:SandStar2");
        this.SideIcon = par1IconRegister.registerIcon("tanoshimod:SandStar_side");
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
    @Override
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return TanoshiItemCore.SandStar;
    }
    public int quantityDropped(Random p_149745_1_)
    {
        return 1;
    }

	@Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        double l = Math.random()*10;
        double d0 = (double)((float)p_149734_2_ + 0.5F);
        double d1 = (double)((float)p_149734_3_ + 1.4F);
        double d2 = (double)((float)p_149734_4_ + 0.5F);
        double d3 = 0.2199999988079071D;
        double d4 = 0.27000001072883606D;

        if (l <= 3 )
        {
            p_149734_1_.spawnParticle("reddust", d0 - d4, d1 + d3, d2, 0.9843137254901961, 0.3607843137254902, 0.6705882352941176);
        }
        else if ( l >= 4 && l < 7)
        {
            p_149734_1_.spawnParticle("reddust", d0 + d4, d1 + d3, d2, 0.0, 1.0, 0.5686274509803922);
        }
        else
        {
            p_149734_1_.spawnParticle("reddust", d0, d1 + d3, d2 - d4, 0.3607843137254902, 0.8588235294117647, 0.9843137254901961);
        }

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
