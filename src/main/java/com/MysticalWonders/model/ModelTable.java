
package com.MysticalWonders.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTable extends ModelBase
{
  
    ModelRenderer leg_1;
    ModelRenderer leg_2;
    ModelRenderer table_top;
    ModelRenderer Middle_leg;
    ModelRenderer table_foot;
    ModelRenderer table_foot2;
  
  public ModelTable()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      leg_1 = new ModelRenderer(this, 25, 14);
      leg_1.addBox(5F, 16F, 5F, 2, 13, 4);
      leg_1.setRotationPoint(0F, -6F, -7F);
      leg_1.setTextureSize(64, 32);
      leg_1.mirror = true;
      setRotation(leg_1, 0F, 0F, 0F);
      leg_2 = new ModelRenderer(this, 10, 14);
      leg_2.addBox(0F, 0F, 0F, 2, 13, 4);
      leg_2.setRotationPoint(-7F, 10F, -2F);
      leg_2.setTextureSize(64, 32);
      leg_2.mirror = true;
      setRotation(leg_2, 0F, 0F, 0F);
      table_top = new ModelRenderer(this, 0, 38);
      table_top.addBox(0F, 0F, -1F, 16, 2, 16);
      table_top.setRotationPoint(-8F, 8F, -7F);
      table_top.setTextureSize(64, 32);
      table_top.mirror = true;
      setRotation(table_top, 0F, 0F, 0F);
      Middle_leg = new ModelRenderer(this, 17, 3);
      Middle_leg.addBox(0F, 0F, 0F, 16, 1, 2);
      Middle_leg.setRotationPoint(-8F, 17F, -1F);
      Middle_leg.setTextureSize(64, 64);
      Middle_leg.mirror = true;
      setRotation(Middle_leg, 0F, 0F, 0F);
      table_foot = new ModelRenderer(this, 43, 8);
      table_foot.addBox(0F, 0F, 0F, 4, 1, 6);
      table_foot.setRotationPoint(4F, 23F, -3F);
      table_foot.setTextureSize(64, 64);
      table_foot.mirror = true;
      setRotation(table_foot, 0F, 0F, 0F);
      table_foot2 = new ModelRenderer(this, 43, 17);
      table_foot2.addBox(0F, 0F, 0F, 4, 1, 6);
      table_foot2.setRotationPoint(-8F, 23F, -3F);
      table_foot2.setTextureSize(64, 64);
      table_foot2.mirror = true;
      setRotation(table_foot2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    leg_1.render(f5);
    leg_2.render(f5);
    table_top.render(f5);
    Middle_leg.render(f5);
    table_foot.render(f5);
    table_foot2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  public void renderModel(float f) {
	  leg_1.render(f);
	    leg_2.render(f);
	    table_top.render(f);
	    Middle_leg.render(f);
	    table_foot.render(f);
	    table_foot2.render(f);
	  
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5,Entity entity)
  {
	  super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
