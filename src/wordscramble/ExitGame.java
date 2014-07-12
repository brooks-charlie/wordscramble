/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import citbyui.cit260.wordscramble.stats.StatsAvg;
import citbyui.cit260.wordscramble.stats.StatsMax;

/**
 *
 * @author charliebrooks
 */
public class ExitGame {
    public void exitGame(){
           TrackGames myTrackGames = new TrackGames();
                    StatsMax myStatsMax = new StatsMax();
                    myStatsMax.CalcStats();
                    StatsAvg myStatsAvg = new StatsAvg();
                    myStatsAvg.CalcStats();
                    System.out.println("\tGames played:\t"+WordScramble.numGames+"\n\tGames won:\t"+myTrackGames.totalWins());
                    System.exit(0);
    }
    
}
