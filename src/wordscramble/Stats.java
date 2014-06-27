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
 * Super-class for StatsMin, StatsMax, and StatsAvg
 */
public abstract class Stats implements Serializable{

     int myStat;
     
    public abstract void CalcStats();

    public Stats() {
     }
}