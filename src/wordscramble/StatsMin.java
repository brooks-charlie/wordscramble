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
public class StatsMin extends Stats implements Serializable{
  
    @Override
    public void CalcStats() { //finds lowest score []
       int min = 0;
        for (int myStat : WordScramble.scores) {
            if (min > myStat) {
                min = myStat;
            }
        }
        System.out.println("Your lowest score is:\t" + min); 
           
    } 
}
