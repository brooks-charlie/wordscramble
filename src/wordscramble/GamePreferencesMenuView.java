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
public class GamePreferencesMenuView {
    
    String word;
    String play;
   
       Game game;
    private GamePreferencesMenuControl gamePreferenceControl = new GamePreferencesMenuControl(game);

    private final static String[][] menuItems = {
        {"1", "Word Length options"},
        {"2", "Play mode options"},
        {"Q", "Return to game menu"}
    };

    public GamePreferencesMenuView(Game game) {
        this.game = game;
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
                    this.gamePreferenceControl.getWordLength(this.game.word);
                    break;
                case "2":
                    this.gamePreferenceControl.getPlayMode(this.game.play);
                    break;
                case "Q":
                    break;
                default: 
                    new WordScramble().displayError("Invalid command. Please enter a valid command.");
                    continue;
            }
        } while (!command.equals("Q"));

        return;
    }
    
    
        
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < GamePreferencesMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}
