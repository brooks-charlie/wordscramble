/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.enums;

/**
 *
 * @author Aubrey
 */
public enum AubreyEnum {
    PURPLE ("Aubrey likes purple best."),
    ORANGE ("Orange is okay"),
    BLUE ("Blue is okay"),
    RED ("Red is alright"),
    GREEN ("Aubrey likes green second best");
    
    
    String color;
    AubreyEnum(String myColor){
        this.color = myColor;
    }
    
    public String displayColor() {return this.color;}
    
    /*public String getColor(){
        return color;
    }
    public void display(){
        System.out.println(this.color);
    } */
    
    
}

