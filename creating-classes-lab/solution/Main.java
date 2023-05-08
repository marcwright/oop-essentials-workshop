import java.util.*;

public class Main {

    public static Scanner input = new Scanner(System.in);
    private static final int NUM_ANIMALS = 4;

    public static void main(String[] args) 
    {
        Animal[] animals = new Animal[NUM_ANIMALS];
        
        //loop: create each animal in the array
        // for (int i = 0; i < NUM_ANIMALS; i++)
        // {
        //     //Add the new Animal to the array
        //     animals[i] = createNewAnimal();
        // }

        animals[0] = createNewAnimal("Elephant", 25, 4, false);
        animals[1] = createNewAnimal("Lion", 50, 4, true);
        animals[2] = createNewAnimal("Cat", 30, 4, false, new SpeakBehaviorMeow());
        animals[3] = createNewAnimal("Dog", 40, 4, false, new SpeakBehaviorGrowl());
        
        //TODO: Create a loop to print out the animal info per the instructions 
        //loop: print info for each animal in the array
        for (Animal animal : animals)
        {
            System.out.println(animal);
            var animalName = animal.getName();
            if (animalName.equals("Cat")
                    || animalName.equals("Dog"))
            {
                System.out.println(String.format("The %s %s.", animalName, animal.getSpeakBehavior().speak()));
                if (animalName.equals("Cat"))
                {
                    animal.setSpeakBehavior(new SpeakBehaviorGrowl());
                }
                else if (animalName.equals("Dog"))
                {
                    animal.setSpeakBehavior(new SpeakBehaviorBark());
                }
                System.out.println(String.format("The %s %s.", animalName, animal.getSpeakBehavior().speak()));
            }
        }
    }

    public static Animal createNewAnimal(String animalName, int maxSpeed, int numLegs, Boolean isEndangered, SpeakBehavior speakBehavior)
    {
        Animal a = createNewAnimal(animalName, maxSpeed, numLegs, isEndangered);
        a.setSpeakBehavior(speakBehavior);
        return a;
    }

    public static Animal createNewAnimal(String animalName, int maxSpeed, int numLegs, Boolean isEndangered)
    {
        return new Animal(numLegs, maxSpeed, isEndangered, animalName);
    }

    public static Animal createNewAnimal()
    {
        System.out.println("Enter the animal name [i.e. Lion]: ");
        String name = input.nextLine();
        System.out.println("Enter the animal's top speed [i.e. 50]: ");
        int topSpeed = 0;
        try
        {
            topSpeed = Integer.parseInt(input.nextLine());
        }
        catch (NumberFormatException e)
        {
            System.out.println("Invalid input for top speed. Defaulting to 0.");
        }

        System.out.println("Enter the number of legs [i.e. 4]: ");
        int numLegs = 0;
        try
        {
            numLegs = Integer.parseInt(input.nextLine());
        }
        catch (NumberFormatException e)
        {
          System.out.println("Invalid input for number of legs. Defaulting to 0.");
        }

        System.out.println("Is the animal endangered [y/n]?: ");
        boolean isEndangered = input.nextLine().toLowerCase().equals("y");

        System.out.println("Does the animal bark, meow, or growl [b/m/g/na]?: ");
        switch (input.nextLine().toLowerCase())
        {
            case "b":
              return new Animal(numLegs, topSpeed, isEndangered, name, new SpeakBehaviorBark());
            case "m":
              return new Animal(numLegs, topSpeed, isEndangered, name, new SpeakBehaviorMeow());
            case "g":
              return new Animal(numLegs, topSpeed, isEndangered, name, new SpeakBehaviorGrowl());
            default:
              return new Animal(numLegs, topSpeed, isEndangered, name);
        }
    }
}
