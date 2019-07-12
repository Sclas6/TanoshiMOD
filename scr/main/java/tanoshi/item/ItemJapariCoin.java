package item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSnowball;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemJapariCoin extends ItemSnowball {

    public ItemJapariCoin()
    {
        this.maxStackSize = 64;
    }

@Override
    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
	   if(p_77659_3_.isSneaking()){
        return p_77659_1_;
    }
	   else {
	        if (!p_77659_3_.capabilities.isCreativeMode)
	        {
	            --p_77659_1_.stackSize;
	        }

	        p_77659_2_.playSoundAtEntity(p_77659_3_, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!p_77659_2_.isRemote)
	        {
	            p_77659_2_.spawnEntityInWorld(new EntityJapariCoin(p_77659_2_, p_77659_3_));
	        }
	        return p_77659_1_;
       }
    }

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IIconRegister par1IconRegister) {
	this.itemIcon = par1IconRegister.registerIcon("tanoshimod:japari_coin");
}

}