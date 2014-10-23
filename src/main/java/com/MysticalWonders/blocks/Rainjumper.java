package com.MysticalWonders.blocks;

import com.MysticalWonders.mod.MysticalWondersMain;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;

public class Rainjumper extends Block{

	public Rainjumper(Material p_i45394_1_) {
		super(p_i45394_1_);
		
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
		
		
	}
	public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity) 
	{
		par1World.rainingStrength = 1f;
		par5Entity.motionY += 1D;
		
	}

}
