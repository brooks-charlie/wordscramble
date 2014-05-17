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

import java.io.Serializable;
import java.util.Scanner;

public class WordScramble implements Serializable {

    //Instance Variables
    String wordLength;
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
       WordScramble myGame= new WordScramble();
       myGame.getName();
       myGame.getWordLength();
       myGame.displayHelp();
       
       ScrambledWord myScramble = new ScrambledWord();
       myScramble.displayOrig();
       myScramble.displayScrambledWord();
       
       InputBox myInput = new InputBox();
       myInput.displayCorrect();
       myInput.displayWrong();
       
       Score myScore = new Score();
       myScore.displayScore();
       
       
       Menu myMenu = new Menu();
       myMenu.displayHelpMenu();
       myMenu.displayExit();
       
       WordList3 myWordList3 = new WordList3();
       myWordList3.displayVariables();
       myWordList3.chooseWord(3);
       
       WordList4 myWordList4 = new WordList4();
       myWordList4.displayVariables();
       
       WordList5 myWordList5 = new WordList5();
       myWordList5.displayVariables();
       
       WordList6 myWordList6 = new WordList6();
       myWordList6.displayVariables();
       
       PlayAgain myPlayAgain= new PlayAgain();
       myPlayAgain.display();
               
       GameMenu myGameMenu = new GameMenu();
       myGameMenu.displayLength();
     
    }
    
    
    public void getName(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name= input.next();
    }
    public void getWordLength(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length of the word you would like to unscramble (the only valid length is 3): ");
        this.wordLength=input.next();
    }
        
    public void displayHelp(){
         System.out.println("\n Welcome " + this.name + "\n");
         System.out.println(this.instructions);
     }
}