/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.wordscramble.score;
import citbyui.cit260.wordscramble.enums.ScoreRhetoric;
import wordscramble.WordScramble;
import java.io.Serializable;

/**
 *
 * @author Aubrey M. Raby
 * 
 * tightly cohesive, loosely coupled, serializable- Heather 6/19/14
 */
public class ScoreCalc extends Score implements Serializable  {

    public ScoreCalc() {
    }

    @Override
    public int displayScore(int wordLength, int failedAttempts) {
 
        System.out.println("You played with " + wordLength + " letters and used " + failedAttempts + " tries.");
        int numLetters = wordLength;
        int numFailed = failedAttempts;
        if (numFailed > 3) {
            //System.out.println("Invalid number of attempts");
            ScoreRhetoric.INVALID.display();
        }
        if (numLetters < 3 || numLetters > 6) {
            //System.out.println("Invalid number of letters");
            ScoreRhetoric.INVALIDLETTERS.display();
        }

        int totalScore = (numLetters - numFailed) * 100;

        if (numFailed == 0) {
            totalScore += 500;
            ScoreRhetoric.ULTIMATE.display();
            //System.out.println("You are the ultimate word \"de-scrambler\"");

        } else if (numFailed <3){
            ScoreRhetoric.WON.display();
            //System.out.println("Good job!\nPlay again!");
        }else {
            ScoreRhetoric.SORRY.display();
        }
            
        //System.out.println("Your score is " + totalScore+"\n");
        if (WordScramble.numGames == 0) {
            ScoreKeeper myKeepScore = new ScoreKeeper();
            myKeepScore.scoreFirstGame(totalScore);
            WordScramble.numGames++;

        } else {
            ScoreKeeper myKeepScore = new ScoreKeeper();
            myKeepScore.scoreGames(totalScore);
            WordScramble.numGames++;
        }
       // System.out.println("numGames played is: " + WordScramble.numGames);

        return totalScore;
    }

    @Override
    public int scoreFirstGame(int totalScore) {
        return 0;
           }

    @Override
    public int scoreGames(int totalScore) {
        return 0;
          }

   }
