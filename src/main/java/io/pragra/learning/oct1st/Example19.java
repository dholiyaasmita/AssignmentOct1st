package io.pragra.learning.oct1st;

import java.util.Scanner;

// You just need to take two strings as an input
// and count how many times later string comes in the former one.
// Return the count.
public class Example19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String: ");
        String str1 = sc.nextLine();
        System.out.println("Enter the second String: ");
        String str2 = sc.nextLine();
        int count = 0;
        String [] str3 = str1.split(" ");
        for (int i = 0; i < str3.length; i++) {
            if (str1.indexOf(str2)>=0){
              count++;
              str1=str1.substring(str1.indexOf(str2));
            }
        }
        System.out.println("The count number for string: "+ count);


    }
}
