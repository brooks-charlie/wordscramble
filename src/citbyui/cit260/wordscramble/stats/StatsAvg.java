/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.stats;


import citbyui.cit260.wordscramble.interfaces.DisplayStats;
import java.io.Serializable;
import wordscramble.WordScramble;

/**
 *
 * @author heatherjensen
 */
public class StatsAvg implements DisplayStats{
   
     public void display(){} 
     public void CalcStats() {
        int avg = 0;
        
        for (int myStat : WordScramble.scores) {
            avg += myStat;
        }
        avg = avg / (WordScramble.scores.length - 1);
        System.out.println("The average score so far is:\t" + avg);
    }
}
