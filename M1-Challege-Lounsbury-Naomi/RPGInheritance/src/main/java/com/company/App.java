package com.company;

public class App {
    public static void main(String[] args) {
        Farmer farmerJohn = new Farmer("John", 75, 100, 75,10, 1, false, false,false,false);
        farmerJohn.introduction();
        Constable constableFred = new Constable("Fred", 60,100,60,20,5,false,false);
        constableFred.jurisdiction();
        Warrior warriorBeth = new Warrior("Beth", 75,100, 100, 50,10, false, false, 100);
        warriorBeth.introduce();
        warriorBeth.attacks("Farmer John");
        farmerJohn.isRunning();
        constableFred.attacks(warriorBeth.getName());
    }

}
