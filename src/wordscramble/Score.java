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
}
