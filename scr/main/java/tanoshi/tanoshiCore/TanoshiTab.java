package tanoshiCore;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TanoshiTab extends CreativeTabs {

	public TanoshiTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return TanoshiItemCore.Boss;
	}

}
