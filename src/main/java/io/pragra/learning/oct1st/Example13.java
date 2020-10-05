package io.pragra.learning.oct1st;

import java.util.Scanner;

//You just need to take string and a character as an input
// and print 'Yes' if that character is present in that string
// otherwise print 'No'.

public class Example13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);
        if(str.contains(Character.toString(ch))){
            System.out.println("Yes");
        }else{
            System.out.println("no");
        }
//        char [] ch1 = str.toCharArray();
//        for (int i=0;i<ch1.length;i++){
//            if(ch==ch1[i]){
//                System.out.println("index of the char "+i);
//            }
//        }

    }

}
