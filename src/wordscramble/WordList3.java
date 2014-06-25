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
    public String[] wordListArray3 = {
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
    public class WordList4 implements Serializable {

        private String wordLength = "4";
        private String wordToScramble;// = "cats";
        private String[] wordListArray4 = {
            "dogs", "cats", "tape", "hats", "robs",
            "cars", "main", "hams", "bone", "tame",
            "tall", "mane", "rain", "ruin", "seat"
        };

        public class WordList5 implements Serializable {

            private String wordLength = "5";
            private String wordToScramble;// = "canes";
            private String[] wordListArray5 = {
                "drain", "canes", "traps", "hates", "rumba",
                "cares", "mixer", "hands", "boxes", "tones",
                "tares", "mines", "rains", "ruins", "saint"
            };

            public class WordList6 implements Serializable {

                private String wordLength = "6";
                private String wordToScramble;// = "canned";
                private String[] wordListArray6 = {
                    "drapes", "canned", "trains", "haters", "rumble",
                    "caring", "mixing", "hinder", "boxers", "tanned",
                    "taring", "miners", "reigns", "ruined", "saints"
                };
                //public String wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);

                /*
                 private double getRandomNum() {
                 return randomNum;
                 }

                 private void setRandomNum(int randomNum) {
                 this.randomNum = randomNum;
                 }

                 public WordList6() {
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

            }
        }
    }

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
