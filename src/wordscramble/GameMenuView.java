/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.util.Scanner;

/**
 *
 * @author heatherjensen
 */
public class GameMenuView {
    
    String word;
    String play;
   
       Game game;
       // Commented by Charlie
       //private final GameMenuControl gameControl = new GameMenuControl(game);
    private final GameMenuControl gameControl = new GameMenuControl();

    private final static String[][] menuItems = {
        {"1", "Word Length options"},
        {"2", "Play mode options"},
        {"Q", "Return to game menu"}
    };

    GameMenuControl GameMenuControl = new GameMenuControl();
    
    public GameMenuView() {
    
    }

       public void getInput() {       
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();

            // get commaned entered
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1":
                   // this.gameControl.getWordLength(this.game.word); 
                    // Replaced with this
                    this.gameControl.getWordLength(this.word);
                    break;
                case "2":
                    // this.gameControl.getPlayMode(this.game.play);
                    // Replaced with this
                    this.gameControl.getPlayMode(this.play);
                    break;
                case "Q":
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
        System.out.println("\tEnter the letter associated with one of the following commands:");
                // Commented out by Charlie
        /* for (int i = 0; i < GameMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        } */
        // Replaced with this
        for (String[] menuItem : GameMenuView.menuItems) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
