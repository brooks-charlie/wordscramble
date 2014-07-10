/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordscramble;

import citbyui.cit260.wordscramble.exceptions.PlayAgainException;
import java.util.Scanner;

/**
 *
 * @author Charlie Brooks
 */
public class PlayAgain {

    PlayGame myGame = new PlayGame();
    private static final Scanner inFile = new Scanner(System.in);
    private String response;
    

    public void replayGame(int wordLength) {
         try{
        System.out.println("Would you like to play again using all the same settings? y/n");
        response = inFile.next();
        response = response.trim().toUpperCase();

        checkResponse(response, wordLength);
        }
        catch(PlayAgainException e){
         
          System.out.println("\n" + e.PlayAgainYes(response));
         }
    }

    private void checkResponse(String response, int wordLength) throws PlayAgainException {

        if ("Y".equals(response)|| "N".equals(response)) {
            if("Y".equals(response)){
                this.myGame.playGame(wordLength);
            }
            else{
                
                System.out.println("You Answered \"No\".\nTaking you back to the Main Menu.");
            }
            
            
        } else {
            throw new PlayAgainException();
           
        }
    }
    
}
