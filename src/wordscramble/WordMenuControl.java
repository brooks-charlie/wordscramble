/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author charliebrooks
 */
class WordMenuControl {
    public int wordLength;
        MainMenuControl mainMenuControl = new MainMenuControl();

    void wordlength3() {

        wordLength = 3;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.playGame();
    }

    void wordlength4() {

        wordLength = 4;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.playGame();
    }

    void wordlength5() {

        wordLength = 5;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.playGame();
    }

    void wordlength6() {

        wordLength = 6;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.playGame();
    }
    
}
