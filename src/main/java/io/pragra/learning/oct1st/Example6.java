package io.pragra.learning.oct1st;

import java.util.Scanner;

// Make a program which plays a simple game of 20 2 Questions.
// The first question should be "animal, vegetable, or mineral?"
// Then, the second question should be "is it bigger than a breadbox?"
// Then, display one of six possible responses, depending on their answers.
// You can choose what answers to give for each of the six possibilities.
// Here's a suggestion:
public class Example6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ch = true;
        while(ch) {
            System.out.println("choose one object from squirrel, moose, carrot, watermelon, paperclip, camaro ");
            System.out.println("is it an animal,vegetable or mineral?");
            String St = sc.next();
            System.out.println("Question 2) Is it bigger than a breadbox? Yes or No");
            String St1 = sc.next();
            switch (St){
                case "animal":{
                    switch (St1){
                        case "yes":
                            System.out.println("you choose moose");
                            break;
                        case "no":
                            System.out.println("you choose squirrel");
                            break;
                        default :
                            System.out.println("please select proper option");
                            break;
                    }
                }break;
                case "vegetable":{
                    switch (St1){
                        case "yes":{
                            System.out.println("you choose watermelon");
                            break;
                        }
                        case "no":{
                            System.out.println("you choose carrot");
                            break;
                        }
                        default:{
                            System.out.println("please select proper option");
                            break;
                        }

                    }
                }break;
                case "mineral":{
                    switch (St1){
                        case "yes":{
                            System.out.println("you choose Camaro");
                            break;
                        }
                        case "no":{
                            System.out.println("you choose paper clip");
                            break;
                        }
                        default:{
                            System.out.println("please select proper option");
                            break;
                        }
                    }
                }
                break;
                default:{
                   System.out.println("Please select properly");
                    break;
                }
            }
            System.out.println("please type exit to finish or write continue to play again");
            String st = sc.next();
            if(st.equals("exit"))
                ch=false;
            else
                ch=true;
        }

    }
}
