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
    String strikes;
    byte userGuess= 2;
    byte failedAttempts=1;
    
    public int calcStrike() {
        int workingInt = 0; //holds the values it's working with
        //calculates the user's score based on word letters and guesses used     
        return workingInt;
    }
        
    public void getStrikes() {
        
      System.out.println("Start Game");
          String strike[]= {" ", "X", "XX", "XXX"};
                    
          for(String s: strike){
              System.out.print(s + " ");
               
        if (userGuess == 0){ 
              System.out.println("Unscramble the word");
        }
              
        if (failedAttempts < 0 || failedAttempts > 3){
              System.out.println ("Invalid number of attempts");
        }
              
        int totalAttempts = (userGuess - failedAttempts);
      
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
        }
    }
     
    
    }
       
   