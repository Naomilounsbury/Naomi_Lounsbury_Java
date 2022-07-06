package com.company;

public class App {
    public static void main(String[] args) {
        Farmer farmerJohn = new Farmer("John", 75, 100, 75,10, 1, false, false,false,false);
        System.out.println(farmerJohn.introduction());
        Constable constableFred = new Constable("Fred", 60,100,60,20,5,false,false);
        System.out.println(constableFred.jurisdiction());
        Warrior warriorBeth = new Warrior("Beth", 75,100, 100, 50,10, false, false, 100);
        System.out.println(warriorBeth.introduce());
        System.out.println(warriorBeth.attacks("Farmer John"));
        farmerJohn.isRunning();
        System.out.println(constableFred.attacks(warriorBeth.getName()));
        System.out.println(constableFred.arrestSomeone("Dan Mueller"));;
    }

}
