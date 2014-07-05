/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.enums;

/**
 *
 * @author heatherjensen
 */
public enum HeatherEnum {
    LION("Lions are majestic."),
    MONKEY("Monkeys are silly!"),
    SNAKES("Snakes are slimy!"),
    BLACKBEAR("Black bears are small, but powerful."),
    PANDAS("Panda bears look cute and cuddly."),
    POLARBEAR("Polar bears look fierce."),
    WOLVES("Wolves are pack animals.");


String animal;
    HeatherEnum(String myAnimal){
        this.animal = myAnimal;
    }
    
    public String displayAnimal() {return this.animal;}
}