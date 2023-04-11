package com.generalassembly.oop.intro;

public class NamedObjectsPolymorphism {
    public static void main(String[] args)
    {
        /* invalid
        String[] myStrings = new String[10];
        myStrings[0] = "any string";
        myStrings[1] = 32;
        */

        /* invalid
        int[] myInts = new int[10];
        myInts[0] = 32;
        myInts[1] = "This is not possible";
        */

        //valid:
        HumanKind[] myPeople = new HumanKind[2];
        myPeople[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
        myPeople[1] = new HumanKind(456, "Pat Sajak", "123 Main St, Burbank, CA");

        for (HumanKind human : myPeople) {
            System.out.println(human.getName());
        }

        /* invalid 
        HumanKind[] myPeople = new HumanKind[2];
        myPeople[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
        myPeople[1] = new Pet("Spot");
        */

        IsNamedObject[] namedObjects = new IsNamedObject[2];
        namedObjects[0] = new HumanKind(123, "Vanna White", "123 Main St, Burbank, CA");
        namedObjects[1] = new Pet("Spot");
        for (IsNamedObject namedObject : namedObjects) {
            System.out.println(namedObject.getName());
        }
    }
}