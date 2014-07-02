/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Heather Jensen -  Menu, GameMenu, WordPicker
 * Sara Bronson -  PlayAgain, ThreeStrikes, Timer
 * Charlie Brooks -  ThreeWordlist, FourWordlist, FiveWordlist, SixWordlist
 * Aubrey Raby -  ScrambledWord, InputBox, Score
 */

package wordscramble;

import citbyui.cit260.wordscramble.enums.Status;
import citbyui.cit260.wordscramble.menu.views.MainMenuView;
import java.io.Serializable;
import java.util.Scanner;

public class WordScramble implements Serializable {

    //Instance Variables
    public static int numGames=0;
    static int scores []= new int [2];
    static int wins[] = new int[1];
    
    private String name;
    private static String instructions= 
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of WORD SCRAMBLE!                               *"                            
            + "\n\t*                                                                     *"
            + "\n\t* Number of players: one                                              *"
            + "\n\t* Game: Pick how many letters you want to have in your game word      *"
            + "\n\t*       and the system picks a word and randomizes the letters.       *"
            + "\n\t*       You has 3 chances to guess the right word.                    *"
            + "\n\t* Goal of the Game: Guess the right word in three chances.            *"
            + "\n\t*                                                                     *"
            + "\n\t* Good luck!                                                          *"
            + "\n\t***********************************************************************"
            + "\n";

    public static int getNumGames() {
        return numGames;
    }

    public static void setNumGames(int numGames) {
        WordScramble.numGames = numGames;
    }

    public static int[] getScores() {
        return scores;
    }

    public static void setScores(int[] scores) {
        WordScramble.scores = scores;
    }

    public static int[] getWins() {
        return wins;
    }

    public static void setWins(int[] wins) {
        WordScramble.wins = wins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
        //System.out.println(""); 
        //Status.INSTRUCTIONS.display();
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    

    public static void main(String[] args){
       WordScramble myGame= new WordScramble();
       myGame.getPlayerName();
       myGame.displayHelp();
       

       MainMenuView myMainMenu = new MainMenuView();
       myMainMenu.getInput();
       
    }

    private void getPlayerName(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name= input.next();
    }
    
    private void displayHelp(){
         System.out.println("\n Welcome " + this.name + "\n");
         System.out.println(this.instructions);
         //Status.INSTRUCTIONS.display();
     }
}
