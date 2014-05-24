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

    private String wordLength;// = "3";
    private String[] wordListArray3 = {
        "dog", "cat", "top", "hat", "rob",
        "car", "max", "ham", "box", "ton",
        "tar", "man", "ran", "run", "sat"
    };
    public String wordToScramble = (wordListArray3[new Random().nextInt(wordListArray3.length)]);
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

    public String[] getWordListArray3() {
        return wordListArray3;
    }

    public void setWordListArray3(String[] wordListArray3) {
        this.wordListArray3 = wordListArray3;
    }
    /* This function will pick a random word from the wordList array */

    public void chooseWord() {
        /* Get a random number within the wordListArray3.length using the Random 
         function and the nextInt method.        */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the word you would like to unscramble (the only valid length is 3):");
        this.wordLength = input.next();
        /* Get the user input for the word length and validate that it's within the range   */
        System.out.println("You typed:\t" + this.wordLength);
        if (!"3".equals(wordLength)) {
            /* Right now, if it's not within the range just set it to something correct. */
            System.out.println("3 is the only valid option at this point!\nSetting the word length to 3.");
            wordLength = "3";
            
        }
        playerWordLength = Integer.parseInt(wordLength);
        /* put the integer into a double variable  */
        randomNum = new Random().nextInt(wordListArray3.length);
        // randomNum = 15;
        /* Divide by 2 then multiply by 2        */
        // System.out.println(randomNum);
        randomNum /= 2;
        // System.out.println(randomNum);
        randomNum *= 2;
        // System.out.println(randomNum);
        /* Check to see if the randomNum is outside of the array.length
         if it is, set it to 1 less than the array.length which would be the last
         array item */
        if (randomNum >= wordListArray3.length) {

            randomNum = wordListArray3.length - 1;
        }
        /* Use the random number to choose the word in the array to use as the 
         wordToScramble         */
        /* cast the double type to integer */
        useRandomNum = (int) randomNum;
        // System.out.println(useRandomNum);
        wordToScramble = (wordListArray3[useRandomNum]);

        System.out.println("This is the Word to scramble:\t\"" + wordToScramble + "\"");
    }

    public void displayVariables() {
        System.out.println("This is the number of letters in the scrambled word: " + this.wordLength);
        System.out.println("This is the list of words:" + Arrays.toString(this.wordListArray3));
        // System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
        // chooseWord();
    }

}
