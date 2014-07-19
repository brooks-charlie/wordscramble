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
import citbyui.cit260.wordscramble.frames.GameMenuFrame;
import citbyui.cit260.wordscramble.frames.MainFrame;
import citbyui.cit260.wordscramble.frames.PlayerName;
import citbyui.cit260.wordscramble.menu.views.MainMenuView;
import java.io.Serializable;
import java.util.Scanner;

public class WordScramble implements Serializable {
public static MainFrame mainFrame = null;
public static GameMenuFrame gameMenuFrame= null;
    private static final Scanner inFile = new Scanner(System.in);
    //Instance Variables
    public static int numGames = 0;
    public static int scores[] = new int[2];
    public static int wins[] = new int[1];

    private String name;
    /*  private static String instructions= 
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
     */

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

   // public String getInstructions() {
    // return instructions;
    //System.out.println(""); 
    //Status.INSTRUCTIONS.display();
    // }
   // public void setInstructions(String instructions) {
        //     this.instructions = instructions;
   // }

    public static void main(String[] args) {
        WordScramble wordScramble = null;
        
        try {
            if (PlayerName.playerName == null){
                PlayerName.playerName="EVERYONE";
            }
            wordScramble = new WordScramble();
            java.awt.EventQueue.invokeLater(new Runnable(){
                public void run() {
                   WordScramble.mainFrame = new MainFrame();
                   WordScramble.mainFrame.setVisible(true);
                }
            });
            //MainFrame frame = new 
          //  WordScramble myGame = new WordScramble();
          //  myGame.getPlayerName();
         //   myGame.displayHelp();

          //  MainMenuView myMainMenu = new MainMenuView();
          //  myMainMenu.getInput();

        } catch (Throwable ex) {
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.getStackTrace().toString());
//Error.displayError("Unexpected error: " + ex.getMessage());
//Error.displayErrorMsg(ex.getStackTrace().toString());

        } finally {
            WordScramble.inFile.close();
            if(WordScramble.mainFrame != null){
                WordScramble.mainFrame.dispose();
            }
            
        }
        
        /* try {
             wordScramble = new WordScramble();
             java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
               WordScramble.gameMenuFrame = new GameMenuFrame();
               WordScramble.gameMenuFrame.setVisible(true); 
            }
        });
       
        } catch (Throwable ex) {
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.getStackTrace().toString());

        } finally {
            WordScramble.inFile.close();
            if(WordScramble.gameMenuFrame != null){
               WordScramble.gameMenuFrame.dispose();
            }
            
        }*/
   }
}
