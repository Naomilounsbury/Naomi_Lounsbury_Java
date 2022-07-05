package com.company;

public class Farmer extends BaseCharacter{
    private boolean plowing;
    private boolean harvesting;

    public Farmer(String name, int strength, int health, int stamina, int speed, int attackPower, boolean running, boolean arrested, boolean plowing, boolean harvesting) {
        super(name, strength, health, stamina, speed, attackPower, running, arrested);
        this.plowing = plowing;
        this.harvesting = harvesting;
    }

    public Farmer() {
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "plowing=" + plowing +
                ", harvesting=" + harvesting +
                '}';
    }

    public void introduction(){
        System.out.println("My name is "+getName()+ "and I'm a farmer");
    }
}
