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
    String origWord = "rabbit";
    String guess;
    
    
    
    public void checker(){
        boolean correct = false;
        
        
            
    
        System.out.println("Scrambled Word: tabbir");
        
        while(!correct) {
            System.out.println("What is your guess?");
            Scanner input= new Scanner(System.in);
            this.guess= input.next();
            if (guess.length() != 6) {
            System.out.println("Incorrect word length, please enter a 6 letter word.");
            }
            else {
                if (guess.equals(origWord)){
                    correct = true;
                    System.out.println("Good job, you are correct!\nThe answer was " + origWord);

                }
                else{
                    System.out.println("Incorrect, try again!");
                    continue;
            }
        }
            
          
        }
        
    }
}
