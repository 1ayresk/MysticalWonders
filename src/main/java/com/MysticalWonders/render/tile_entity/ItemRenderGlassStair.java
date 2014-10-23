package com.MysticalWonders.render.tile_entity;

import org.lwjgl.opengl.GL11;

import com.MysticalWonders.tile_entity.TileEntityMysticalChair;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

public class ItemRenderGlassStair implements IItemRenderer{
	
	TileEntitySpecialRenderer render;
	private TileEntity entity;
	
	
	public ItemRenderGlassStair() {
		this.entity = entity;
		this.render = render;
		
	}

	public ItemRenderGlassStair(TileEntitySpecialRenderer render2,
			TileEntityMysticalChair tileEntityMysticalChair) {
		
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,ItemRendererHelper helper) {
		
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		
		if (type == IItemRenderer.ItemRenderType.ENTITY)
			GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
		this.render.renderTileEntityAt(this.entity, 0.00, 0.00, 0.00, 0.0F);
	}

}
