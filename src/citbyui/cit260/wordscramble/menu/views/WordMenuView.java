/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.menu.views;

import citbyui.cit260.wordscramble.errors.WordScrambleError;
import citbyui.cit260.wordscramble.exceptions.MenuException;
import java.util.Scanner;
import wordscramble.MainMenuControl;
import wordscramble.WordMenuControl;

/**
 *
 * @author charliebrooks
 */
public class WordMenuView {

        
    private static final String[][] menuItems = {
        {"3", "3 letter word"},
        {"4", "4 letter word"},
        {"5", "5 letter word"},
        {"6", "6 letter word"},
        {"Q", "Back to Main Menu"}
    }; 
  
    WordMenuControl wordMenuControl = new WordMenuControl();
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public void getInput() {       

        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            try {
            
            switch (command) {
                case "3":
                    this.wordMenuControl.wordlength3();
                    break;
                case "4":
                    this.wordMenuControl.wordlength4();
                    break;
                case "5":
                    this.wordMenuControl.wordlength5();
                    break;
                case "6":
                    this.wordMenuControl.wordlength6();
                    break;
                case "Q":
                    MainMenuView myMainMenu = new MainMenuView();
                    myMainMenu.getInput();
                    //break;
                default: 
                    throw new MenuException("This is an exception.");
                 //   new WordScrambleError().displayError("Invalid command. Please enter a valid command.");
                 //   continue;    
                  //  return "0";
            }
            }
            catch (MenuException e){
                System.out.println("\n" + e.getMessage());
                
            }
        } while (!command.equals("Q"));

    // return "0";
    }
    

    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < WordMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
