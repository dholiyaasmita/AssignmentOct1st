package io.pragra.learning.oct1st;

import sun.font.TrueTypeFont;

import java.util.Scanner;

// You just need to take string input and
// checks whether all the case-based characters in the string following non-casebased letters.
// Non-casebased letters are uppercase and all other case-based characters are lowercase.
public class Example15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s3=sc.nextLine();
        String[] splitArray=s3.split(" ");
        boolean flag=true;
        for (int i = 0; i <splitArray.length ; i++) {
            if(!splitArray[i].matches("[A-Z][a-z]+")){
                flag= false;
                break;
            }
        }
        System.out.println(" whether upper case followed by all lowercase :"+flag);
    }
}
