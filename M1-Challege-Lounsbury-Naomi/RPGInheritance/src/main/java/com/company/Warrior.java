package com.company;

public class Warrior extends BaseCharacter{
    public void introduce(){
        System.out.println("Hi my name is "+getName()+" and I am a warrior");
    }

    private int ShieldStrength;

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        ShieldStrength = shieldStrength;
    }

    public Warrior() {
    }
}
