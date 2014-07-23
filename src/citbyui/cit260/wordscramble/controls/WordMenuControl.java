/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.controls;

import wordscramble.PlayGame;

/**
 *
 * @author charliebrooks
 */
public class WordMenuControl {
    public static int wordLength;
        //MainMenuControl mainMenuControl = new MainMenuControl();
        
        PlayGame myGame = new PlayGame();
        
    public void wordlength(int userWordLength) {
wordLength=userWordLength;
        //wordLength = 3;
        //System.out.println("\n You have choosen "+ wordLength + "\n");
        this.myGame.playGame(wordLength);
    }
/*
    public void wordlength4(String scrambledWord) {
    
        wordLength = 4;
       // System.out.println("\n You have choosen "+ wordLength + "\n");
      this.myGame.playGame(wordLength);
    }
    

    public void wordlength5() {

        wordLength = 5;
        //System.out.println("\n You have choosen "+ wordLength + "\n");
        this.myGame.playGame(wordLength);
    }

    public void wordlength6() {

        wordLength = 6;
        //System.out.println("\n You have choosen "+ wordLength + "\n");
        this.myGame.playGame(wordLength);
    }
*/    
}
