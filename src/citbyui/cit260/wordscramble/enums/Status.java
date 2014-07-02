/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.enums;

/**
 *
 * @author charliebrooks
 */
public enum Status {

    INSTRUCTIONS ("\n\t***********************************************************************"
            + "\n\t* Welcome to the game of WORD SCRAMBLE!                               *"                            
            + "\n\t*                                                                     *"
            + "\n\t* Number of players: one                                              *"
            + "\n\t* Game: Pick how many letters you want to have in your game word      *"
            + "\n\t*       and the system picks a word and randomizes the letters.       *"
            + "\n\t*       You has 3 chances to guess the right word.                    *"
            + "\n\t* Goal of the Game: Guess the right word in three chances.            *"
            + "\n\t*                                                                     *"
            + "\n\t* Good luck!                                                          *"
            + "\n\t***********************************************************************"
            + "\n");
    
    String message;
    private Status(String message){
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    public void display(){
        System.out.println(this.message);
    }
}
