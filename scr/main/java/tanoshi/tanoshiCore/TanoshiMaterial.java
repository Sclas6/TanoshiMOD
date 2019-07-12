package tanoshiCore;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TanoshiMaterial {

	public static Item photondrop;
	// ツールマテリアルの定義
	//public static ToolMaterial OFALENT = EnumHelper.addToolMaterial("OFALENT", 4, 1561, 8.0F, 3.0F, 10);
	public static ArmorMaterial ParkBoushi = EnumHelper.addArmorMaterial("ParkBoushi", 33, new int[] { 0, 0, 0, 0 },
			10);
	//public static ArmorMaterial OFALENA = EnumHelper.addArmorMaterial("OFALENA", 33, new int[] { 3, 8, 6, 3 }, 10);
}