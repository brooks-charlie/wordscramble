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
        //I commented the below lines out so I could test the flow, since GameMenuView doens't exist yet.  Please uncomment them when GameMenuView and GameMenuControl are built.
        //GameMenuView gameMenu = new GameMenuView();
        //gameMenu.getInput();
    }
    
       
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
}
