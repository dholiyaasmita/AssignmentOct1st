package io.pragra.learning.oct1st;

import java.util.Scanner;

// The body mass index (BMI) is commonly used by health and nutrition professionals to estimate human body fat in populations.
// It is computed by taking the individual's weight (mass) in kilograms and dividing it by the square of their height in meters.
public class Example3 {
    public static void main(String[] args) {
        double m=0.0, kg =0.0,BMI=0.0,m1=0.0;
        double M=0.01;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your Height in meters");
        m = scanner.nextDouble();
        System.out.println("Please enter your Weight in kg");
        kg = scanner.nextDouble();

        BMI = (kg/(m*m));

        System.out.println("Your height in meters is: " +m);
        System.out.println("Your weight in kilograms is: " +kg);
        System.out.println("Your BMI is: " +BMI);


    }




}
