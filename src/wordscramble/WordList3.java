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
 */
public class WordList3 implements Serializable {

    public String wordLength = "3";
    private String wordToScramble;
    public String[] wordListArray = {
        "dog", "cat", "top", "hat", "rob",
        "car", "max", "ham", "box", "ton",
        "tar", "man", "ran", "run", "sat"
    };
    //public String wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    private double randomNum;
    private int playerWordLength;
    private int useRandomNum;

    public double getRandomNum() {
        return randomNum;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    public WordList3() {
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
    /* This function will pick a random word from the wordList array */

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

    public void displayVariables() {
        System.out.println("This is the number of letters in the scrambled word: " + this.wordLength);
        System.out.println("This is the list of words:" + Arrays.toString(this.wordListArray));
        // System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
        // chooseWord();
    }

}
