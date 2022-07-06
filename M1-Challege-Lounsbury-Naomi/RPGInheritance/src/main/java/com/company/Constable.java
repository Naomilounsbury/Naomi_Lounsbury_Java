package com.company;

public class Constable extends BaseCharacter{
    public String jurisdiction(){
        return "My name is Constable "+getName()+" and I have jurisdiction in these parts.";
    }

    public Constable(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
    }

    public Constable() {
    }

    public String arrestSomeone(String name){
        return "I'm going to arrest "+name;

    }
}
