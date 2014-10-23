package com.MysticalWonders.tile_entity;

import com.MysticalWonders.mod.MysticalWondersMain;

import cpw.mods.fml.common.registry.GameRegistry;


public class MysticalTileEntity {
	
	public static void mainRegistry(){
		registerTileEntity();
	}

	private static void registerTileEntity() {
		GameRegistry.registerTileEntity(TileEntityMysticalChest.class, MysticalWondersMain.modid);
		
	}

}
