package com.MysticalWonders.blocks;

import com.MysticalWonders.mod.MysticalWondersMain;
import com.MysticalWonders.tile_entity.TileEntityMysticalChair;
import com.MysticalWonders.tile_entity.TileEntityMysticalChest;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockRailBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityMinecartEmpty;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class MysticalChair extends BlockContainer {

	public MysticalChair(Material wood) {
		super(wood);
		
		this.setHardness(1F);
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
		this.setBlockBounds(0f, 0f, 0f, 1f, 0.6875F, 1F);
	}
      public int getRenderType(){
	       return -1;
 }
 
      public boolean renderAsNormalBlock()
      {
          return false;
      }

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		
		return new TileEntityMysticalChair();
	}
	  public boolean isOpaqueCube()
	    {
	        return false;
	    }

	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcon(IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(MysticalWondersMain.modid + ":" + this.getUnlocalizedName().substring(5));
	}

}
