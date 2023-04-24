package com.generalassembly.oop.intro;

public class Pet implements IsNamedObject {
    private String name;

    public Pet(){

    }
    public Pet(String petName){
        this.name = petName;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String petName) {
        name = petName;
    }
}
