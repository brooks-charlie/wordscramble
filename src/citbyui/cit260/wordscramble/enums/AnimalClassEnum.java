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
public enum AnimalClassEnum {
    MAMMEL("This is a warm-blooded animal that gives birth to their young."),
    REPTILES ("This animal is cold-blooded, lays eggs, and has scales."),
    BIRDS("This animal is warm-blooded, lays, eggs, and usually flies."),
    AMPHIBIANS("This animal is cold-blooded, lives on land and in water, and has moist skin."),
    FISH("This animal is cold-blooded, breathes through gills underwater, and has scales & fins.");
   


String animal;
    AnimalClassEnum(String myAnimal){
        this.animal = myAnimal;
    }
    
    public String displayAnimal() {return this.animal;}
}