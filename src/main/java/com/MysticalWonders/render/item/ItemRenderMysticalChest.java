package com.MysticalWonders.render.item;

import com.MysticalWonders.tile_entity.TileEntityMysticalChest;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRenderMysticalChest implements IItemRenderer {
	
	private ModelChest chestModel;
	
	public ItemRenderMysticalChest(){
		chestModel = new ModelChest();
		
	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item,
			ItemRendererHelper helper) {
		
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityMysticalChest(), 0.0D, 0.0D, 0.0D, 0.0F);
		

	}

}
