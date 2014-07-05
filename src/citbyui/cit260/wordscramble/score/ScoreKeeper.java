/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.wordscramble.score;

import java.util.Arrays;
import wordscramble.WordScramble;

/**
 *
 * @author charliebrooks
 * * tightly cohesive and loosely coupled 6/18/2014
 */
public class ScoreKeeper extends Score {
    
    int[] tempScores = new int[WordScramble.numGames + 2];

    public ScoreKeeper() {
        //super(ScoreKeeper.tempScores);
    }
    
   
@Override
    public int scoreFirstGame(int totalScore) { 
        WordScramble.scores[WordScramble.numGames] = totalScore; 
        return WordScramble.scores[WordScramble.numGames];
    }
@Override
    public int scoreGames(int totalScore) { 

        WordScramble.scores[WordScramble.numGames] = totalScore;

        int[] tempScores = new int[WordScramble.numGames + 2];
        for (int i = 0; i < WordScramble.scores.length; i++) {
            tempScores[i] = WordScramble.scores[i];
        }

        WordScramble.scores = new int[WordScramble.numGames + 2];

        for (int i = 0; i < WordScramble.scores.length; i++) {
            WordScramble.scores[i] = tempScores[i];
        }

        return totalScore;
    }

    @Override
    public int displayScore(int wordLength, int failedAttempts) {
       return 0;
    }

}
