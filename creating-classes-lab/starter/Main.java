import java.util.*;
public class Main {

    public static Scanner input = new Scanner(System.in);
    private static final int NUM_ANIMALS = 4;

    public static void main(String[] args) {

        Animal[] animals = new Animal[NUM_ANIMALS];

        //TODO: Add 4 animals to the array
        
        //Use a helper method to instantiate new Animal and Add the new Animal to the array
        animals[0] = createNewAnimal();

            
        
        //TODO: Create a loop to print out the animal info per the instructions 
        //loop: print info for each animal in the array
            System.out.println(animals[0].toString());
    }

    public static Animal createNewAnimal(String animalName, int maxSpeed, int numLegs, Boolean isEndangered)
    {
        //HINT: This code is incorrect. You will need to fix it.
        return new Animal();
    }

    public static Animal createNewAnimal()
    {
        //HINT: This code is incorrect. You will need to fix it.
        //OPTIONAL TODO IF TIME: write code to gather information and set properties of the Animal object
        return new Animal(); 
    }
}
