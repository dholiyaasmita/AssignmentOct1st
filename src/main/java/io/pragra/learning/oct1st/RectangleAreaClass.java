package io.pragra.learning.oct1st;

import java.util.Random;
import java.util.Scanner;

public class RectangleAreaClass extends RectangleClass{
    Scanner sc;
    public RectangleAreaClass() {
        this.sc = new Scanner(System.in);
    }

    public void read_input(){
        System.out.println("Enter height :");
        this.setHeight(sc.nextInt());
        System.out.println("Enter width");
        this.setWidth(sc.nextInt());
    }

    @Override
    public void display() {
        super.display();
        System.out.println(this.getHeight()*this.getWidth());
    }
}
