package com.MysticalWonders.item;

import java.util.List;

import com.MysticalWonders.mod.MysticalWondersMain;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MysticTransporter extends Item{
	
	public MysticTransporter() {
		
	this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
	}
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(MysticalWondersMain.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
