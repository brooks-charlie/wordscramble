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
    public static String[] wordListArray3 = {
        "dog", "cat", "top", "hat", "rob",
        "car", "max", "ham", "box", "ton",
        "tar", "man", "ran", "run", "sat"
    };
    private double randomNum;
    private int playerWordLength;
    private int useRandomNum;

    //String chooseWord() {
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

               // public String wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    private String[] wordListArray;

               
                 private double getRandomNum() {
                 return randomNum;
                 }

                 private void setRandomNum(int randomNum) {
                 this.randomNum = randomNum;
                 }

                 private String getWordLength() {
                 return wordLength;
                 }

                 private void setWordLength(String wordLength) {
                 this.wordLength = wordLength;
                 }

                 private String getWordToScramble() {
                 return wordToScramble;
                 }

                 private void setWordToScramble(String wordToScramble) {
                 this.wordToScramble = wordToScramble;
                 }

                 private String[] getWordListArray() {
                 return wordListArray;
                 }

                 private void setWordListArray(String[] wordListArray) {
                 this.wordListArray = wordListArray;
                 }
                 /* This function will pick a random word from the wordList array */
              //  private void displayVariables() {
                 //   System.out.println("This is the number of letters in the scrambled word: " + this.wordLength);
                  //  System.out.println("This is the list of words:" + Arrays.toString(this.wordListArray));
                    // SystSaem.out.println("This is the word that will be scrambled: " + this.wordToScramble);
                    // chooseWord();
              //  }

  //  String chooseWord(int wordLength) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  //  }

      //      }

   

   public String chooseWord(int wordLength) {

       // playerWordLength = Integer.parseInt(wordLength);
    
        randomNum = new Random().nextInt(wordListArray3.length);

        if (randomNum >= wordListArray3.length) {

            randomNum = wordListArray3.length - 1;
        }
        useRandomNum = (int) randomNum;
        wordToScramble = (wordListArray3[useRandomNum]);

        System.out.println("This is the Word to scramble:\t\"" + wordToScramble + "\"");
        return wordToScramble;
  
}
}




