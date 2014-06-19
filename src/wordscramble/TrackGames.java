/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

import static com.sun.org.apache.xalan.internal.lib.ExsltDynamic.sum;
import java.util.Arrays;
import static javax.swing.Spring.sum;

/**
 *
 * @author charliebrooks
 */
public class TrackGames {
    
    public int winsOrLosses(int winOrLose){
        //System.out.println("numGames is: "+WordScramble.numGames);
        WordScramble.wins[WordScramble.numGames-1]=winOrLose;
        
        int winsTemp[] = new int[WordScramble.numGames+1];
        for(int i=0;i<WordScramble.wins.length;i++){
            winsTemp[i]=WordScramble.wins[i];
        }
        WordScramble.wins = new int[WordScramble.numGames+2];
        for(int j=0;j<winsTemp.length;j++){
            WordScramble.wins[j]=winsTemp[j];
        }

        //System.out.println("Number of Games from TrackGames is: " + WordScramble.numGames);
        //System.out.println("The winsOrLosses arrays is: "+ Arrays.toString(WordScramble.wins));
        
     return winOrLose;   
    }
    public int totalWins(){
        int sum=0;
        for(int i : WordScramble.wins)
           sum += i;

        return sum;
    }
    
}
