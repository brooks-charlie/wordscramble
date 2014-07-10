/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package citbyui.cit260.wordscramble.menu.views;



import citbyui.cit260.wordscramble.exceptions.PickAnAnimalException;



/**
 *
 * @author heatherjensen
 * 
 */

public class AnimalGame extends Menu {
    
    private final static String[][] animalMenu = {
    
        {"M", "Mammel"},
        {"R", "Reptiles"},
        {"B", "Birds"},
        {"F", "Fish"},
        {"A", "Amphibians"},
        {"Q", "Back to Main Menu"}
    }; 
 
    public AnimalGame () {
        super(AnimalGame.animalMenu);
            }
       
    @Override
    public void getInput(){
        boolean valid = false;
        
        while(!valid){
           this.display();
            
            command= inFile.nextLine();
        command = command.trim().toUpperCase();
            
        try{
            switch (command) {
                case "M":
                    valid = true;
                    System.out.println ("This is a warm-blooded animal that gives birth to their young.");
                    break;
                case "F":
                    valid = true;
                    System.out.println("This animal is cold-blooded, breathes with gills underwater, and has scales & fins.");
                    break;
                case "R":
                    valid = true;
                    System.out.println("This animal is cold-blooded, lays eggs, and has scales.");
                    break;
                case "B":
                    valid = true;
                    System.out.println("This animal is warm-blooded, lays, eggs, and usually flies.");
                    break;
                case "A":
                    valid = true;
                    System.out.println("This animal is cold-blooded, lives on land and in water, and has moist skin.");
                default: 
                    throw new PickAnAnimalException("This is not an animal classification.");
                                    
            }
        }
            catch (PickAnAnimalException e){
                System.out.println("\n" + e.getMessage());
                
            }
        }
    }
        
  public final void display(){
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter of your favorite classification:");

        for (String[] menuItem :  animalMenu) {
            System.out.println("\t   " + menuItem[0] + "\t" + menuItem[1]);
        }
        System.out.println("\t===============================================================\n");
    }


   }








    

