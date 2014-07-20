/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.controls;

import citbyui.cit260.wordscramble.menu.views.WordMenuView;
import wordscramble.PlayGame;


/**
 *
 * @author Aubrey
 * 
 * tightly cohesive and loosely coupled- Heather 6/19/14
 */
public class GameMenuControl {
    private String modeOfPlay;
    private String justForFun;
    private String scoredMode;
    
              
    WordMenuView wordMenu = new WordMenuView();
    PlayGame myGame = new PlayGame();
            
    public void justForFun() {
       modeOfPlay= justForFun;
       
        //System.out.println("\n You have choosen to play just for fun!\n");
        //this.wordMenu.getInput();
    }
    
    public void scoredMode() {
       modeOfPlay= scoredMode;
        //System.out.println("\n You have choosen to play in scored mode.\n");
        //this.wordMenu.getInput();
    }
    
    public void timedAndScored() {
      
       // System.out.println("\n You have choosen to play in timed and scored mode.\n");
       // this.wordMenu.getInput();
    }
}
