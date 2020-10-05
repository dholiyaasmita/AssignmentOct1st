package io.pragra.learning.oct1st;

import java.util.Scanner;

//Write a program that allows a human user to play a single hand of "blackjack" against a dealer.
// Pick two values from 1-10 for the player. These are the player's "cards".
//Pick two more values from 1-10 for the dealer.
//Whoever has the highest total is the winner.
//There is no betting, no busting, and no hitting. Save that for real blackjack.

public class Example9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Baby Blackjack! ");

        int user = (int) (Math.random()*10);
        int user1 = (int) (Math.random()*10);
        System.out.println("You drew "+ user + " and "+user1+".");
        int total= user+user1;
        System.out.println("Your total is "+total+".");

        int dealer = (int) (Math.random()*10);
        int dealer1 = (int) (Math.random()*10);
        System.out.println("The dealer has "+ dealer + " and "+dealer1+".");
        int total1= dealer+dealer1;

        System.out.println("Dealer's total is "+total1+".");
        if (total>total1)
            System.out.println("You Win!!!!");
        else
            System.out.println("Dealer Win!");

    }
}
