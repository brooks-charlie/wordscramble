/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.enums;

/**
 *
 * @author Sara
 */
public enum  SaraEnum {
    Fighter ("The class that is the best at melee combat"),
    Cleric ("The class that calls upon their god for healing powers"),
    Ranger ("The class that can track its foes and strike from a distance"),
    Paladin ("The class that cleanses the world from evil"),
    Druid ("The class closest to nature"),
    Wizard ("The class that uses a spellbook to cast a variety of spells"),
    Sorcerer ("The class that has limited spells but can cast them spontaneously"),
    Rogue ("The class of the steathly and trap smart"),
    Barbarian("The class that uses rage to conquer foes");
    
    
    String character;
    SaraEnum(String myCharacter){
        this.character=myCharacter;
        
    }
  public String displayCharacter() {return this.character;}  
}
