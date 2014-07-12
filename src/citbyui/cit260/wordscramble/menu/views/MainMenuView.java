/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.menu.views;

//import wordscramble.MainMenuControl;
import citbyui.cit260.wordscramble.errors.WordScrambleError;
import citbyui.cit260.wordscramble.exceptions.MenuException;
import citbyui.cit260.wordscramble.stats.Stats;
import citbyui.cit260.wordscramble.stats.StatsAvg;
import citbyui.cit260.wordscramble.stats.StatsMax;
import java.util.Scanner;
import wordscramble.ExitGame;
import wordscramble.MainMenuControl;
import wordscramble.TrackGames;
import wordscramble.WordScramble;

/**
 *
 * @author Aubrey
 * 
 * tightly cohesive and loosely coupled 6/18/2014
 */
public class MainMenuView extends Menu{
        
    private final static String[][] menuItems = {
        {"G", "Game Menu"},
        {"H", "Help Menu"},
        {"A", "Animal Game"},
        {"X", "Exit Word Scramble"}
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {
        super(MainMenuView.menuItems);
    }
 
    @Override
    public void getInput() {       

        
        
        
        do {
            this.display(); // display the menu

            // get command entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            try{
            switch (command) {
                case "G":
                    this.mainMenuControl.displayGameMenu();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                case "A":
                    this.mainMenuControl.displayAnimalMenu();            
                    break;
                case "X":
                    ExitGame myExitGame = new ExitGame();
                    myExitGame.exitGame();
                    
             
                    //break;
                default: 
                    throw new MenuException("This is an exception.");
                   // new WordScrambleError().displayError("Invalid command. Please enter a valid command.");
                    //continue;                    
            }
            }
            catch (MenuException e){
                System.out.println("\n" + e.getMessage());
                
            }
        } while (!command.equals("X"));

     return;
    }
    

    
    @Override
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
