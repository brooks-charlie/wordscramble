/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.util.Scanner;

/**
 *
 * @author heatherjensen
 */
public class WordPicker {

    String response;

    //String displayLabel;

    public String wordPicker(int wordLength) {
        String newWord = "new";
        if(wordLength==3){
            //String newWord;
            WordList3 myWordList3 = new WordList3();
            newWord = myWordList3.chooseWord(wordLength);
        }
        if(wordLength==4){
            //String newWord;
            WordList3 myWordList3 = new WordList3();
            newWord = myWordList3.chooseWord(wordLength);
        }
        if(wordLength==5){
            WordList3 myWordList3 = new WordList3();
            newWord = myWordList3.chooseWord(wordLength);
        }
        if(wordLength==3){
            WordList3 myWordList3 = new WordList3();
            newWord = myWordList3.chooseWord(wordLength);
        } 
        //String newWord = "rabbit";
        return newWord;
    }
/* Future use: add new hints menu with a WordHints class so
    the player can type "hints" during the game to have options for
    the definition, choose from a list of words or to place one letter in the right place.
    
    
    public void wordHint() {
        Scanner input = new Scanner(System.in);

        System.out.println("\tDo you want a hint to help you guess the word?\n"
                + "\tThis will use up one guess.\n"
                + "\tWould you like to continue? y/n:");
        this.response = input.next();
        if (response.equals("y")) {

            String[] wordListArray = {
                "dog", "cat", "top", "hat", "rob",
                "car", "max", "ham", "box", "ton",
                "tar", "man", "ran", "run", "sat", "ham", "hog", "dig"
            };

            sortStringExchange(wordListArray);
            System.out.println("Your word is one of these:\n");
            for (int i = 0; i < wordListArray.length; i++) {
                System.out.println(wordListArray[i]);

            }
        }
    }
    */

    private void sortStringExchange(String x[]) {
        int i, j;
        String temp;

        for (i = 0; i < x.length - 1; i++) {
            for (j = i + 1; j < x.length; j++) {
                if (x[ i].compareToIgnoreCase(x[ j]) > 0) {                                             // ascending sort
                    temp = x[ i];
                    x[ i] = x[ j];    // swapping
                    x[ j] = temp;

                }
            }
        }
    }
}
