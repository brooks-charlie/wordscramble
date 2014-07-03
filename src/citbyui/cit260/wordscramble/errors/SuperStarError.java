/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.errors;


/**
 *
 * @author Aubrey
 */
public class SuperStarError extends Errors {
    private final static String framework = "\t**********************************************************";
    
    
    public SuperStarError() {
        super(SuperStarError.framework);
    }
    
    @Override
    public Object displayError(Object object) {
        String message = (String) object;
        System.out.println(framework);
        System.out.println("\t YOU HAVE TRIGGERED A SUPER STAR ERROR ");
        System.out.println("\t ERROR: " + message);
        System.out.println(framework);
        return null;
    }
}
