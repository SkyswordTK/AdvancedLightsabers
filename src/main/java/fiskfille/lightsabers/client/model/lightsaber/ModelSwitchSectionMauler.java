package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionMauler extends ModelBase
{
    public ModelRenderer body1;
    public ModelRenderer bottomConnector1;
    public ModelRenderer topConnector1;
    public ModelRenderer button1_1;
    public ModelRenderer button2_1;
    public ModelRenderer body2;
    public ModelRenderer body3;
    public ModelRenderer body4;
    public ModelRenderer body5;
    public ModelRenderer body6;
    public ModelRenderer body7;
    public ModelRenderer body8;
    public ModelRenderer bottomConnector2;
    public ModelRenderer bottomConnector3;
    public ModelRenderer bottomConnector4;
    public ModelRenderer bottomConnector5;
    public ModelRenderer bottomConnector6;
    public ModelRenderer bottomConnector7;
    public ModelRenderer bottomConnector8;
    public ModelRenderer topConnector2;
    public ModelRenderer topConnector3;
    public ModelRenderer topConnector4;
    public ModelRenderer topConnector5;
    public ModelRenderer topConnector6;
    public ModelRenderer topConnector7;
    public ModelRenderer topConnector8;
    public ModelRenderer button1_2;
    public ModelRenderer button1_3;
    public ModelRenderer button1_4;
    public ModelRenderer button1_5;
    public ModelRenderer button1_6;
    public ModelRenderer button1_7;
    public ModelRenderer button1_8;
    public ModelRenderer button2_2;
    public ModelRenderer button2_3;
    public ModelRenderer button2_4;
    public ModelRenderer button2_5;
    public ModelRenderer button2_6;
    public ModelRenderer button2_7;
    public ModelRenderer button2_8;

    public ModelSwitchSectionMauler()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.button1_5 = new ModelRenderer(this, 8, 0);
        this.button1_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_5, 0.0F, 3.141592653589793F, 0.0F);
        this.button2_5 = new ModelRenderer(this, 8, 7);
        this.button2_5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_5.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_5, 0.0F, 3.141592653589793F, 0.0F);
        this.body5 = new ModelRenderer(this, 0, 3);
        this.body5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body5.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body5, 0.0F, 3.141592653589793F, 0.0F);
        this.bottomConnector8 = new ModelRenderer(this, 0, 0);
        this.bottomConnector8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector8.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector8, 0.0F, -0.7853981633974483F, 0.0F);
        this.button2_8 = new ModelRenderer(this, 8, 7);
        this.button2_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.button1_8 = new ModelRenderer(this, 8, 0);
        this.button1_8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_8.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_8, 0.0F, -0.7853981633974483F, 0.0F);
        this.button2_2 = new ModelRenderer(this, 8, 7);
        this.button2_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.button1_3 = new ModelRenderer(this, 8, 0);
        this.button1_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.button1_7 = new ModelRenderer(this, 8, 0);
        this.button1_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.button2_1 = new ModelRenderer(this, 8, 7);
        this.button2_1.setRotationPoint(0.0F, -5.0F, -3.62F);
        this.button2_1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_1, 1.5707963267948966F, 0.0F, 0.0F);
        this.topConnector3 = new ModelRenderer(this, 0, 0);
        this.topConnector3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector3.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector3, 0.0F, 1.5707963267948966F, 0.0F);
        this.button2_4 = new ModelRenderer(this, 8, 7);
        this.button2_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_4, 0.0F, 2.356194490192345F, 0.0F);
        this.topConnector8 = new ModelRenderer(this, 0, 0);
        this.topConnector8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector8.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector8, 0.0F, -0.7853981633974483F, 0.0F);
        this.body7 = new ModelRenderer(this, 0, 3);
        this.body7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body7.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body7, 0.0F, -1.5707963267948966F, 0.0F);
        this.body3 = new ModelRenderer(this, 0, 3);
        this.body3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body3.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body3, 0.0F, 1.5707963267948966F, 0.0F);
        this.body1 = new ModelRenderer(this, 0, 3);
        this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body1.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.bottomConnector7 = new ModelRenderer(this, 0, 0);
        this.bottomConnector7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector7.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector7, 0.0F, -1.5707963267948966F, 0.0F);
        this.bottomConnector3 = new ModelRenderer(this, 0, 0);
        this.bottomConnector3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector3.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector3, 0.0F, 1.5707963267948966F, 0.0F);
        this.button2_6 = new ModelRenderer(this, 8, 7);
        this.button2_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_6, 0.0F, -2.356194490192345F, 0.0F);
        this.topConnector2 = new ModelRenderer(this, 0, 0);
        this.topConnector2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector2.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector2, 0.0F, 0.7853981633974483F, 0.0F);
        this.bottomConnector5 = new ModelRenderer(this, 0, 0);
        this.bottomConnector5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector5.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector5, 0.0F, 3.141592653589793F, 0.0F);
        this.body4 = new ModelRenderer(this, 0, 3);
        this.body4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body4.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body4, 0.0F, 2.356194490192345F, 0.0F);
        this.topConnector4 = new ModelRenderer(this, 0, 0);
        this.topConnector4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector4.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector4, 0.0F, 2.356194490192345F, 0.0F);
        this.bottomConnector2 = new ModelRenderer(this, 0, 0);
        this.bottomConnector2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector2.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector2, 0.0F, 0.7853981633974483F, 0.0F);
        this.bottomConnector4 = new ModelRenderer(this, 0, 0);
        this.bottomConnector4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector4.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector4, 0.0F, 2.356194490192345F, 0.0F);
        this.button2_3 = new ModelRenderer(this, 8, 7);
        this.button2_3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_3.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_3, 0.0F, 1.5707963267948966F, 0.0F);
        this.topConnector7 = new ModelRenderer(this, 0, 0);
        this.topConnector7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector7.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector7, 0.0F, -1.5707963267948966F, 0.0F);
        this.body2 = new ModelRenderer(this, 0, 3);
        this.body2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body2.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body2, 0.0F, 0.7853981633974483F, 0.0F);
        this.topConnector6 = new ModelRenderer(this, 0, 0);
        this.topConnector6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector6.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector6, 0.0F, -2.356194490192345F, 0.0F);
        this.button1_4 = new ModelRenderer(this, 8, 0);
        this.button1_4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_4.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_4, 0.0F, 2.356194490192345F, 0.0F);
        this.topConnector5 = new ModelRenderer(this, 0, 0);
        this.topConnector5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.topConnector5.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(topConnector5, 0.0F, 3.141592653589793F, 0.0F);
        this.button2_7 = new ModelRenderer(this, 8, 7);
        this.button2_7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button2_7.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button2_7, 0.0F, -1.5707963267948966F, 0.0F);
        this.button1_2 = new ModelRenderer(this, 8, 0);
        this.button1_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_2.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_2, 0.0F, 0.7853981633974483F, 0.0F);
        this.button1_1 = new ModelRenderer(this, 8, 0);
        this.button1_1.setRotationPoint(0.0F, -9.5F, -3.62F);
        this.button1_1.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_1, 1.5707963267948966F, 0.0F, 0.0F);
        this.body8 = new ModelRenderer(this, 0, 3);
        this.body8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body8.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body8, 0.0F, -0.7853981633974483F, 0.0F);
        this.topConnector1 = new ModelRenderer(this, 0, 0);
        this.topConnector1.setRotationPoint(0.0F, -12.0F, 0.0F);
        this.topConnector1.addBox(-1.5F, -2.0F, 2.62F, 3, 2, 1, 0.0F);
        this.body6 = new ModelRenderer(this, 0, 3);
        this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.body6.addBox(-1.5F, -12.0F, 2.62F, 3, 12, 1, 0.0F);
        this.setRotateAngle(body6, 0.0F, -2.356194490192345F, 0.0F);
        this.bottomConnector6 = new ModelRenderer(this, 0, 0);
        this.bottomConnector6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector6.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.setRotateAngle(bottomConnector6, 0.0F, -2.356194490192345F, 0.0F);
        this.bottomConnector1 = new ModelRenderer(this, 0, 0);
        this.bottomConnector1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bottomConnector1.addBox(-1.5F, 0.0F, 2.62F, 3, 2, 1, 0.0F);
        this.button1_6 = new ModelRenderer(this, 8, 0);
        this.button1_6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.button1_6.addBox(-1.5F, -3.0F, -0.38F, 3, 3, 4, 0.0F);
        this.setRotateAngle(button1_6, 0.0F, -2.356194490192345F, 0.0F);
        this.button1_1.addChild(this.button1_5);
        this.button2_1.addChild(this.button2_5);
        this.body1.addChild(this.body5);
        this.bottomConnector1.addChild(this.bottomConnector8);
        this.button2_1.addChild(this.button2_8);
        this.button1_1.addChild(this.button1_8);
        this.button2_1.addChild(this.button2_2);
        this.button1_1.addChild(this.button1_3);
        this.button1_1.addChild(this.button1_7);
        this.topConnector1.addChild(this.topConnector3);
        this.button2_1.addChild(this.button2_4);
        this.topConnector1.addChild(this.topConnector8);
        this.body1.addChild(this.body7);
        this.body1.addChild(this.body3);
        this.bottomConnector1.addChild(this.bottomConnector7);
        this.bottomConnector1.addChild(this.bottomConnector3);
        this.button2_1.addChild(this.button2_6);
        this.topConnector1.addChild(this.topConnector2);
        this.bottomConnector1.addChild(this.bottomConnector5);
        this.body1.addChild(this.body4);
        this.topConnector1.addChild(this.topConnector4);
        this.bottomConnector1.addChild(this.bottomConnector2);
        this.bottomConnector1.addChild(this.bottomConnector4);
        this.button2_1.addChild(this.button2_3);
        this.topConnector1.addChild(this.topConnector7);
        this.body1.addChild(this.body2);
        this.topConnector1.addChild(this.topConnector6);
        this.button1_1.addChild(this.button1_4);
        this.topConnector1.addChild(this.topConnector5);
        this.button2_1.addChild(this.button2_7);
        this.button1_1.addChild(this.button1_2);
        this.body1.addChild(this.body8);
        this.body1.addChild(this.body6);
        this.bottomConnector1.addChild(this.bottomConnector6);
        this.button1_1.addChild(this.button1_6);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    { 
    	bottomConnector1.isHidden = true;
    	topConnector1.isHidden = true;
    	
        GL11.glPushMatrix();
        GL11.glTranslatef(this.button2_1.offsetX, this.button2_1.offsetY, this.button2_1.offsetZ);
        GL11.glTranslatef(this.button2_1.rotationPointX * f5, this.button2_1.rotationPointY * f5, this.button2_1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.button2_1.offsetX, -this.button2_1.offsetY, -this.button2_1.offsetZ);
        GL11.glTranslatef(-this.button2_1.rotationPointX * f5, -this.button2_1.rotationPointY * f5, -this.button2_1.rotationPointZ * f5);
        this.button2_1.render(f5);
        GL11.glPopMatrix();
        this.body1.render(f5);
        GL11.glPushMatrix();
        GL11.glTranslatef(this.button1_1.offsetX, this.button1_1.offsetY, this.button1_1.offsetZ);
        GL11.glTranslatef(this.button1_1.rotationPointX * f5, this.button1_1.rotationPointY * f5, this.button1_1.rotationPointZ * f5);
        GL11.glScaled(0.3D, 0.3D, 0.3D);
        GL11.glTranslatef(-this.button1_1.offsetX, -this.button1_1.offsetY, -this.button1_1.offsetZ);
        GL11.glTranslatef(-this.button1_1.rotationPointX * f5, -this.button1_1.rotationPointY * f5, -this.button1_1.rotationPointZ * f5);
        this.button1_1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.topConnector1.offsetX, this.topConnector1.offsetY, this.topConnector1.offsetZ);
        GL11.glTranslatef(this.topConnector1.rotationPointX * f5, this.topConnector1.rotationPointY * f5, this.topConnector1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-this.topConnector1.offsetX, -this.topConnector1.offsetY, -this.topConnector1.offsetZ);
        GL11.glTranslatef(-this.topConnector1.rotationPointX * f5, -this.topConnector1.rotationPointY * f5, -this.topConnector1.rotationPointZ * f5);
        this.topConnector1.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bottomConnector1.offsetX, this.bottomConnector1.offsetY, this.bottomConnector1.offsetZ);
        GL11.glTranslatef(this.bottomConnector1.rotationPointX * f5, this.bottomConnector1.rotationPointY * f5, this.bottomConnector1.rotationPointZ * f5);
        GL11.glScaled(0.9D, 0.9D, 0.9D);
        GL11.glTranslatef(-this.bottomConnector1.offsetX, -this.bottomConnector1.offsetY, -this.bottomConnector1.offsetZ);
        GL11.glTranslatef(-this.bottomConnector1.rotationPointX * f5, -this.bottomConnector1.rotationPointY * f5, -this.bottomConnector1.rotationPointZ * f5);
        this.bottomConnector1.render(f5);
        GL11.glPopMatrix();
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}