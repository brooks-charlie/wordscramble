/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wordscramble;

/**
 *
 * @author Aubrey
 */
public class Bubble {
    public char[] bubbleSort(String origWord) {
        char[] workingWord = origWord.toCharArray();
        int a, b, size;
        char t;
        size = workingWord.length;
        
        for(a=1; a < size; a++)
            for (b= size-1; b >= a; b--) {
                if(workingWord[b-1] > workingWord[b]) {
                    t = workingWord[b-1];
                    workingWord[b-1] = workingWord[b];
                    workingWord[b] = t;
                }
            }
         return workingWord;
    }

}
