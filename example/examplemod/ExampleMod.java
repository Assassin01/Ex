package com.example.examplemod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.example.Items.TItems;
import com.example.Proxy.CommonProxy;
import com.example.Tabs.testTabs;
import com.example.World.TestGen;
import com.example.World.WorldProviderTest;
import com.example.block.TestBlock;
import com.example.strings.Reference;

@Mod(modid = Reference.Mod_ID, version = Reference.Mod_Name , name = Reference.Mod_Version)
public class ExampleMod
{
    
	public static CreativeTabs testTabs = new testTabs(CreativeTabs.getNextID(),"Test Taby!");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final int dimensionId = 9;
	
	//Biomes
	public static final BiomeGenBase TestBiome = new com.example.World.Biome.TestBiome(30);
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	proxy.registerRenders();
    	DimensionManager.registerProviderType(this.dimensionId, WorldProviderTest.class, false);
    	DimensionManager.registerDimension(this.dimensionId, this.dimensionId);
    	
    }
    
    @EventHandler
    public void Preinit(FMLPreInitializationEvent event)
    {

    	TestBlock.reg();
    	TItems.init();
    	TItems.register();
    	TestGen.mainReg();
    }
    
    @EventHandler
    public void Postinit(FMLPostInitializationEvent event)
    {

    }
}
