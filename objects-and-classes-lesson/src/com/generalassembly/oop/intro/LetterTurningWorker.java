package com.generalassembly.oop.intro;

import java.util.ArrayList;

public class LetterTurningWorker implements PerformWorkBehavior {

    public ArrayList<String> DoWork() {
        ArrayList<String> result = new ArrayList<String>();
        result.add("Find the appropriate letters");
        result.add("Expose the letter to the contestants");

        return result;
    }

}
