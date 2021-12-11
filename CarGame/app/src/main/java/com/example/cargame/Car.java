package com.example.cargame;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;


public class Car {
    int xLane, xPixel, yPixel;
    int height, width;
    Bitmap image;

    public Car(int xPixel, int yPixel, Resources resources ){
        this.xPixel = xPixel;
        this.yPixel = yPixel;
        this.xLane = (int)xPixel/2;
        this.image = BitmapFactory.decodeResource(resources, R.drawable.car_icon);
        this.height = (int)this.image.getHeight()/25;
        this.width = (int)this.image.getWidth()/20;
        this.image = Bitmap.createScaledBitmap(this.image, this.width, this.height, false);
    }

    public Rect getRect(){
        return new Rect(getDrawX(), getDrawY(), getWidth() + getDrawX(), getDrawY() + getHeight());
    }

    public int getDrawX(){
        if(xLane == 0 )
            return xLane;

        else if(xLane == xPixel )
            return xLane- width;

        else
            return xLane-width/2;
    }

    public int getDrawY(){
        return yPixel - 3*height;
    }

    public int getxLane() {
        return xLane;
    }

    public void setxLane(int xLane) {
        this.xLane = xLane;
    }

    public int getxPixel() {
        return xPixel;
    }

    public void setxPixel(int xPixel) {
        this.xPixel = xPixel;
    }

    public int getyPixel() {
        return yPixel;
    }

    public void setyPixel(int yPixel) {
        this.yPixel = yPixel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
