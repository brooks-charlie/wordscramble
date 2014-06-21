/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author charliebrooks
 *
public class WordList6 implements Serializable {
    private String wordLength = "6";
    private String wordToScramble;// = "canned";
    private String[] wordListArray = {
        "drapes", "canned", "trains", "haters", "rumble",
        "caring", "mixing", "hinder", "boxers", "tanned", 
        "taring", "miners", "reigns", "ruined", "saints"
    };
    private double randomNum;
    private int playerWordLength;
    private int useRandomNum;

    public WordList6() {
    }

    public String getWordLength() {
        return wordLength;
    }

    public void setWordLength(String wordLength) {
        this.wordLength = wordLength;
    }

    public String getWordToScramble() {
        return wordToScramble;
    }

    public void setWordToScramble(String wordToScramble) {
        this.wordToScramble = wordToScramble;
    }

    public String[] getWordListArray() {
        return wordListArray;
    }

    public void setWordListArray(String[] wordListArray) {
        this.wordListArray = wordListArray;
    }
    /* This function will pick a random word from the wordList array
    public void chooseWord(){
     wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    }
    *
    public String chooseWord() {

        playerWordLength = Integer.parseInt(wordLength);
    
        randomNum = new Random().nextInt(wordListArray.length);

        if (randomNum >= wordListArray.length) {

            randomNum = wordListArray.length - 1;
        }
        useRandomNum = (int) randomNum;
        wordToScramble = (wordListArray[useRandomNum]);

        System.out.println("This is the Word to scramble:\t\"" + wordToScramble + "\"");
        return wordToScramble;
    }
    
    public void displayVariables(){
         System.out.println("This is the number of letters in the scrambled word: " + this.wordLength + "\n");
         System.out.println("This is the list of words: \n" + Arrays.toString(this.wordListArray));
         System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
     }
    
    
}
*/