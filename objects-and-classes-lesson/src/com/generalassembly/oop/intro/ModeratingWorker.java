package com.generalassembly.oop.intro;

import java.util.ArrayList;

public class ModeratingWorker implements PerformWorkBehavior {

    public ArrayList<String> DoWork() {
        ArrayList<String> result = new ArrayList<String>();
        result.add("Ask to spin the wheel");
        result.add("Read the result of the spin");
        result.add("Ask for a letter");
        result.add("Reveal the result by saying there are N instances of the letter or no instances of the letter");
        return result;
    }
}
