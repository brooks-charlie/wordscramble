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
            newWord = myWordList3.chooseWord();
        }
        if(wordLength==4){
            //String newWord;
            WordList4 myWordList4 = new WordList4();
            newWord = myWordList4.chooseWord();
        }
        if(wordLength==5){
            WordList5 myWordList5 = new WordList5();
            newWord = myWordList5.chooseWord();
        }
        if(wordLength==6){
            WordList6 myWordList6 = new WordList6();
            newWord = myWordList6.chooseWord();
        } 
        //String newWord = "rabbit";
        return newWord;
    }

    public void chooseWord() {
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
            //System.out.println(this.wordPicker());
            for (int i = 0; i < wordListArray.length; i++) {
                System.out.println(wordListArray[i]);

            }
        }
    }

    public static void sortStringExchange(String x[]) {
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
