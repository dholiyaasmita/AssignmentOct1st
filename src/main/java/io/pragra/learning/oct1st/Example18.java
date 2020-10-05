package io.pragra.learning.oct1st;

import java.util.Scanner;

// You need to take string input and
// two other numbers which will be the start and end
// point of the slice and you need to print that slice of string.
public class Example18 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = s.nextLine();
        int n1=s.nextInt(), n2= s.nextInt();
        System.out.println(str.substring(n1,n2+1));
    }
}
