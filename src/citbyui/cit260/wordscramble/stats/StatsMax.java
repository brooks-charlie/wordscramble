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
public class StatsMax implements DisplayStats{
   
     public void display(){} 
    public int CalcStats() { //finds highest score in scores[]
        
        int max=0;
        for  (int myStat : WordScramble.scores) {
            if (max < myStat) {
                max = myStat;
            }
        }
        //System.out.println("\tBest score:\t" + max);
        return max;
    }
}
