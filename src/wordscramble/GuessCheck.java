/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import citbyui.cit260.wordscramble.exceptions.GuessException;
import java.io.Serializable;
import java.util.Scanner;


/**
 *
 * @author Aubrey
 */
public class GuessCheck implements Serializable{

    private String guess;
    private int userGuess = 0;
    private int maxAttempts = 3;
    //int wordLength = 6; //pass this from the menu. 
    private int result = 0;
    
    public GuessCheck() {
       //this.guess = guess;
        
    }
    
   /*ublic GuessCheck(int userGuess) {
        this.userGuess = userGuess;
    }*/

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

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    

    public int checker(String origWord, String scrambledWord, int wordLength) {
        //boolean correct = false;
        
        for(;userGuess<maxAttempts;userGuess++){
           // System.out.println("What is your guess?");
            Scanner input = new Scanner(System.in);
            //this.guess = input.next();
            try{
                if (guess.length() != wordLength && userGuess!=maxAttempts-1) {
                    throw new GuessException("Incorrect, please enter a " + wordLength + " letter word.\n");
                    //System.out.println("Incorrect, try again!, please enter a " + wordLength + " letter word.\nThe word was:\t"+origWord);
                    //continue;
                } 
                else if (guess.equals(origWord)) {
                        //correct = true;
                        result = 1;
                        break;

                    } else if(userGuess<maxAttempts-1) {
                      //  myTimer.loopy(maxAttempts, userGuess);
                        throw new GuessException("Incorrect, try again!");
                        //System.out.println("Incorrect, try again!");
                        //continue;
                    }else{
                        break;
                    }
                
            }
            catch(GuessException e){
                System.out.println("\n" + e.getMessage());
            }
        }
        
        
        return result;
    }

}
