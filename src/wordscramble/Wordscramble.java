/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
* test change - Charlie
 */

package wordscramble;

import java.io.Serializable;
import java.util.Scanner;

public class Wordscramble implements Serializable {

    //Instance Variables
    String name;
    String instructions= "Word Scramble\n"
            +"Number of players: one\n" 
    +"Game: Players pick how many letters they want to have in their game word \n"
+"and the system picks a word from an internal list and randomizes the letters.\n "
            + " The player has 3 chances to guess the right word.\n" 
+"The goal of the game: Guess the right word in three chances.\n" 
+"Game Rules:\n"
+"1. Can only select from a predetermined number of letter limits (3, 4, 5, 6)\n"
+"2. Can only enter one guess per try. \n";
    
    public static void main(String[] args){
       Wordscramble myGame= new Wordscramble();
       myGame.getName();
       myGame.displayHelp();
    }
    
    public void getName(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name= input.next();
    }
        
    public void displayHelp(){
         System.out.println("\n Welcome " + this.name + "\n");
         System.out.println(this.instructions);
     }
}