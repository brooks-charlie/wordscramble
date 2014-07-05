/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.enums;

/**
 *
 * @author charliebrooks
 */
public enum ScoreRhetoric {
    WON ("You WON! Would you like to play again?"),
    ULTIMATE ("You are the Ultimate De-Scrambler!");
    
    String scoreRhetoric;
    ScoreRhetoric(String scoreRhetoric){
        this.scoreRhetoric = scoreRhetoric;
    }
    public void display(){
        System.out.println(this.scoreRhetoric);
    }
    
}
