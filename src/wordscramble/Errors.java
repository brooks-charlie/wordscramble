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
public abstract class Errors {
    
    
    public String framework = "";
    
    public Errors() {}
    public Errors(String framework) {}
    
    public abstract Object displayError(Object object);
}
