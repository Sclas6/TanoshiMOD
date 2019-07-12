package tanoshiCore;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderSurface;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class SandStarGenerator implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider instanceof WorldProviderSurface) {
			generateOre(world, random, chunkX << 4, chunkZ << 4);
		}
	}

	private void generateOre(World world, Random random, int chunkX, int chunkZ) {
		for(int i = 0; i < 50; i++) {
			int genX = chunkX + random.nextInt(16);
			int genY = 2 + random.nextInt(128);
			int genZ = chunkZ + random.nextInt(16);
			new WorldGenMinable(TanoshiMod.SandStar_tile, 0, 4, Blocks.grass).generate(world, random, genX, genY, genZ);
		}
	}

}