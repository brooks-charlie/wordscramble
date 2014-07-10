/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.exceptions;

/**
 *
 * @author heatherjensen
 */
public class PickAnAnimalException extends Exception{
       public PickAnAnimalException() {
    }

    public PickAnAnimalException(String message) {
        super(message);
    }

    public PickAnAnimalException(String message, Throwable cause) {
        super(message, cause);
    }

    public PickAnAnimalException(Throwable cause) {
        super(cause);
    }
    public String NotAClass(String reply){
    
        reply=reply + " this is not an animal classification. \n"
                + "Try Again!";
        return reply;
    }
    
}

