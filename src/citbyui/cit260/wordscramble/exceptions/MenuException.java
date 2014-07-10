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
public class MenuException extends Exception {
        public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
    public String WordLengthError(String wordLength){
        String  errorMessage="This is an invalid number:\t" + wordLength
                +"\nPlease select 3, 4, 5 or 6";
        return errorMessage;
    }
    
}
