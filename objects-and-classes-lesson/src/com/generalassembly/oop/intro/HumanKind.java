package com.generalassembly.oop.intro;

public class HumanKind implements IsNamedObject, IsWorker  {
    private int id;
    private String name;
    private String address;
    private PerformWorkBehavior workBehavior;

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
        vannaWhite.setName("Vanna White");  
        System.out.println(vannaWhite.getName());
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

    public PerformWorkBehavior getWorkBehavior() {
        return this.workBehavior;
    }

    public void setWorkBehavior(PerformWorkBehavior theWork) {
        this.workBehavior = theWork;
    }
}
