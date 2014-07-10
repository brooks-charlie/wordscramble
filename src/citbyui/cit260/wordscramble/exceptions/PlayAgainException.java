/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.exceptions;

/**
 *
 * @author charliebrooks
 */
public class PlayAgainException extends Exception{
    public PlayAgainException() {
    }

    public PlayAgainException(String message) {
        super(message);
    }

    public PlayAgainException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayAgainException(Throwable cause) {
        super(cause);
    }
    public String PlayAgainYes(String response){
        //System.out.println("I don't know what you typed but it wasn't Y or N. \n"
        //        + "Taking you back to the Main Menu");
        response=response + " is not Y or N. \n"
                + "Taking you back to the Main Menu";
        return response;
    }
    
}
