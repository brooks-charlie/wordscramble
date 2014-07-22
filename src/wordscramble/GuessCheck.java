/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import citbyui.cit260.wordscramble.exceptions.GuessException;
import citbyui.cit260.wordscramble.frames.ExitFrame;
import citbyui.cit260.wordscramble.frames.PlayAgainFrame;
import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Aubrey
 */
public class GuessCheck implements Serializable {

    private String guess;
    private int userGuess=1;
    private int maxAttempts = 3;
    private String result = "0";

    public GuessCheck() {
        //this.guess = guess;

    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public int getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(int userGuess) {
        this.userGuess = userGuess;
    }

    public int getMaxAttempts() {
        return maxAttempts;
    }

    public void setMaxAttempts(int maxAttempts) {
        this.maxAttempts = maxAttempts;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String checker(String origWord, String scrambledWord, int wordLength, String guess) {

        //for (userGuess = 0; userGuess < maxAttempts; userGuess++) {
            if (userGuess == maxAttempts) {
                result = "Game Over.";
               // new ExitFrame().setVisible(true);
                new PlayAgainFrame().setVisible(true);
               // break;
            } else if (guess.equals(origWord)) {
                result = "Good Job!";
                //new ExitFrame().setVisible(true);
                new PlayAgainFrame().setVisible(true);
               // break;
            } else {
                userGuess++;
                result = "Incorrect try again. " + userGuess;
                
            }
            return result;
        //}
       // return null;

    }

}
