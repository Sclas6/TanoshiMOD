package food;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemJapariman extends ItemFood {

	public ItemJapariman(int i, float par3, boolean flag) {
		super(i, par3, flag);

	}

	@Override
	public int getMaxItemUseDuration(ItemStack itemStack) {
		return 15;
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.eat;
	}

}
