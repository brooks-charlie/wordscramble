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
    
    String guess;
    
    public void checker(String origWord){
        Boolean correct = false;
    
    
        while(!correct) {
            System.out.println("What is your guess?");
            Scanner input= new Scanner(System.in);
            this.guess= input.next();
            
            if (guess.equals(origWord)){
                
            }
        }
    }
}
