package proxy;

import java.util.HashMap;
import java.util.Map;

import armor.ModelBoushi;
import armor.ModelParkBoushi;
import armor.ModelParkBoushi_B;
import armor.ModelParkBoushi_R;
import cpw.mods.fml.client.registry.RenderingRegistry;
import item.EntityJapariCoin;
import item.RenderJapariCoin;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import tanoshiCore.TanoshiItemCore;

public class ProxyClient extends ProxyCommon {

	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();

	public static void register_renderers(){

		ModelParkBoushi parkboushi = new ModelParkBoushi(1F);

		armorModels.put(TanoshiItemCore.ParkBoushi, parkboushi);


		ModelParkBoushi_R parkboushi_r = new ModelParkBoushi_R(1F);

		armorModels.put(TanoshiItemCore.ParkBoushi_R, parkboushi_r);

		ModelParkBoushi_B parkboushi_b = new ModelParkBoushi_B(1F);

		armorModels.put(TanoshiItemCore.ParkBoushi_B, parkboushi_b);

		ModelBoushi boushi = new ModelBoushi(1F);

		armorModels.put(TanoshiItemCore.Boushi, boushi);

		RenderingRegistry.registerEntityRenderingHandler(EntityJapariCoin.class, new RenderJapariCoin(TanoshiItemCore.Japari_Coin));

	}

}