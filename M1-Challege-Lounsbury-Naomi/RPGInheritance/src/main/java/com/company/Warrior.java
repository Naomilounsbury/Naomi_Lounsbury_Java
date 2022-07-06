package com.company;

public class Warrior extends BaseCharacter{
    public String introduce(){
        return "Hi my name is "+getName()+" and I am a warrior";
    }

    private int ShieldStrength;

    public int getShieldStrength() {
        return ShieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        ShieldStrength = shieldStrength;
    }

    public Warrior(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, int shieldStrength) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        ShieldStrength = shieldStrength;
    }

    public Warrior() {
    }
}
