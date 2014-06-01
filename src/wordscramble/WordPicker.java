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
public class WordPicker {
    String response;
   //String displayLabel;
    public String wordPicker(){
        String newWord = "rabbit";
        return newWord;
    }
    public void chooseWord() {
        Scanner input= new Scanner(System.in);
        
    System.out.println("\tDo you want a hint to help you guess the word?\n"
            + "\tThis will use up one guess.\n"
            + "\tWould you like to continue? y/n:");
    this.response= input.next();
    if(response.equals("y")){
        
    
        
    String[] wordListArray3 = {
        "dog", "cat", "top", "hat", "rob",
        "car", "max", "ham", "box", "ton",
        "tar", "man", "ran", "run", "sat"
    };
    
    for(int i=0;i<wordListArray3.length;i++){
        System.out.println(wordListArray3[i]);
    }
    }
}
    
   
    
}
