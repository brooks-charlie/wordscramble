/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author Aubrey
 * 
 * tightly cohesive and loosely coupled 6/18/2014
 */
public class MainMenuControl {
    
    /*public void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.getInput();
    }*/
    
    public void displayGameMenu() {
        GameMenuView playMenu = new GameMenuView();
        playMenu.getInput();
        
    }
    
       
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    
   
}
