/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.util.Scanner;

/**
 *
 * @author charliebrooks
 */
public class WordMenuView {

        
    private static final String[][] menuItems = {
    /*    {"G", "Game Menu"},
        {"H", "Help Menu"},
        {"X", "Exit Word Scramble"} */
        {"3", "3 letter word"},
        {"4", "4 letter word"},
        {"5", "5 letter word"},
        {"6", "6 letter word"},
        {"Q", "Back to Main Menu"}
    }; 
  
    WordMenuControl wordMenuControl = new WordMenuControl();
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public WordMenuView() {

    }
 
    
    public void getInput() {       

        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display(); // display the menu

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "3":
                    this.wordMenuControl.wordlength3();
                    //this.name= input.next();
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
                   // this.mainMenuControl.displayGameMenu();
                    MainMenuView myMainMenu = new MainMenuView();
                    myMainMenu.getInput();
                    break;
                default: 
                    new WordScrambleError().displayError("Invalid command. Please enter a valid command.");
                    continue;                    
            }
        } while (!command.equals("Q"));

     return;
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
