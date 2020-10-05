package io.pragra.learning.oct1st;

import java.util.Scanner;

// Ask user to enter his age and then Using if statements, else if, and else statements,
// make a program which displays a different message depending on the age given.
//Age Less than 16 /message "You can't drive."
// 16to17      //"You can drive but not vote."
// 18to24      //"You can vote but not rent a car."
//25 or older // "You can do pretty much anything."
public class Example5 {
    public static void main(String[] args) {
        int Age;
        Scanner age = new Scanner(System.in);
        System.out.println("Please Enter Your Age: ");
        Age = age.nextInt();
        if (Age<=0){
            System.out.println("Age can't be zero or negative.");
        }
        else if(Age>0 && Age<16){
            System.out.println("You can't drive.");
        }else if(Age>=16 && Age<=17){
            System.out.println("You can drive but not vote.");
        }else if(Age>=18 && Age<=24){
            System.out.println("You can vote but not rent a car.");
        }else {
            System.out.println("You can do pretty much anything.");
        }
    }
}
