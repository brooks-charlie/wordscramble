/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author charliebrooks
 * 
 *
*/
public class WordList4 implements Serializable {
    private String wordLength = "4";
    private String wordToScramble;// = "cats";
    private String[] wordListArray4 = {
        "dogs", "cats", "tape", "hats", "robs",
        "cars", "main", "hams", "bone", "tame", 
        "tall", "mane", "rain", "ruin", "seat"
    };
    
    private double randomNum;
    private int playerWordLength;
    private int useRandomNum;

    public WordList4() {
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
        return wordListArray4;
    }

    public void setWordListArray(String[] wordListArray) {
        this.wordListArray4 = wordListArray;
    }
    /* This function will pick a random word from the wordList array
    public void chooseWord(){
     wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    }
    */
    public String chooseWord(int wordLength) {

       // playerWordLength = Integer.parseInt(wordLength);
    
        randomNum = new Random().nextInt(wordListArray4.length);

        if (randomNum >= wordListArray4.length) {

            randomNum = wordListArray4.length - 1;
        }
        useRandomNum = (int) randomNum;
        wordToScramble = (wordListArray4[useRandomNum]);

        System.out.println("This is the Word to scramble:\t\"" + wordToScramble + "\"");
        return wordToScramble;
    }
    
    public void displayVariables(){
         System.out.println("This is the number of letters in the scrambled word: " + this.wordLength + "\n");
         System.out.println("This is the list of words: \n" + Arrays.toString(this.wordListArray4));
         System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
     }
    
    
}
