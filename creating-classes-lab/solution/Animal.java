
public class Animal {
    private int numLegs;
    private int topSpeed;
    private boolean isEndangered;
    private String name;
    private SpeakBehavior speakBehavior;

    public Animal(){
        //intentionally left blank
    }

    public Animal(int numberOfLegs, int animalTopSpeed, boolean isAnimalEndangered, String animalName){
        numLegs = numberOfLegs;
        topSpeed = animalTopSpeed;
        isEndangered = isAnimalEndangered;
        name = animalName;
    }

    public Animal(int numberOfLegs, int animalTopSpeed, boolean isAnimalEndangered, String animalName, SpeakBehavior animalSpeakBehavior){
        numLegs = numberOfLegs;
        topSpeed = animalTopSpeed;
        isEndangered = isAnimalEndangered;
        name = animalName;
        speakBehavior = animalSpeakBehavior;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public void setNumLegs(int numLegs) {
        this.numLegs = numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setIsEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //additional get/set for the speakBehavior property
    public SpeakBehavior getSpeakBehavior() {
        return speakBehavior;
    }

    public void setSpeakBehavior(SpeakBehavior animalSpeakBehavior) {
        this.speakBehavior = animalSpeakBehavior;
    }

    public String toString() {
        String output = String.format("The %s has a top speed of %d mph, has %d legs, and is", name, topSpeed, numLegs);
        if (isEndangered)
            output += " endangered.";
        else
            output += " not endangered.";
        return output;
    }   
}
