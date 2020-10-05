package io.pragra.learning.oct1st;

public class RectangleClass {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void display(){
        System.out.println(getHeight()+" "+getWidth());
    }
}

