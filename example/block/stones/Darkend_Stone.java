package com.example.block.stones;

import java.util.Random;

import com.example.block.TestBlock;
import com.example.examplemod.ExampleMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class Darkend_Stone extends Block{

	public Darkend_Stone(Material materialIn) {
		super(materialIn);
		
		this.blockResistance = 5.0f;
		this.setCreativeTab(ExampleMod.testTabs);
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TestBlock.darkend_cobble);
    }
	
	

}
