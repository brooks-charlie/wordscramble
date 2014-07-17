/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import citbyui.cit260.wordscramble.menu.views.MainMenuView;
import citbyui.cit260.wordscramble.stats.StatsAvg;
import citbyui.cit260.wordscramble.stats.StatsMax;
import java.util.Scanner;

/**
 *
 * @author charliebrooks
 */
public class ExitGame {

    private static final Scanner inFile = new Scanner(System.in);
    private String response;
    private String finalStats;

    public String exitGame() {

        finalStats="Here are your stats so far:\n";
        //System.out.println("Here are your stats so far:\n");
        TrackGames myTrackGames = new TrackGames();
        StatsMax myStatsMax = new StatsMax();
        finalStats=finalStats +"Best Score\t"+ myStatsMax.CalcStats()+"\n";
        StatsAvg myStatsAvg = new StatsAvg();
        finalStats=finalStats +"Average Score\t"+ myStatsAvg.CalcStats()+"\n";

       // System.out.println("\tGames played:\t" + WordScramble.numGames + "\n\tGames won:\t" + myTrackGames.totalWins());
       // System.out.println("\nAre you sure you want to exit?");
        finalStats=finalStats +"Games played:\t" + WordScramble.numGames + "\nGames won:\t" + myTrackGames.totalWins();
        

      //  System.out.println("Please answer Y or N.");
    /*    response = inFile.next();
        response = response.trim().toUpperCase();
        if ("Y".equals(response)) {
            System.exit(0);
        } else {
            MainMenuView myMainMenu = new MainMenuView();
            myMainMenu.getInput();
        } */
return finalStats;
    }

}
