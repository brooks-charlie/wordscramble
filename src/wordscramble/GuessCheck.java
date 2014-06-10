/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.util.Scanner;

/**
 *
 * @author Aubrey
 */
public class GuessCheck {

    //String origWord = "rabbit";
    String guess;
    int userGuess = 0;
    int maxAttempts = 3;
    int wordLength = 6; //pass this from the menu. 

    public void checker(String origWord, String scrambledWord, int wordLength) {
        boolean correct = false;

        Timer myTimer = new Timer();
        myTimer.start();

        System.out.println("Scrambled Word: " + scrambledWord);
        for(;userGuess<maxAttempts;userGuess++){
        //while (!correct || userGuess==maxAttempts ) {
            System.out.println("What is your guess?");
            Scanner input = new Scanner(System.in);
            this.guess = input.next();
            if (guess.length() != wordLength) {
                System.out.println("Incorrect, try again!, please enter a " + wordLength + " letter word.\nThe word was:\t"+origWord);
                //userGuess++;
                continue;
            } else {
                if (guess.equals(origWord)) {
                    correct = true;
                    myTimer.stop();
                    myTimer.getElapsedTimeSecs();
                    System.out.println("Good job, you are correct!\nThe answer was " + origWord);
                    System.out.println("It took you "+ myTimer.getElapsedTimeSecs() + " seconds to guess correctly.");

                } else {
                    //userGuess++;
                    myTimer.loopy(maxAttempts, userGuess);
                    System.out.println("Incorrect, try again!");
                    continue;

                }

            }
            
            
            System.out.println("You tried "+ userGuess + " times to get the word right.\nThe word was:\t"+origWord);
            Score myScore = new Score();
            
            myScore.displayScore(wordLength, userGuess);
            TrackGames myTrackGames = new TrackGames();
            myTrackGames.winsOrLosses(1);
            //System.out.println("end");
            MainMenuView myMainMenu = new MainMenuView();
            myMainMenu.getInput();

        }
        Score myScore = new Score();
        myScore.displayScore(wordLength, userGuess);
        TrackGames myTrackGames = new TrackGames();
        myTrackGames.winsOrLosses(0);
        System.out.println("You didn't guess the right word. Play again, you'll get it next time!");
    }

}
