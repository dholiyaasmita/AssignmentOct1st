package io.pragra.learning.oct1st;
// Write a program that gets three integers from the user.
// Count from the first number to the second number in increments of the third number.
// Use a for loop to do it.

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if(n1<n2){
        for(int i=n1;i<n2;i+=n3){
            System.out.println( i);
        }
        }else{
            System.out.println("first number should be smaller then second");
        }

    }
}
