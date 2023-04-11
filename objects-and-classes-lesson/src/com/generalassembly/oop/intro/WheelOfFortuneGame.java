package com.generalassembly.oop.intro;

import java.util.ArrayList;

public class WheelOfFortuneGame {
    public static void main(String[] args) {
        HumanKind[] myPeople = new HumanKind[2];
        myPeople[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
        myPeople[1] = new HumanKind(456, "Pat Sajak", "123 Main St, Burbank, CA");

        myPeople[0].setWorkBehavior(new LetterTurningWorker());
        myPeople[1].setWorkBehavior(new ModeratingWorker());
        for (HumanKind human : myPeople) {
            System.out.println(human.getName());

            ArrayList<String> workResults = human.getWorkBehavior().DoWork();
            
            for (String workAction : workResults) {
                System.out.printf("Performed Work: %s\n", workAction);
            }
        }
        
        //and now something happens so vanna has to run the game:
        myPeople[0].setWorkBehavior(new ModeratingWorker());
        System.out.println(myPeople[0].getName());
        ArrayList<String> newWorkResults = myPeople[0].getWorkBehavior().DoWork();
            
        for (String workAction : newWorkResults) {
            System.out.printf("Performed Work: %s\n", workAction);
        }
    }
}
