/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.errors;

/**
 *
 * @author heatherjensen
 */
public class WordScrambleError extends Errors {
    private final static String framework = "\t??????????????????????????????????????????????????????????????????????????????";
    
    
    public WordScrambleError() {
        super(WordScrambleError.framework);
    }
    
    @Override
    public Object displayError(Object object) {
        String message = (String) object;
        System.out.println(framework);
        System.out.println("\t ERROR: " + message);
        System.out.println(framework);
        return null;
    }
}
