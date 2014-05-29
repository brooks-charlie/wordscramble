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
public class PlayModeMenuControl {
    
              
    WordMenuView wordMenu = new WordMenuView();
            
    void justForFun() {
       
        System.out.println("\n You have choosen to play just for fun!\n");
        this.wordMenu.getInput();
    }
    
    void scoredMode() {
       
        System.out.println("\n You have choosen to play in scored mode.\n");
        this.wordMenu.getInput();
    }
    
    void timedAndScored() {
       
        System.out.println("\n You have choosen to play in timed and scored mode.\n");
        this.wordMenu.getInput();
    }
}
