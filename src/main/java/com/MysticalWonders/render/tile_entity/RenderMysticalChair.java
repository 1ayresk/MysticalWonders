package com.MysticalWonders.render.tile_entity;

import org.lwjgl.opengl.GL11;

import com.MysticalWonders.mod.MysticalWondersMain;
import com.MysticalWonders.model.ModelMysticalChair;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderMysticalChair extends TileEntitySpecialRenderer{

	private static final ResourceLocation texture = new ResourceLocation(MysticalWondersMain.modid + ":" + "textures/model/MysticalChair.png");
	
	private ModelMysticalChair model;
	
	public RenderMysticalChair(){
		this.model = new ModelMysticalChair();
	}
	
	
	
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float f) {

		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
		
		GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GL11.glRotatef(180, 0F, 0F, 1F);
		
		this.model.renderModel(0.0625F);
		
		GL11.glPopMatrix();
	}

}
