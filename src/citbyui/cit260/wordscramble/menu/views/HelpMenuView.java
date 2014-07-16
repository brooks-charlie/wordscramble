package citbyui.cit260.wordscramble.menu.views;

import java.util.Scanner;
import citbyui.cit260.wordscramble.controls.HelpMenuControl;
import wordscramble.WordPicker;
import citbyui.cit260.wordscramble.errors.WordScrambleError;
import citbyui.cit260.wordscramble.exceptions.MenuException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author heatherjensen
 *
 * tightly cohesive and loosely coupled 6/18/2014
 */
public class HelpMenuView extends Menu {

    private final static String[][] menuItems = {
        {"A", "About Word Scramble"},
        {"B", "The Board"},
        {"P", "Play Mode"},
        {"S", "Scoring Rules"},
        {"W", "Word Length"},
       // {"H", "Hints"},
        {"Q", "Quit Help"},};
    //private HelpMenuControl helpMenuControl = new HelpMenuControl();
    HelpMenuControl helpMenuControl = new HelpMenuControl();
    WordPicker WordPicker = new WordPicker();

    public HelpMenuView() {
        super(HelpMenuView.menuItems);
    }

    @Override
    public void getInput() {

        do {
            try {
                this.display();

                 command = inFile.nextLine();
                //String command = this.getCommand();
                command = command.trim().toUpperCase();

                switch (command) {

                    case "A":
                        //this.helpMenuControl.displayAboutHelp();
                        this.displayHelp(Help.ABOUT);
                        break;
                    case "B":
                        //this.helpMenuControl.displayBoardHelp();
                        this.displayHelp(Help.BOARD);
                        break;
                    case "P":
                        //this.helpMenuControl.displayModeHelp();
                        this.displayHelp(Help.MODE);
                        break;
                    case "S":
                        //this.helpMenuControl.displayScoringHelp();
                        this.displayHelp(Help.SCORING);
                        break;
                    case "W":
                        //this.helpMenuControl.displayLengthHelp();
                        this.displayHelp(Help.LENGTH);
                        break;
                    //case "H":    
                    // this.WordPicker.wordHint();
                    //  break;
                    case "Q":
                        break;
                    default:
                        throw new MenuException("This is an exception.");
                    // new WordScrambleError().displayError ("Invalid command. Please enter a valid command.");
                    //continue;

                }
            } catch (MenuException e) {
                System.out.println("\n" + e.getMessage());

            }
        } while (!command.equals("Q"));

        return;

    }

    @Override
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private void displayHelp(Help helpText) {
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText.getHelpText());
        System.out.println("\t" + dividerLine.toString());
    }
        // nested class to define the text for each help item in the menu
    private enum Help {
        ABOUT( 
                 "\tThe objective of the game is to unscramble the word. The player "
                + "\n\t is given three chances to guess the right word."
                +"Game Rules:"
                +"\n\t1. Can only select from a predetermined number of letter limits (3, 4, 5, 6) "
                +"\n\t2. Can only enter one guess per try. "
                 ),
        BOARD( 
                "\tThe game board for Word Scramble consists of a scrambled word, "
                + "\n\t a place to type in your answer, and three strike boxes for your   "
                + "\n\t wrong guesses."),
        MODE( 
                "\tTheir are four different play modes. The player can play just for "
                + "\n\tfun, timed, scored, or timed and scored. The just for fun has "
                + "\n\tno timer or score, but still has three strikes. The timed mode "
                + "\n\tgives you three minutes to make your three guesses. The scored "
                + "\n\tmode gives you a scored based on the number of guesses and the  "
                + "\n\tlength of the word. Lastly, the timed and scored mode gives the  "
                + "\n\tplayer three minutes to make their three guess and a scored at the end. "
                ),
        SCORING( 
                "\tThe score is as follows: "
                + "\n\t(Word length - incorrect guess)* 100"
                + "\n\tIf player guess correct on first try then a bonus of 500 "
                + "\n\tis awarded."
                ),
        LENGTH( 
               "\tThe player picks either a three, four, five, or six letter word."
                );
        
        
        String helpText;
        
        Help(String helpText) {
            this.helpText = helpText;
        }

        public String getHelpText() {
            return helpText;
        }

        public void setHelpText(String helpInfo) {
            this.helpText = helpInfo;
        }
                        
    }
}
