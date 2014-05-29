/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.util.Scanner;

/**
 *
 * @author Aubrey
 */
public class PlayModeMenuView {
    
    private static final String[][] menuItems = {
    
        {"F", "Just for fun!"},
        {"S", "Scored"},
        {"T", "Timed and Scored"},
        {"Q", "Back to Main Menu"}
    }; 
  
    PlayModeMenuControl playModeMenuControl = new PlayModeMenuControl();
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public PlayModeMenuView() {

    }
 
    
    public void getInput() {       

        String command;
        Scanner inFile = new Scanner(System.in);
        boolean valid = false;
        
        while(!valid){
            this.display(); //dispay the menu
            
            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
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
                    break;
                default: 
                    new WordScrambleError().displayError("Invalid command. Please enter a valid command.");
                    continue;                    
            }
        }


     return;
    }
    

    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the number associated with one of the following commands:");

        for (int i = 0; i < PlayModeMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
