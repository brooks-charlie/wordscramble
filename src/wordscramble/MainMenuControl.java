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
    
    //seeing if we can streamline the game to more closely match what will happen when we do start playing the game - Aubrey
    /*public void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.getInput();
    }*/
    
    public void displayGameMenu() {
        //placeholder for the play mode menu
        System.out.println("This is the Play Mode menu place holder");
        
        WordMenuView wordMenu = new WordMenuView();
        wordMenu.getInput();
    }
    
       
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput();
    }
    
    public void playGame() {
        String origWord, scrambledWord;
        char[] bubbleChar;
        
        WordPicker myWord = new WordPicker();
        origWord = myWord.wordPicker();
        
        Bubble myBubble = new Bubble();
        bubbleChar = myBubble.bubbleSort(origWord);
        scrambledWord = new String(bubbleChar);
        
        GuessCheck myGuess = new GuessCheck();
        myGuess.checker(origWord, scrambledWord);
    }
   
}
