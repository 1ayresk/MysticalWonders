package com.MysticalWonders.blocks;

import java.util.Random;

import com.MysticalWonders.mod.MysticalWondersMain;
import com.MysticalWonders.tile_entity.TileEntityGlassStair;
import com.MysticalWonders.tile_entity.TileEntityMysticalChair;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GlassStair extends BlockContainer{

	public GlassStair(Material p_i45386_1_) {
		super(p_i45386_1_);
		
		
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
		this.setBlockBounds(0f, 0f, 0f, 1f, 0.375F, 1F);
	}
    public int getRenderType(){
	       return -1;
}

   public boolean renderAsNormalBlock()
   {
       return false;
   }
   public int quantityDropped(Random p_149745_1_)
   {
       return 0;
   }
   protected boolean canSilkHarvest()
   {
       return true;
   }
   public boolean isOpaqueCube()
   {
       return false;
   }
	@SideOnly(Side.CLIENT)
	public void registerBlockIcon(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(MysticalWondersMain.modid + ":" + this.getUnlocalizedName().substring(5));
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return new TileEntityGlassStair();
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcon(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(MysticalWondersMain.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
