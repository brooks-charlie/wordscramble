/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author heatherjensen
 */
public class HelpMenuControl {
    
    public HelpMenuControl(){
    }
    
    public void displayBoardHelp() {
        System.out.println();
        this.displayHelpBorder();             
        System.out.println( 
                "\tThe game board for Word Scramble consists of a scrambled word, "
                + "\n\t a place to type in your answer, and three strike boxes for your   "
                + "\n\t wrong guesses.");
               
        displayHelpBorder();
    }
   
    public void displayAboutHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                 "\tThe objective of the game is to unscramble the word. The player "
                + "\n\t is given three chances to guess the right word."
                +"Game Rules:"
                +"\n\t1. Can only select from a predetermined number of letter limits (3, 4, 5, 6) "
                +"\n\t2. Can only enter one guess per try. "
                 ); 
        displayHelpBorder();
    }
            
    public void displayModeHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tTheir are four different play modes. The player can play just for "
                + "\n\tfun, timed, scored, or timed and scored. The just for fun has "
                + "\n\tno timer or score, but still has three strikes. The timed mode "
                + "\n\tgives you three minutes to make your three guesses. The scored "
                + "\n\tmode gives you a scored based on the number of guesses and the  "
                + "\n\tlength of the word. Lastly, the timed and scored mode gives the  "
                + "\n\tplayer three minutes to make their three guess and a scored at the end. "
                    ); 
        displayHelpBorder();
    }
    
                   
    public void displayScoringHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
                "\tThe score is as follows: "
                + "\n\t(Word length - incorrect guess)* 100"
                + "\n\tIf player guess correct on first try then a bonus of 500 "
                 + "\n\tis awarded."
                ); 
        displayHelpBorder();
    }
             
    public void displayLengthHelp() {
        System.out.println();
        displayHelpBorder();     
        System.out.println( 
               "\tThe player picks either a three, four, five, or six letter word."
                ); 
        displayHelpBorder();
    }

    public void displayHelpBorder() {       
        System.out.println(
        "\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }    
}


