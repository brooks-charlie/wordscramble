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
public class WordList3 implements Serializable {
    private String wordLength = "3";
    private String[] wordListArray3 = {
        "dog", "cat", "top", "hat", "rob",
        "car", "max", "ham", "box", "ton", 
        "tar", "man", "ran", "run", "sat"
    };
    public String wordToScramble=(wordListArray3[new Random().nextInt(wordListArray3.length)]);
    private int randomNum;

    public int getRandomNum() {
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
    public void chooseWord(int wordLength){
        
        randomNum = new Random().nextInt(wordListArray3.length);
        // randomNum=15;
        // System.out.println(randomNum);
        randomNum*=2;
        // System.out.println(randomNum);
        randomNum/=2;
        // System.out.println(randomNum);
        if(randomNum >= wordListArray3.length){
            randomNum -=1;
        }
        
        wordToScramble = (wordListArray3[randomNum]);
     
        System.out.println("This is the Word to scramble:\t\"" + wordToScramble +"\"");
    }
    public void displayVariables(){
         System.out.println("This is the number of letters in the scrambled word: " + this.wordLength);
         System.out.println("This is the list of words:" + Arrays.toString(this.wordListArray3));
        // System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
        // chooseWord();
     }
    
    
}

