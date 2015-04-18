package com.example.Tabs;

import com.example.Items.TItems;
import com.example.block.TestBlock;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class testTabs extends CreativeTabs {

	public testTabs(int id , String name)
	{
		super(id,name);
	}

	@Override
	public Item getTabIconItem() {
		
		return TItems.test_item;
	}

}
