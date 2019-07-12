package armor;

import tanoshiCore.TanoshiMod;

public class Boushi extends ParkBoushi{

	public Boushi(ArmorMaterial material, int render_idx, int type) {
		super(material, render_idx, type);

		this.setMaxStackSize(1);
		this.setCreativeTab(TanoshiMod.tabTanoshi);

	}
}