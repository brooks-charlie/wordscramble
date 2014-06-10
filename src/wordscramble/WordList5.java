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
 */
public class WordList5 implements Serializable {
    private String wordLength = "5";
    private String wordToScramble = "canes";
    private String[] wordListArray = {
        "drain", "canes", "traps", "hates", "rumba",
        "cares", "mixer", "hands", "boxes", "tones", 
        "tares", "mines", "rains", "ruins", "saint"
    };
    private double randomNum;
    private int playerWordLength;
    private int useRandomNum;

    public WordList5() {
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
    */
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