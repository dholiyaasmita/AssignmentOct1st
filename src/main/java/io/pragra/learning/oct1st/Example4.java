package io.pragra.learning.oct1st;
import java.util.Scanner;

// Create a java program to decide the public transport system. There are 1000 people, We have some cars and buses to carry them, each bus can handle 50 people and each car can 5 people.
// Please check how many cars and buses would be needed to carry all of them
// Using conditions please validate cars should not exceed 50 and bus should not exceed 15.
// If number of cars are more than number of buses please display “Not efficient system”.
// If number of people are more than bus, display “Let’s stay home” else “Let’s take bus”.
public class Example4 {
    public static void main(String[] args) {
        int People,Bus = 0,Car=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers of people");
        People=sc.nextInt();
        Bus=People/50;
        Car=People/5;
        System.out.println("Number of Buses required for 1000 people "+Bus );
        System.out.println("Number of Cars required for 1000 people "+Car);

        if(Car>50){
            System.out.println("Please use the Bus or Stay home");
        }else if(Bus>15){
            System.out.println("Please use the Car or Stay home");
        }

        if(Car>Bus){
            System.out.println("Not efficient system");
        }else{
            System.out.println("You can take any services either Car or Bus");
        }

        if(People>Bus){
            System.out.println("Let's stay home");
        }else{
            System.out.println("Let's take the bus");
        }


    }
}
