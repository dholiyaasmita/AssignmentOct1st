package io.pragra.learning.oct1st;

import java.util.*;
import java.lang.*;

// Modify your previous number-guessing game so that they can guess until they get it right.
// That means it will keep looping as long as the guess is different from the secret number.
// Use a while loop.
public class Example7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // true used to make a statment correct
                System.out.println("chosen a number between 1 and 10.");
                int guessnumber =sc.nextInt();
                System.out.println("Your guess is: " + guessnumber);
                int secretnumber = (int) (Math.random() * 10);
                if (guessnumber == secretnumber) {
                    System.out.println("That's right! You're a good guesser.");
                    break;
                }
                else
                    System.out.println("That is incorrect. Guess again.");
        }

    }
}
