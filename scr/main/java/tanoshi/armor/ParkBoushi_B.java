package armor;

import tanoshiCore.TanoshiMod;

public class ParkBoushi_B extends ParkBoushi{

	public ParkBoushi_B(ArmorMaterial material, int render_idx, int type) {
		super(material, render_idx, type);

		this.setMaxStackSize(1);
		this.setCreativeTab(TanoshiMod.tabTanoshi);

	}
}