/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.io.Serializable;

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

        return totalScore;
    }

   }
