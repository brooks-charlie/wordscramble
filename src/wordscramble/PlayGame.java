/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import citbyui.cit260.wordscramble.score.ScoreCalc;
import citbyui.cit260.wordscramble.menu.views.MainMenuView;
import java.io.Serializable;

/**
 *
 * @author Aubrey
 */
public class PlayGame implements Serializable{
    public static String origWord, scrambledWord;
    private char[] bubbleChar;
    public static GuessCheck myGuess = new GuessCheck();
    private long startTime;
    private float totalTime;

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
        
       // System.out.println("Scrambled Word: " + scrambledWord);
       // System.out.println("You have up to 3 tries to guess the correct word.");
        
        Timer myTimer = new Timer();
        startTime = myTimer.start();
        
     //   this.endGame(myGuess.checker(origWord, scrambledWord, wordLength), wordLength);
        
        
        
    }
    
    private void endGame(int result, int wordLength) {
        Timer myTimer = new Timer();
        if (result == 1){
            
            myTimer.stop();
            totalTime=myTimer.getElapsedTimeSecs(startTime);
            System.out.println("Good job, you are correct!\nThe answer was:\t" + origWord+"\n");
            System.out.println("It took you "+ totalTime + " seconds to guess correctly.\n");
            //System.out.println("You tried "+ userGuess + " times to get the word right.\nThe word was:\t"+origWord);
            
            ScoreCalc myScore = new ScoreCalc();
            myScore.displayScore(wordLength, myGuess.getUserGuess());
            
            TrackGames myTrackGames = new TrackGames();
            myTrackGames.winsOrLosses(1);
            
            PlayAgain playAgain = new PlayAgain();
            playAgain.replayGame(wordLength);
            
            MainMenuView myMainMenu = new MainMenuView();
            myMainMenu.getInput();
            
        }
        else {
            myTimer.stop();
            //myTimer.getElapsedTimeSecs();
            
            ScoreCalc myScore = new ScoreCalc();
            myScore.displayScore(wordLength, 3);

            TrackGames myTrackGames = new TrackGames();
            myTrackGames.winsOrLosses(0);
            
            PlayAgain playAgain = new PlayAgain();
            playAgain.replayGame(wordLength);
           // System.out.println("You didn't guess the right word. Play again, you'll get it next time!");    
        }
    }
}
