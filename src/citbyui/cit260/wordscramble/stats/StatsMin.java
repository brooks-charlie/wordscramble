/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.stats;


import citbyui.cit260.wordscramble.interfaces.DisplayStats;
import wordscramble.WordScramble;

/**
 *
 * @author heatherjensen
 */
public class StatsMin implements DisplayStats{
  
     public void display(){} 
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
