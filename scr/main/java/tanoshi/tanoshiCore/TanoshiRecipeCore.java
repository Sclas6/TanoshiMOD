package tanoshiCore;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class TanoshiRecipeCore {

	public static void registerRecipe() {
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.Japariman, 8),
				new Object[] { "XXX", "XYX", "XXX", 'X', Items.wheat, 'Y', TanoshiItemCore.SandStar });
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.Japari_Coin, 4),
				new Object[] { "XXX", "XYX", "XXX", 'X', Items.gold_nugget, 'Y', TanoshiItemCore.SandStar });
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.Red_feather),
				new Object[] { "YX ", "XZX", "ZXA", 'X', TanoshiItemCore.SandStar, 'Y',new ItemStack(Items.dye, 1, 1), 'Z', Items.feather, 'A',new ItemStack(Items.dye, 1, 14)});
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.Blue_feather),
				new Object[] { "YX ", "XZX", "ZXA", 'X', TanoshiItemCore.SandStar, 'Y',new ItemStack(Items.dye, 1, 12), 'Z', Items.feather, 'A',new ItemStack(Items.dye, 1, 4)});
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.Boushi),
				new Object[] { "XXX", "XYX", 'X', Blocks.wool, 'Y', Items.string });
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.ParkBoushi_R),
				new Object[] { "XY", 'X', TanoshiItemCore.Boushi, 'Y', TanoshiItemCore.Red_feather });
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.ParkBoushi_B),
				new Object[] { "YX", 'X', TanoshiItemCore.Boushi, 'Y', TanoshiItemCore.Blue_feather });
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.ParkBoushi),
				new Object[] { "YX", 'X', TanoshiItemCore.ParkBoushi_R, 'Y', TanoshiItemCore.Blue_feather });
		GameRegistry.addRecipe(new ItemStack(TanoshiItemCore.ParkBoushi),
				new Object[] { "YX", 'X', TanoshiItemCore.ParkBoushi_B, 'Y', TanoshiItemCore.Red_feather });
		GameRegistry.addRecipe(new ItemStack(TanoshiMod.SnakeSpecimen),
				new Object[] { "XYA", "YZY", "ZYX", 'X', Items.string, 'Y', Items.leather, 'Z', Items.bone, 'A', Items.spider_eye });

	}
}