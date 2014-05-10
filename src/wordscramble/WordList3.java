/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author charliebrooks
 */
public class WordList3 implements Serializable {
    private String wordLength = "3";
    private String wordToScramble;
    private String[] wordListArray = {
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

    public String[] getWordListArray() {
        return wordListArray;
    }

    public void setWordListArray(String[] wordListArray) {
        this.wordListArray = wordListArray;
    }
    
    // This function will pick a random word from the wordList array
    public void chooseWord(){
     wordToScramble = (wordListArray[new Random().nextInt(wordListArray.length)]);
    }
}

