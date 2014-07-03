/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.errors;

import citbyui.cit260.wordscramble.interfaces.DisplayError;
/**
 *
 * @author Aubrey
 */
public class Errors implements DisplayError {
    
    
    public String framework = "";
    
    public Errors() {}
    public Errors(String framework) {}
    
        public Object displayError(Object object){
        return null;}
}
