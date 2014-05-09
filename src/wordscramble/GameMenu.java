/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import java.util.Scanner;

/**
 *
 * @author heatherjensen
 */
public class GameMenu {
    
    //instance variables
    String wordLength;
    String playMode;
    
    public void Length(){
     Scanner input=new Scanner(System.in);
     System.out.println("Choose Word Length: ");
     System.out.println("three");
     System.out.println("four");
     System.out.println("five");
     System.out.println("six");
     this.wordLength= input.next();
    
    /*public void Mode() throws IOException{
      char ch;
      System.out.println("Choose Game Mode ");
      System.out.println("Just for Fun");
      System.out.println("Timed");
      System.out.println("Scored");
      System.out.println("Timed and Scored");
      
      ch=(char) System.in.read();
      if(ch=='Just for Fun');
      else if (ch=='Timed');
      else if(ch=='Scored');
      else if(ch=='Timed and Scored');
      else()system.out.println("Invalid entry, try again");
    }*/
           
    }

    void displayLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
