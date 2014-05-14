/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author charliebrooks
 */
public class WordList3 implements Serializable {
    private String wordLength = "3";
    private String wordToScramble = "cat";
    private String[] wordListArray3 = {
        "dog", "cat", "top", "hat", "rob",
        "car", "max", "ham", "box", "ton", 
        "tar", "man", "ran", "run", "sat"
    };

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
    /* This function will pick a random word from the wordList array
    public void chooseWord(){
     wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    }
    */
    
    public void displayVariables(){
         System.out.println("This is the number of letters in the scrambled word: " + this.wordLength + "\n");
         System.out.println("This is the list of words: \n" + Arrays.toString(this.wordListArray3));
         System.out.println("This is the word that will be scrambled: " + this.wordToScramble);
     }
    
    
}

