package com.example.Items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.example.strings.Reference;


public class TItems {
	
	public static Item test_item;
	public static Item portal_opener;
	
	public static void init()
	{
		test_item = new Item().setUnlocalizedName("test_item");
		portal_opener = new Portal_Opener().setUnlocalizedName("portal_opener");
	}
	
	public static void register()
	{
		GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(portal_opener, portal_opener.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(test_item);
		registerRender(portal_opener);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new  ModelResourceLocation(Reference.Mod_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}

	
}
