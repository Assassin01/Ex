package com.example.block;

import com.example.examplemod.ExampleMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Blue_Ore extends Block {

	protected Blue_Ore(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(ExampleMod.testTabs);
	}

}
