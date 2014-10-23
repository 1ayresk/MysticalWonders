package com.MysticalWonders.mod;

import com.MysticalWonders.blocks.RainMaker;
import com.MysticalWonders.blocks.Table;
import com.MysticalWonders.render.item.ItemRenderMysticalChest;
import com.MysticalWonders.render.tile_entity.ItemRenderMysticalChair;
import com.MysticalWonders.render.tile_entity.MysticalChestRenderer;
import com.MysticalWonders.render.tile_entity.RenderGlassStair;
import com.MysticalWonders.render.tile_entity.RenderMysticalChair;
import com.MysticalWonders.render.tile_entity.RenderTable;
import com.MysticalWonders.tile_entity.MysticalTileEntity;


import com.MysticalWonders.tile_entity.TileEntityGlassStair;
import com.MysticalWonders.tile_entity.TileEntityMysticalChair;
import com.MysticalWonders.tile_entity.TileEntityMysticalChest;
import com.MysticalWonders.tile_entity.TileEntityTable;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.Fluid;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = MysticalWondersMain.modid, version = MysticalWondersMain.VERSION)

public class MysticalWondersMain

{

    public static final String modid = "mysticalwonders";
    
    public static CreativeTabs MysticalWondersTab;

    public static final String VERSION = "0.1";


//Blocks
public static Block MysticalChair;

public static Block MysticalChest;

public static Block GlassStair;

public static Block Rainjumper;

public static Block RainMaker;

public static Block Table;


//Items
public static Item MysticTransporter;

public static Item MysticTransporterDust;

public static Item Fireextinguisher;

public static Item LiquidVoid;

//Crops

//Fluids



    @EventHandler
    public void PreInit(FMLPreInitializationEvent preEvent) {
    	
    	//Mystical Chest
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMysticalChest.class, new MysticalChestRenderer());
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MysticalWondersMain.MysticalChest), new ItemRenderMysticalChest());
		
		//MysticalChair
		TileEntitySpecialRenderer render = new RenderMysticalChair();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMysticalChair.class, render);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MysticalWondersMain.MysticalChair), new ItemRenderMysticalChair(render, new TileEntityMysticalChair()));
		
		//Glass Stair
		TileEntitySpecialRenderer render1 = new RenderGlassStair();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGlassStair.class, render1);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MysticalWondersMain.GlassStair), new com.MysticalWonders.render.tile_entity.ItemRenderGlassStair());
    	
		//Table
		TileEntitySpecialRenderer render2 = new RenderTable();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTable.class, render2);
		MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MysticalWondersMain.Table), new com.MysticalWonders.render.tile_entity.ItemRenderTable());
		
    	//Creative Tabs
    	MysticalWondersTab = new CreativeTabs("MysticalWonders"){ 
    		@SideOnly(Side.CLIENT)
    		public Item getTabIconItem(){
    		return Item.getItemFromBlock(Blocks.diamond_block);
    	}
    	};
    	
    	MysticalChest = new com.MysticalWonders.blocks.MysticalChest(0).setBlockName("MysticalChest").setCreativeTab(MysticalWondersMain.MysticalWondersTab).setBlockTextureName("mysticalwonders:MysticalChest");
    	GameRegistry.registerBlock(MysticalChest, MysticalChest.getUnlocalizedName());
    	
    	MysticalChair = new com.MysticalWonders.blocks.MysticalChair(Material.wood).setBlockName("MysticalChair").setBlockTextureName("mysticalwonders:MysticalChair");;
    	GameRegistry.registerBlock(MysticalChair, MysticalChair.getUnlocalizedName());
    	
    	GlassStair = new com.MysticalWonders.blocks.GlassStair(Material.glass).setBlockName("GlassStair").setBlockTextureName("mysticalwonders:GlassStair");;
    	GameRegistry.registerBlock(GlassStair, GlassStair.getUnlocalizedName());
    	
    	Rainjumper = new com.MysticalWonders.blocks.Rainjumper(Material.cloth).setBlockName("Rainjumper").setBlockTextureName("mysticalwonders:Rainjumper");;
    	GameRegistry.registerBlock(Rainjumper, Rainjumper.getUnlocalizedName());
    	
    	RainMaker = new com.MysticalWonders.blocks.RainMaker(Material.cloth).setBlockName("RainMaker").setBlockTextureName("mysticalwonders:RainMaker");;
    	GameRegistry.registerBlock(RainMaker, RainMaker.getUnlocalizedName());
    	
    	Table = new com.MysticalWonders.blocks.Table(Material.wood).setBlockName("Table").setBlockTextureName("mysticalwonders:Table");;
    	GameRegistry.registerBlock(Table, Table.getUnlocalizedName());

    	
    	//Items
    	
    	//Transport Dust
    	MysticTransporterDust = new com.MysticalWonders.item.MysticTransporterDust().setUnlocalizedName("MysticalTransporterDust").setTextureName("mysticalwonders:MysticalTransporterDust");
    	GameRegistry.registerItem(MysticTransporterDust, "MysticalTransporterDust");  	
    	//MysticalBook
    	
    	//Fire_extinguisher
    	Fireextinguisher = new com.MysticalWonders.item.Fireextinguisher().setUnlocalizedName("Fireextinguisher").setTextureName("mysticalwonders:Fireextinguisher");
    	GameRegistry.registerItem(Fireextinguisher, "Fireextinguisher");
    	
    	//LiquidVoid
    	LiquidVoid = new com.MysticalWonders.item.LiquidVoid().setUnlocalizedName("LiquidVoid").setTextureName("mysticalwonders:LiquidVoid");
    	GameRegistry.registerItem(LiquidVoid, "LiquidVoid");
    	
    	
    	//Fluids
    	
    	//Mystical Water
    	
     
 
    }

    @EventHandler
    public void Init(FMLInitializationEvent event){
    	
    }

    {
    	//Recipes
    	
    	

    }

}
