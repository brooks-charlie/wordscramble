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

    public void exitGame() {

        System.out.println("Here are your stats so far:\n");
        TrackGames myTrackGames = new TrackGames();
        StatsMax myStatsMax = new StatsMax();
        myStatsMax.CalcStats();
        StatsAvg myStatsAvg = new StatsAvg();
        myStatsAvg.CalcStats();

        System.out.println("\tGames played:\t" + WordScramble.numGames + "\n\tGames won:\t" + myTrackGames.totalWins());
        System.out.println("\nAre you sure you want to exit?");

        System.out.println("Please answer Y or N.");
        response = inFile.next();
        response = response.trim().toUpperCase();
        if ("Y".equals(response)) {
            System.exit(0);
        } else {
            MainMenuView myMainMenu = new MainMenuView();
            myMainMenu.getInput();
        }

    }

}
