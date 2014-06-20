/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.io.Serializable;
import java.util.Arrays;
import static wordscramble.WordScramble.scores;

/**
 *
 * @author Aubrey M. Raby
 * 
 * tightly cohesive, loosely coupled, serializable- Heather 6/19/14
 */
public class Score implements Serializable {

    private String scoreNotification = "Your score is: ";
    private int temp;

    public Score() {
    }

    public String getScoreNotification() {
        return scoreNotification;
    }

    public void setScoreNotification(String scoreNotification) {
        this.scoreNotification = scoreNotification;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    
    public int displayScore(int wordLength, int failedAttempts) {
 
        System.out.println("You played with " + wordLength + " letters and used " + failedAttempts + " tries.");
        int numLetters = wordLength;
        int numFailed = failedAttempts;
        if (numFailed > 2) {
            System.out.println("Invalid number of attempts");
        }
        if (numLetters < 3 || numLetters > 6) {
            System.out.println("Invalid number of letters");
        }

        int totalScore = (numLetters - numFailed) * 100;

        if (numFailed == 0) {
            totalScore += 500;
            System.out.println("You are the ultimate word \"de-scrambler\"");

        } else {
            System.out.println("Good job!\nPlay again!");
        }
        System.out.println("Your score is " + totalScore);
        if (WordScramble.numGames == 0) {
            KeepScore myKeepScore = new KeepScore();
            myKeepScore.scoreFirstGame(totalScore);
            WordScramble.numGames++;

        } else {
            KeepScore myKeepScore = new KeepScore();
            myKeepScore.scoreGames(totalScore);
            WordScramble.numGames++;
        }
        System.out.println("numGames played is: " + WordScramble.numGames);

        //this.getAvg();
        //this.bestScore();
        return totalScore;
    }

    /*
    public void getWinStats(int wordLength, int wins) {
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
        int i, j, temp, first = 0;
        int least = 0;

        for (i = scores.length - 1; i < 0; i--) {
            for (j = 1; j <= i; j++)//finds the smallest point between i and 1
            {
                if (scores[j] < scores[first]) {
                    first = j;
                }
            }
            temp = scores[first]; //swaps small value with the first
            scores[i] = temp;
        }
        System.out.println("Your lowest score is:\t" + scores[scores.length - 2]);
        return first;
    } */
}
