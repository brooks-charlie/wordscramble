/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author Aubrey M. Raby
 */
public class Score {
    String scoreNotification = "Your score is: ";
    int usersScore = 1234; //holds the user's score after calculation
    
    public int calcScore() {
        int workingInt = 0; //holds the values it's working with
        //calculates the user's score based on word letters and guesses used     
        return workingInt;
    }
       
    public void displayScore() {
        System.out.println(scoreNotification + usersScore);     
        
    }
    byte wordLength=3;
    byte failedAttempts=0;
    public void getScore(byte wordLength, byte failedAttempts) {
        System.out.println("You played with" + wordLength + " letters and used " + failedAttempts + " tries.");
        int numLetters = wordLength;
        int numFailed = failedAttempts;
        if (numFailed > 2) {
            System.out.println("Invalid number of attempts");
           
        }
        if (numLetters < 3 || numLetters > 6) {
            System.out.println("Invalid number of letters");
        }
        
       int totalScore = (numLetters - numFailed) * 100;
       
       if (numFailed == 0){
           totalScore += 500;
		System.out.println("You are the ultimate word \"de-scrambler\"");
                
       } else{
           System.out.println("Good job!\n Play again!");
       }
       System.out.println("Your score is " + totalScore );
            
    }
}
