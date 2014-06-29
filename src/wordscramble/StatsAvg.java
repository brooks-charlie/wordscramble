/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.io.Serializable;

/**
 *
 * @author heatherjensen
 */
public class StatsAvg extends Stats implements Serializable{
   
    @Override
     public void CalcStats() {
        int avg = 0;
        for (int myStat : WordScramble.scores) {
            avg += myStat;
        }
        avg = avg / (WordScramble.scores.length - 1);
        System.out.println("The average score so far is:\t" + avg);
    }
}
