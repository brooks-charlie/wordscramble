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
    static int scores []= new int [10];
    static int arrayBookmark= 0;
    String wordLength;
    String name;
    String instructions= 
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

            
    
 

    
    public static void main(String[] args){
       WordScramble myGame= new WordScramble();
       myGame.getName();
       myGame.displayHelp();
       
       //myGame.getWordLength();
       
       
       MainMenuView myMainMenu = new MainMenuView();
       myMainMenu.getInput();
       
       ThreeStrikes myThreeStrikes= new ThreeStrikes();
       myThreeStrikes.getStrikes(); 
       myThreeStrikes.calcStrike();
    }
       
       
       
       
       
       
       
       //Below is commented out pre-week 4 display calls
       //Place new calls above this line
       // --------------------------------------------------
       
       /*ScrambledWord myScramble = new ScrambledWord();
       myScramble.displayOrig();
       myScramble.displayScrambledWord();*/
       
       /*GameMenu myGameMenu= new GameMenu();
       myGameMenu.Length();
       myGameMenu.Mode();*/
       
       /*InputBox myInput = new InputBox();
       myInput.displayCorrect();
       myInput.displayWrong();*/
       
       /*Score myScore = new Score();
       myScore.displayScore();
       myScore.getWinStats();*/
       
       /* Menu myMenu = new Menu();
       myMenu.displayHelpMenu();
       myMenu.displayExit(); */
       
       /*WordList3 myWordList3 = new WordList3();
       myWordList3.displayVariables();
       myWordList3.chooseWord(3); */
       
       /* WordList4 myWordList4 = new WordList4();
       myWordList4.displayVariables(); */
       
       /* WordList5 myWordList5 = new WordList5();
       myWordList5.displayVariables(); */
       
       /* WordList6 myWordList6 = new WordList6();
       myWordList6.displayVariables(); */
       
       /* PlayAgain myPlayAgain= new PlayAgain();
       myPlayAgain.display(); */
                      
      
    

    public void getName(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        this.name= input.next();
    }
    
    public void displayHelp(){
         System.out.println("\n Welcome " + this.name + "\n");
         System.out.println(this.instructions);
     }

    void displayError(String invalid_command_Please_enter_a_valid_comm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
