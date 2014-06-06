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
public class MainMenuView {
        
    private static final String[][] menuItems = {
        {"G", "Game Menu"},
        {"H", "Help Menu"},
        //{"P", "Play Game"},
        {"X", "Exit Word Scramble"}
    }; 
  
    MainMenuControl mainMenuControl = new MainMenuControl();
    
    public MainMenuView() {

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
                case "G":
                    this.mainMenuControl.displayGameMenu();
                    break;
                case "H":
                    this.mainMenuControl.displayHelpMenu();            
                    break;
                //case "P":
                   // this.mainMenuControl.playGame(wordLength);            
                    //break;
                case "X":
                    TrackGames myTrackGames = new TrackGames();
                    System.out.println("\tGames played:\t"+WordScramble.numGames+"\n\tGames won:\t"+myTrackGames.totalWins());
                    System.exit(0);
                    break;
                default: 
                    new WordScrambleError().displayError("Invalid command. Please enter a valid command.");
                    continue;                    
            }
        } while (!command.equals("X"));

     return;
    }
    

    
    
   public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < MainMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
