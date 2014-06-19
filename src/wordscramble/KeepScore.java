/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.util.Arrays;

/**
 *
 * @author charliebrooks
 */
public class KeepScore {

    public int scoreFirstGame(int totalScore) { //Use only on first game
        WordScramble.scores[WordScramble.numGames] = totalScore; // Store the score of the first game in the array
        //System.out.println("WordScramble.scores array length is:\t" + WordScramble.scores.length);
        return WordScramble.scores[WordScramble.numGames];
    }

    public int scoreGames(int totalScore) { // Use on all games except the first game

        //System.out.println("WordScramble.scores array length is:\t" + WordScramble.scores.length);

        // The array already has the first game's score, 
        // now store the second game in the next index which is incremented by WordScramble.numGames
        // it has already been increased at the end of this function
        WordScramble.scores[WordScramble.numGames] = totalScore;

        // create a temporary array that is larger than the original
        int scores[] = new int[WordScramble.numGames + 2];
        // Copy the contents of the original array to the temporary array
        for (int i = 0; i < WordScramble.scores.length; i++) {
            scores[i] = WordScramble.scores[i];
        }
        // temporarily added to show the contents of the arrays.
        //System.out.println(Arrays.toString(scores));
        //System.out.println(Arrays.toString(WordScramble.scores));
        
        
        // Now that we have the contents of the original array copied to the temporary array we
        // can initialize the original array and created it larger
        WordScramble.scores = new int[WordScramble.numGames + 2];
        // Now that the original array is larger, we can copy the contents of the temp arrray
        // into the original array and also have room for the score of the next game.
        for (int i = 0; i < WordScramble.scores.length; i++) {
            WordScramble.scores[i] = scores[i];
        }
        // temporarily used to show some things
        //System.out.println("WordScramble.scores array length is:\t" + WordScramble.scores.length);
        //System.out.println("the number of games is:\t" + WordScramble.numGames);
        //System.out.println(Arrays.toString(scores));
        //System.out.println(Arrays.toString(WordScramble.scores));

        return totalScore;
    }

}
