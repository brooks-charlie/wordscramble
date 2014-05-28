/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author Aubrey
 */
public class MainMenuControl {
    
    public void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.getInput();
    }
    
       
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    public void playGame() {
        GuessCheck myGuess = new GuessCheck();
        myGuess.checker();
    }
   
}
