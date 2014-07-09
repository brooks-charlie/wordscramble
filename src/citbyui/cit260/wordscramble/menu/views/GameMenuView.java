/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.menu.views;

import citbyui.cit260.wordscramble.enums.Status;
import java.util.Scanner;
import wordscramble.GameMenuControl;
import wordscramble.MainMenuControl;
import citbyui.cit260.wordscramble.errors.WordScrambleError;
import citbyui.cit260.wordscramble.exceptions.MenuException;

/**
 *
 * @author Aubrey
 * 
 * tightly cohesive and loosely coupled- Heather 6/19/14
 */
public class GameMenuView extends Menu{
    
    private final static String[][] menuItems = {
    
        {"F", "Just for fun!"},
        {"S", "Scored"},
        {"T", "Timed and Scored"},
        {"Q", "Back to Main Menu"}
    }; 
  
    GameMenuControl playModeMenuControl = new GameMenuControl();
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public GameMenuView() {
        super(GameMenuView.menuItems);
    }
 
    @Override
    public void getInput() {       

    
        boolean valid = false;
        
        while(!valid){
            this.display(); //dispay the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            try{
            switch (command) {
                case "F":
                    valid = true;
                    this.playModeMenuControl.justForFun();
                    break;
                case "S":
                    valid = true;
                    this.playModeMenuControl.scoredMode();
                    break;
                case "T":
                    valid = true;
                    this.playModeMenuControl.timedAndScored();
                    break;
                case "Q":
                    valid = true;
                    MainMenuView myMainMenu = new MainMenuView();
                    myMainMenu.getInput();
                   // break;
                default: 
                    throw new MenuException("This is an exception.");
                    //new WordScrambleError().displayError("Invalid command. Please enter a valid command.");
                    //continue;                    
            }
        }
            catch (MenuException e){
                System.out.println("\n" + e.getMessage());
                
            }
        }


   //  return;
    }
    

    
    @Override
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
