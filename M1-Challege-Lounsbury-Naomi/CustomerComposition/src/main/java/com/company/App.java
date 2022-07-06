package com.company;

public class App {
    public static void main(String[] args) {
        Address janAddress =new Address("theroad","theCity","theState", "848484");
        Customer customer = new Customer("Jan", "smith", "jan@hotmail.com","83838383",janAddress,janAddress,false);
        System.out.println(customer);
    }
}
