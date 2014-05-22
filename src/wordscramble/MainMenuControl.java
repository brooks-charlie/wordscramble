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
    
    public void displayWordLengthMenu() {
        //WordLengthMenuView wordLengthMenu = new WordLengthMenuView();
        //wordLengthMenu.getInput();
    }
    
    public void displayPlayModeMenu() {
        //PlayModeMenuView playMenu = new PlayModeMenuView();
        //playMenu.getInput();
    }
   
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
}
