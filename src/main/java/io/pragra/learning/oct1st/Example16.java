package io.pragra.learning.oct1st;

import java.util.Scanner;

// You just need to take string input and
// checks whether all the case-based characters (letters) of the string are lowercase.
public class Example16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();

        if(str.matches("[a-z]+")){
            System.out.println("True");
        }
        else
            System.out.println("False");


    }
}
