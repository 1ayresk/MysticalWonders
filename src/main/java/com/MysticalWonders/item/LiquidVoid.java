package com.MysticalWonders.item;

import com.MysticalWonders.mod.MysticalWondersMain;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LiquidVoid extends Item{
	
public LiquidVoid() {
		
		this.setCreativeTab(MysticalWondersMain.MysticalWondersTab);
		maxStackSize = 1;
		this.setMaxDamage(600);
}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World w,
			int x, int y, int z, int par7, float par8, float par9, float par10) {
		w = player.worldObj;
		stack.damageItem(1, player);

		final int count = 2;
		final int countSq = count * count;
		for (int a = -count; a < count; a++) {
			for (int b = -count; b < count; b++) {
				for (int c = -count; c < count; c++) {

					if (w.getBlock(a + x, b + y, c + z).getMaterial() == Material.water) {
						w.setBlockToAir(a + x, b + y, c + z);
						stack.damageItem(1, player);
						for (int i = 0; i < 10; i++) {
							w.spawnParticle("explode", a + x, b + y, c + z, 0, 0.1, 0);
						}
					}

					else {
						for (int d = -count; d < count; d++) {
							for (int e = -count; e < count; e++) {
								for (int f = -count; f < count; f++) {

									if (w.getBlock(d + x, e + y, f + z).getMaterial() == Material.lava) {
										w.setBlockToAir(d + x, e + y, f + z);
										stack.damageItem(1, player);
										for (int i = 0; i < 10; i++) {
											w.spawnParticle("explode", d + x, e + y, f + z, 0, 0.1, 0);
										}

										{
											{
												{
													{
														{
															{
																{
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}

						}

					}
				}
			}
		}
		return true;
	}
}
