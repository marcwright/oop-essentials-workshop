package com.generalassembly.oop.intro;

public class HumanKind implements IsNamedObject{
    private int id;
    private String name;
    private String address;

    public HumanKind() {
    }

    public HumanKind(int ID) {
        this.id = ID;
    }

    public HumanKind(int ID, String name) {
        this(ID);
        this.name = name;
    }

    public HumanKind(int ID, String name, String address) {
        this(ID, name);
        this.address = address;
    }

    public static void main(String[] args) {
        HumanKind vannaWhite = new HumanKind();    
        System.out.println(vannaWhite);
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
