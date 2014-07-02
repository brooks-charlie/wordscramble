/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import citbyui.cit260.wordscramble.menu.views.MainMenuView;
import java.io.Serializable;

/**
 *
 * @author Aubrey
 */
public class PlayGame implements Serializable{
    private String origWord, scrambledWord;
    private char[] bubbleChar;
    private GuessCheck myGuess = new GuessCheck();

    public PlayGame() {
    }

    public String getOrigWord() {
        return origWord;
    }

    public void setOrigWord(String origWord) {
        this.origWord = origWord;
    }

    public String getScrambledWord() {
        return scrambledWord;
    }

    public void setScrambledWord(String scrambledWord) {
        this.scrambledWord = scrambledWord;
    }

    public char[] getBubbleChar() {
        return bubbleChar;
    }

    public void setBubbleChar(char[] bubbleChar) {
        this.bubbleChar = bubbleChar;
    }

    public GuessCheck getMyGuess() {
        return myGuess;
    }

    public void setMyGuess(GuessCheck myGuess) {
        this.myGuess = myGuess;
    }
    
        
    public void playGame(int wordLength) {
        
        
        WordPicker myWord = new WordPicker();
        origWord = myWord.wordPicker(wordLength);
        
        Bubble myBubble = new Bubble();
        bubbleChar = myBubble.bubbleSort(origWord);
        scrambledWord = new String(bubbleChar);
        
        System.out.println("Scrambled Word: " + scrambledWord);
        
        Timer myTimer = new Timer();
        myTimer.start();
        
        this.endGame(myGuess.checker(origWord, scrambledWord, wordLength), wordLength);
        
        
        
    }
    
    private void endGame(int result, int wordLength) {
        Timer myTimer = new Timer();
        if (result == 1){
            
            myTimer.stop();
            myTimer.getElapsedTimeSecs();
            System.out.println("Good job, you are correct!\nThe answer was\t" + origWord);
            System.out.println("It took you "+ myTimer.getElapsedTimeSecs() + " seconds to guess correctly.");
            //System.out.println("You tried "+ userGuess + " times to get the word right.\nThe word was:\t"+origWord);
            
            ScoreCalc myScore = new ScoreCalc();
            myScore.displayScore(wordLength, myGuess.getUserGuess());
            
            TrackGames myTrackGames = new TrackGames();
            myTrackGames.winsOrLosses(1);
            
            MainMenuView myMainMenu = new MainMenuView();
            myMainMenu.getInput();}
        else {
            myTimer.stop();
            myTimer.getElapsedTimeSecs();
            
            ScoreCalc myScore = new ScoreCalc();
            myScore.displayScore(wordLength, myGuess.getUserGuess());

            TrackGames myTrackGames = new TrackGames();
            myTrackGames.winsOrLosses(0);
            System.out.println("You didn't guess the right word. Play again, you'll get it next time!");    }
    }
}
