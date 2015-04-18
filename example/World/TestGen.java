package com.example.World;

import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestGen {
	
	public static void mainReg()
	{
		initWorldGen();
	}
	
	public static void initWorldGen()
	{
		regWorldGen(new TestWorldGenOre(),1);
	}
	
	public static void regWorldGen(IWorldGenerator worldGenClass , int weightedProberbility)
	{
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProberbility);
	}

}
