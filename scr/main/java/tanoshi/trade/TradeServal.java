/*package trade;

import java.util.Random;

import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

public class TradeServal implements VillagerRegistry.IVillageTradeHandler {

    //村人の交換を追加する
    @Override
    public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random) {
        //アルミニウム一個をエメラルド一個と交換する
    	recipeList.add(new MerchantRecipe( new ItemStack(Items.emerald, 1, 0), Items.golden_apple));

        //アルミニウム鉱石一個とエメラルド二個とアルミニウム一個を交換する
    	recipeList.add(new MerchantRecipe( new ItemStack(Items.blaze_rod), new ItemStack(Items.emerald, 2, 0)));
    }
}*/