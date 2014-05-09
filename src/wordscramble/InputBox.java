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
public class InputBox {
    String usersGuess = "traincats"; //holds the current guess of the user
    Boolean compareResult; //compares usersGuess to origWord, true or false
    String correctGuess = "Congratulations, you guessed it!";
    String wrongGuess = "Sorry, that is not the correct word.";
    
    public void displayCorrect() {
        System.out.println("You guessed: " + usersGuess);     
        System.out.println(correctGuess);     
    }
    
    public void displayWrong() {
        System.out.println("You guessed: " + usersGuess);     
        System.out.println(wrongGuess);     
    }
    
}
