package com.MysticalWonders.item;

import com.MysticalWonders.mod.MysticalWondersMain;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class Fireextinguisher extends Item{
	
	public Fireextinguisher() {
		
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
		maxStackSize = 1;
		this.setMaxDamage(64);

		

	}
	
	@Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World w, int x, int y, int z, int par7, float par8, float par9, float par10){
		w=player.worldObj;
		if(player.isBurning()){
			player.extinguish();
			stack.damageItem(1, player);
		}
		
		final int count=2; 
		final int countSq=count*count;
		for(int a=-count; a<count;a++){
			for(int b=-count; b<count;b++){
				for(int c=-count; c<count;c++){
	
					if(w.getBlock(a+x, b+y, c+z).getMaterial()==Material.fire){
						w.setBlockToAir(a+x, b+y, c+z);
						stack.damageItem(1, player);
						for(int i=0; i<10; i++){
							w.spawnParticle("explode", a+x, b+y, c+z, 0,0.1,0);
						}
					}
				}
			}
		}
		return true;
	}

	
	@Override
    public boolean itemInteractionForEntity(ItemStack ext, EntityPlayer player, EntityLivingBase target){
        boolean result=false;
        if(player.isBurning()){
        	player.extinguish();
        	result=true;
        }else if(target.isBurning()){
        	target.extinguish();
        	result=true;
        }
        if(result){
        	ext.damageItem(1, target);
			for(int i=0; i<10; i++){
				target.worldObj.spawnParticle("explode", target.posX, target.posY, target.posZ, 0,0.1,0);
			}
        }
		return result;
    }

	}
	

		