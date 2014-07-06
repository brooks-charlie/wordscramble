/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble.wordLists;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author charliebrooks
 */ 
public class WordList6 implements Serializable {
    private String wordLength = "6";
    private String wordToScramble;// = "canned";
    private String[] wordListArray6 = {
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
        return wordListArray6;
    }

    public void setWordListArray(String[] wordListArray) {
        this.wordListArray6 = wordListArray;
    }
    /* This function will pick a random word from the wordList array
    public void chooseWord(){
     wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    }
    */
    public String chooseWord(int wordLength) {

      //  playerWordLength = Integer.parseInt(wordLength);
    
        randomNum = new Random().nextInt(wordListArray6.length);

        if (randomNum >= wordListArray6.length) {

            randomNum = wordListArray6.length - 1;
        }
        useRandomNum = (int) randomNum;
        wordToScramble = (wordListArray6[useRandomNum]);

        System.out.println("This is the Word to scramble:\t\"" + wordToScramble + "\"");
        return wordToScramble;
    }
    
    public void displayVariables(){
         System.out.println("This is the number of letters in the scrambled word: " + this.wordLength + "\n");
         System.out.println("This is the list of words: \n" + Arrays.toString(this.wordListArray6));
         System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
     }
    
    
}