/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author heatherjensen
 * Saved and ready if we decide to use it later.
 */
public class Stats {
     /*public void getWinStats(int wordLength, int wins) {
        double difficulty = 1.362;
        int gameDifficulty;
        double resultWins;

        if (wins < 0) {
            System.out.println("Invalid number of wins");
            return;
        }
        if (wins == 0) {
            System.out.println("You did not win, no stats available.");
            return;
        }
        if (wordLength < 0 || wordLength > 6) {
            System.out.println("Invalid number of word length");
            return;
        }

        gameDifficulty = (int) (wins + wordLength);
        resultWins = (double) gameDifficulty * difficulty;

        if (resultWins > 0) {
            System.out.println("You are the \"bomb\"!\nYour win difficulty was " + resultWins);
        }
    } 

    public void getAvg() {
        int avg = 0;
        for (int myAvg : WordScramble.scores) {
            avg += myAvg;
        }
        avg = avg / (WordScramble.scores.length - 1);
        System.out.println("The average score so far is:\t" + avg);
    }

    public void bestScore() { //finds highest score in scores[]
        int max = 0;
        for (int myMax : WordScramble.scores) {
            if (max < myMax) {
                max = myMax;
            }
        }
        System.out.println("Your best score is:\t" + max);
    }

    public int min(int[] scores) { //will be used to find the lowest score in the []
        int min = 0;
        for (int myMin : WordScramble.scores) {
            if (min > myMin) {
                min = myMin;
            }
        }
        System.out.println("Your lowest score is:\t" + min); 
    }*/ 
}
