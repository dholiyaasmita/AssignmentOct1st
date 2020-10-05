package io.pragra.learning.oct1st;
//String Alphanumeric
//You just need to take string input and checks whether the string consists of alphanumeric characters.

import java.util.Scanner;

public class Example14 {
    //alphanumeric= 0-9, a-z, A-Z

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String s = sc.nextLine();
        System.out.println(s.matches("[a-zA-Z0-9]+"));

    }

}
