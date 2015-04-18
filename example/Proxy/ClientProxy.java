package com.example.Proxy;

import com.example.Items.TItems;
import com.example.block.TestBlock;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders()
	{
		TItems.registerRenders();
		TestBlock.regRenders();
	}

}
