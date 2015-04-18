package com.example.World.Biome;

import java.util.Random;

import com.example.Gen.Tree.MainTreeGen;
import com.example.Gen.Tree.WorldGenBigTree;

import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenForest;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;

public class TestBiome extends BiomeGenBase{
	
	private int field_150632_aF;
    protected static final WorldGenBigTree field_150629_aC = new WorldGenBigTree(false, true);
    protected static final WorldGenBigTree field_150630_aD = new WorldGenBigTree(false, false);
    protected static final WorldGenCanopyTree field_150631_aE = new WorldGenCanopyTree(false);

	public TestBiome(int par1) {
		super(par1);
		
		this.setBiomeName("TestBiome");
		this.minHeight = 0.1f;
		this.maxHeight = 0.6f;
		this.fillerBlock = Blocks.stonebrick.getDefaultState();
		this.topBlock = Blocks.grass.getDefaultState();
		this.spawnableMonsterList.clear();
		
	}
	
	
    public MainTreeGen genTestTreeChance(Random p_150567_1_)
    {
        return (MainTreeGen)(this.field_150632_aF == 3 && p_150567_1_.nextInt(3) > 0 ? field_150631_aE : (this.field_150632_aF != 2 && p_150567_1_.nextInt(5) != 0 ? this.worldGeneratorTrees : field_150630_aD));
    }
    
    
}