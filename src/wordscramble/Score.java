/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import java.util.Arrays;
import static wordscramble.WordScramble.scores;

/**
 *
 * @author Aubrey M. Raby
 */
public class Score {

    String scoreNotification = "Your score is: ";
    int temp;

//int usersScore = 1234; //holds the user's score after calculation
    /*public int calcScore() {
     int workingInt = 0; //holds the values it's working with
     //calculates the user's score based on word letters and guesses used 
     //not sure where to find this, or what it does
     return workingInt;
     }*/
    // int wordLength=4;
    // int failedAttempts=2;
    // int wins =3;
    public int displayScore(int wordLength, int failedAttempts) {
        //System.out.println(scoreNotification + usersScore);  
        System.out.println("You played with " + wordLength + " letters and used " + failedAttempts + " tries.");
        int numLetters = wordLength;
        int numFailed = failedAttempts;
        if (numFailed > 2) {
            System.out.println("Invalid number of attempts");

        }
        if (numLetters < 3 || numLetters > 6) {
            System.out.println("Invalid number of letters");
        }

        int totalScore = (numLetters - numFailed) * 100;

//<<<<<<< HEAD
        if (numFailed == 0) {
            totalScore += 500;
            System.out.println("You are the ultimate word \"de-scrambler\"");

        } else {
            System.out.println("Good job!\nPlay again!");
        }
        System.out.println("Your score is " + totalScore);
        if (WordScramble.numGames == 0) {
            KeepScore myKeepScore = new KeepScore();
            myKeepScore.scoreFirstGame(totalScore);
            WordScramble.numGames++;

        } else {
            KeepScore myKeepScore = new KeepScore();
            myKeepScore.scoreGames(totalScore);
            WordScramble.numGames++;

        }
        System.out.println("numGames played is: " + WordScramble.numGames);

        //return totalScore;
//=======
       //}
      //System.out.println("numGames played is: "+ WordScramble.numGames);
       
      this.getAvg();
      this.bestScore();
      return totalScore;          
//>>>>>>> origin/master
    }

    public void getWinStats(int wordLength, int wins) {
        double difficulty = 1.362;
        int gameDifficulty;
        double resultWins;

        if (wins < 0) {
            System.out.println("Invalid number of wins");
            return;
        }
        if (wins == 0) {
            System.out.println("You did not win, no stats available.");
            return;
        }
        if (wordLength < 0 || wordLength > 6) {
            System.out.println("Invalid number of word length");
            return;
        }

        gameDifficulty = (int) (wins + wordLength);
        resultWins = (double) gameDifficulty * difficulty;

        if (resultWins > 0) {
            System.out.println("You are the \"bomb\"!\nYour win difficulty was " + resultWins);
        }

    }
//<<<<<<< HEAD

//}
//=======
   
    public void getAvg() {
			int avg = 0;
			for (int myAvg : WordScramble.scores){
				avg += myAvg;
				
			}
			avg = avg / (WordScramble.scores.length-1);
			System.out.println("The average score so far is: " + avg);
		}
    
    public void bestScore(){ //finds highest score in scores[]
                        int max=0;
                        for(int myMax: WordScramble.scores){
                        max = myMax;
                        }
                        for(int i=1; i < max; i++){
                            if (scores[i] > max) 
                                max = scores[i];
                        }
                        System.out.println("Your best score is: " + max);  
                }
    public void minScore(){ //will be used to find the lowest score in the []
        int min=0;
        for (int myMin: WordScramble.scores) {
            min=myMin;
        }
        for(int i=1; i>min; i--){
            if(scores[i] < min){
            min = scores[i];
       }
}
        System.out.println("Your lowest score is:" + min);
}
}
//>>>>>>> origin/master
