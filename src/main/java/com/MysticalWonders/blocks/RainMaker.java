package com.MysticalWonders.blocks;

import com.MysticalWonders.mod.MysticalWondersMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class RainMaker extends Block {

	public RainMaker(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
	
		
	
	}
	public boolean onBlockActivated(World par1World, int x, int y, int z, EntityPlayer par5Entity, int par6, float f1, float f2, float f3){

			par1World.setRainStrength(10F);
			{
		
	return true;
    }
	}
	
}

	
	



