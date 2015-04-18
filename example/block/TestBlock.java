package com.example.block;

import com.example.block.stones.Darkend_Cobble;
import com.example.block.stones.Darkend_Stone;
import com.example.strings.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestBlock {
	
	public static void reg()
	{
		initBlock();
		regBlock();
	}
	
	public static Block blue_ore;
	public static Block portal_test;
	public static Block darkend_cobble;
	public static Block darkend_stone;
	
	public static void initBlock()
	{
		blue_ore = new Blue_Ore(Material.packedIce).setUnlocalizedName("blue_ore");
		portal_test = new Portal_Test().setUnlocalizedName("portal_test");
		darkend_cobble = new Darkend_Cobble(Material.ground).setUnlocalizedName("darkend_cobble");
		darkend_stone = new Darkend_Stone(Material.ground).setUnlocalizedName("darkend_stone");
	}
	
	public static void regBlock()
	{
		GameRegistry.registerBlock(blue_ore, blue_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(portal_test, portal_test.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkend_cobble, darkend_cobble.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(darkend_stone, darkend_stone.getUnlocalizedName().substring(5));
	}
	
	public static void regRenders()
	{
		regRender(blue_ore);
		regRender(portal_test);
		regRender(darkend_stone);
		regRender(darkend_cobble);
		
	}
	
	public static void regRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new  ModelResourceLocation(Reference.Mod_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}

}
