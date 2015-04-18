package com.example.World;

import java.util.Random;




import net.minecraft.block.BlockSand;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.example.block.TestBlock;
import com.jcraft.jorbis.Block;

public class TestWorldGenOre implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimensionId())
		{
		case -1: 
			generateNether(random,chunkX * 16 , chunkZ * 16 , world);
			break;
		case 0 : 
			generateSurface(random,chunkX * 16 , chunkZ * 16 , world);
			break;
		case 1 : 
			generateEnd(random,chunkX * 16 , chunkZ * 16 , world);
			break;
		default:
			;
		}
	}
	
	
	private void addOre(IBlockState block,Random random, World world , int posX ,int posZ , int minY , int maxY , int minVainSize , int maxVainSize,int spawnChance)
	{
		for (int i = 0; i < spawnChance;i++)
		{
			int defaultChunkSize = 16;
			int xPos = posX + random.nextInt(defaultChunkSize);
			int yPos = minY + random.nextInt(maxY - minY);
			int zPos = posZ + random.nextInt(defaultChunkSize);

			
			new WorldGenMinable(block, (minVainSize + random.nextInt(maxVainSize - minVainSize))).generate(world,random,new BlockPos(xPos,yPos,zPos));
		}
		
	}

	private void generateEnd(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

	private void generateSurface(Random random, int chunkX, int chunkZ, World world) {
		addOre(TestBlock.blue_ore.getDefaultState() ,random, world, chunkX , chunkZ, 20 , 60 , 10 , 30 , 15);
	}

	private void generateNether(Random random, int chunkX, int chunkZ, World world) {
		// TODO Auto-generated method stub
		
	}

}
