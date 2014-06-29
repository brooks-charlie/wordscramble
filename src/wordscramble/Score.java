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
public abstract class Score {
    
    public abstract int scoreFirstGame(int totalScore);
    public abstract int scoreGames(int totalScore);
    int[] tempScores = null;         
    public abstract int displayScore(int wordLength, int failedAttempts);
    
}
