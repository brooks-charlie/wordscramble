/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.menu.views;

import citbyui.cit260.wordscramble.interfaces.DisplayInfo;
import citbyui.cit260.wordscramble.interfaces.EnterInfo;
import java.util.Scanner;

/**
 *
 * @author heatherjensen
 */
public class Menu implements DisplayInfo, EnterInfo {
    
     public String[][] menuItems = null;
     
     String command;
     Scanner inFile = new Scanner(System.in);
    // @Override
     public void display(){}
     public void getInput(){}
    //public abstract void getInput();

    public Menu() {}
    
    public Menu(String[][] menuItems){}
    
    //public abstract void display();
    
   //instance variables
   /*String settings;
   String helpMenu;
   String instructions= "Word Scramble\n"
    +"Number of players: one\n" 
    +"Game: Players pick how many letters they want to have in their game word \n"
    +"and the system picks a word from an internal list and randomizes the letters.\n "
    + " The player has 3 chances to guess the right word.\n" 
    +"The goal of the game: Guess the right word in three chances.\n" 
    +"Game Rules:\n"
    +"1. Can only select from a predetermined number of letter limits (3, 4, 5, 6)\n"
    +"2. Can only enter one guess per try. \n";
   String exitMenu;
   
   
   public void displayHelpMenu(){
       System.out.println(this.instructions);
    }
   
   public void displayExit(){
       System.out.println("Exit");
    }*/
}
   
