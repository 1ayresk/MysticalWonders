package com.MysticalWonders.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.MysticalWonders.mod.MysticalWondersMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class MysticTransporterDust extends Item{
	
	public MysticTransporterDust() {
		
	this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
	
	this.setUnlocalizedName("MysticTransporterDust");
	setTextureName("mysticalwonders:MysticTransporterDust");
	
	}

}
