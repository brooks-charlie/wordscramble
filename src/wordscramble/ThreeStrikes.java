/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author Sara
 */
public class ThreeStrikes {
    
    byte playerGuess= 2;
    byte failedTries=1;
    
    public int calcStrike() {
        int workingInt = 0; //holds the values it's working with
        //calculates the user's score based on word letters and guesses used     
        return workingInt;
    }
        
    public void getStrikes() {
        
      System.out.println("Start Game");
      int userGuess= playerGuess;
      int failedAttempts= failedTries;
      
        if (userGuess == 0){ 
              System.out.println("Unscramble the word");
        }
              
        if (failedAttempts < 0 || failedAttempts > 3){
              System.out.println ("Invalid number of attempts");
        }
              
        int totalAttempts = (userGuess - failedAttempts) * 1;
      
        //userGuess is guesses left
        if(totalAttempts >= 3) {
              System.out.println("You are the ultimate word\"descrambler!\"");
        }                      
        else if(totalAttempts >=1 && totalAttempts < 3) {
              System.out.println("Good job! \nPlay again!");
        }              
        else{
              System.out.println("You lose!");
        }
                      
        System.out.println ("It took you " + totalAttempts + "attempts.");
        
                
      
    /*perimeters of the InputBox because the guesses are linked to that class. 
    String first = "X"; //vision of the first strike. Will try to get it to appear like that
    String second = "XX"; //vision of the second stroke. Again will try to have it appear when i learn it 
    String third = "XXX"; //vision of the third strike, i currently have no idea how to show it, just writing the variables to set it up.       
    //will add more as we learn more.
System.out.println(first);
System.out.println(second);
System.out.println(third);*/
    }
}