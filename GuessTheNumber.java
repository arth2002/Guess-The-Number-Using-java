package com.company;

import java.util.Random;
import java.util.Scanner;

class Game{
    private static int userInput;
    public int number;
   public int totalGuesses= 0;


    static void takeUserInput(){
        System.out.println("Guess the number:");
       Scanner sc = new Scanner(System.in);
       userInput = sc.nextInt();
       System.out.printf("You've entered %d number\n",userInput);
   }
   boolean isCorrectNumber(){
        totalGuesses++;
       if (userInput == number){
           System.out.printf("You Guess right! \nYou took %d Guesses\n",totalGuesses);
           if (userInput<5) {
               System.out.println("You've got skills");
           }
           System.out.println("You're good");
           return true;
       }
       else if (userInput < number){
           System.out.println("Lower than Original Number");
       }
       else {
           System.out.println("Higher than Original Number");
       }

       return false;
   }

   Game(){
       Random randomNum = new Random();
       this.number = randomNum.nextInt(100);
   }

}
public class GuessTheNumber {
    public static void main(String[] args) {
        Game game = new Game();
        boolean b = false;
        while (!b){
            Game.takeUserInput();
            b = game.isCorrectNumber();
        }

    }
}
