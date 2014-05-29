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
       // WordMenuView wordMenu = new WordMenuView();
       // wordMenu.getInput();
      //  System.out.println("This is the Play Mode menu");
        wordLength = 3;
        
            
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.displayGameMenu();
    }

    void wordlength4() {
       // WordMenuView wordMenu = new WordMenuView();
       // wordMenu.getInput();
        wordLength = 4;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.displayGameMenu();
    }

    void wordlength5() {
        // WordMenuView wordMenu = new WordMenuView();
        // wordMenu.getInput();
        wordLength = 5;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.displayGameMenu();
    }

    void wordlength6() {
        // WordMenuView wordMenu = new WordMenuView();
        // wordMenu.getInput();
        wordLength = 6;
        System.out.println("\n You have choosen "+ wordLength + "\n");
        this.mainMenuControl.displayGameMenu();
    }
    
}
