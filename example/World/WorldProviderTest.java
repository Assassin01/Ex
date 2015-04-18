package com.example.World;

import com.example.examplemod.ExampleMod;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderTest extends WorldProvider
{
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkMangerTest(worldObj.getSeed(), null, worldObj.getWorldInfo().getGeneratorOptions());
		this.dimensionId = ExampleMod.dimensionId;
	}
	
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderTest(worldObj, worldObj.getSeed(), true, worldObj.getWorldInfo().getGeneratorOptions());
	}
	
	@Override
	public String getDimensionName()
	{
		return "Tutorial";
	}

	@Override
	public String getInternalNameSuffix() {
		return "Test";
	}
}