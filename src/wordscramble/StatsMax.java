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
public class StatsMax extends Stats implements Serializable{
   
    @Override
    public void CalcStats() { //finds highest score in scores[]
        
        int max=0;
        for  (int myStat : WordScramble.scores) {
            if (max < myStat) {
                max = myStat;
            }
        }
        System.out.println("Your best score is:\t" + max);
    }
}
