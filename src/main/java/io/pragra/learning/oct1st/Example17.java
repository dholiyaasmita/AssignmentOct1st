package io.pragra.learning.oct1st;
// You just need to take string input and checks whether the string consists of only numeric characters.

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String onlynymber = sc.nextLine();
        if (onlynymber.matches("[\\d]+")){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
