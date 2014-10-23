package com.MysticalWonders.blocks;

import java.util.Random;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.MysticalWonders.mod.MysticalWondersMain;
import com.MysticalWonders.tile_entity.TileEntityGlassStair;
import com.MysticalWonders.tile_entity.TileEntityTable;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Table extends BlockContainer{

	public Table(Material p_i45386_1_) {
		super(p_i45386_1_);
		
		
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
		this.setBlockBounds(0f, 0f, 0f, 1f, 1F, 1f);
		
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

   public boolean isOpaqueCube()
   {
       return false;
   }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return new TileEntityTable();
	}
	@SideOnly(Side.CLIENT)
	public void registerBlockIcon(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(MysticalWondersMain.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
