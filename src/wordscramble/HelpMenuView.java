package wordscramble;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author heatherjensen
 */
public class HelpMenuView {

    private final static String[][] menuItems = {
        {"A", "About Word Scramble"},
        {"B", "The Board"},
        {"P", "Play Mode"},
        {"S", "Scoring Rules"},
        {"W", "Word Length"},
        {"Q", "Quit Help"},
     
    } ;
    private HelpMenuControl helpMenuControl = new HelpMenuControl();
    
    public HelpMenuView(){
        
    }
    
   public void getInput (){
      String command;
      Scanner inFile = new Scanner(System.in);
      
       do {           
                     
          this.display();
      
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
      
            switch (command) {
          
                case "A":
                    this.helpMenuControl.displayAboutHelp();
                    break;
                case "B":
                    this.helpMenuControl.displayBoardHelp();
                    break;
                case "P":
                    this.helpMenuControl.displayModeHelp();
                    break;
                case "S":
                    this.helpMenuControl.displayScoringHelp();
                    break;
                case "W": 
                    this.helpMenuControl.displayLengthHelp();
                    break;
                case "Q":
                    break;
                default:
                    new WordScrambleError().displayError ("Invalid command. Please enter a valid command.");
                    continue;
              
            }
        } while (!command.equals("Q"));
   
   return;
 
   }
public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t   " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
}

