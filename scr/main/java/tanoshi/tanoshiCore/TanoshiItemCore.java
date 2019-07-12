package tanoshiCore;

import cpw.mods.fml.common.registry.GameRegistry;
import food.ItemJapariman;
import item.ItemBoss;
import item.ItemJapariCoin;
import item.ItemSandStar;
import net.minecraft.item.Item;

public class TanoshiItemCore {

	public static Item Boss;
	public static Item Japariman;
	public static Item SandStar;
	public static Item ParkBoushi;
	public static Item ParkBoushi_R;
	public static Item ParkBoushi_B;
	public static Item Boushi;
	public static Item Red_feather;
	public static Item Blue_feather;
	public static Item Japari_Coin;

	public static void registerItem(TanoshiMod mod) {

		Boss = new ItemBoss();
		Boss.setUnlocalizedName("RuckyBeast");
		Boss.setCreativeTab(TanoshiMod.tabTanoshi);
		Boss.setTextureName("tanoshimod:Boss");
		GameRegistry.registerItem(Boss, "RuckyBeast");

		Japariman = new ItemJapariman(4, 0.9F, false);
		Japariman.setCreativeTab(TanoshiMod.tabTanoshi);
		Japariman.setUnlocalizedName("Japariman");
		Japariman.setTextureName("tanoshimod:Japariman");
		GameRegistry.registerItem(Japariman, "Japariman");

		SandStar = new ItemSandStar();
		SandStar.setUnlocalizedName("SandStar");
		SandStar.setCreativeTab(TanoshiMod.tabTanoshi);
		SandStar.setTextureName("tanoshimod:SandStar");
		GameRegistry.registerItem(SandStar, "SandStar");

		ParkBoushi = new armor.ParkBoushi(TanoshiMaterial.ParkBoushi, 1, 0).setUnlocalizedName("park_boushi");
    	GameRegistry.registerItem(ParkBoushi, "ParkBoushi");
		ParkBoushi_R = new armor.ParkBoushi_R(TanoshiMaterial.ParkBoushi, 1, 0).setUnlocalizedName("park_boushi_r");
    	GameRegistry.registerItem(ParkBoushi_R, "ParkBoushi_R");
		ParkBoushi_B = new armor.ParkBoushi_B(TanoshiMaterial.ParkBoushi, 1, 0).setUnlocalizedName("park_boushi_b");
    	GameRegistry.registerItem(ParkBoushi_B, "ParkBoushi_B");
		Boushi = new armor.Boushi(TanoshiMaterial.ParkBoushi, 1, 0).setUnlocalizedName("park_boushi_0");
    	GameRegistry.registerItem(Boushi, "Boushi");

    	Red_feather = new Item();
    	Red_feather.setUnlocalizedName("Red_Feather");
    	Red_feather.setCreativeTab(TanoshiMod.tabTanoshi);
    	Red_feather.setTextureName("tanoshimod:red_feather");
		GameRegistry.registerItem(Red_feather, "Red_Feather");

		Blue_feather = new Item();
		Blue_feather.setUnlocalizedName("Blue_Feather");
		Blue_feather.setCreativeTab(TanoshiMod.tabTanoshi);
		Blue_feather.setTextureName("tanoshimod:blue_feather");
		GameRegistry.registerItem(Blue_feather, "Blue_Feather");

		Japari_Coin = new ItemJapariCoin();
		Japari_Coin.setUnlocalizedName("Japari_Coin");
		Japari_Coin.setCreativeTab(TanoshiMod.tabTanoshi);
		Japari_Coin.setTextureName("tanoshimod:japari_coin");
		GameRegistry.registerItem(Japari_Coin, "Japari_Coin");

		return;
	}
}