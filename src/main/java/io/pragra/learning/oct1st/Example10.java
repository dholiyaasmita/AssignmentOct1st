package io.pragra.learning.oct1st;

public class Example10 {
    public static void main(String[] args) {
// this is #1 - I'll call it "CN"
//        for (char c = 'A'; c <= 'E'; c++) {
//            for (int n = 1; n <= 3; n++) {
//                System.out.println(c + " " + n);
//            }
//        }
//        System.out.println("\n");
//    }
        for (int a = 1; a <= 3; a++) {
            for (int b = 1; b <= 3; b++) {
                for (int c = 1; c <= 3; c++) {
                    System.out.print(a + "-" + b + "-" + c +" ");
                }
// * You will add a line of code here.

            }
            System.out.println("\n");
        }
    }
}

