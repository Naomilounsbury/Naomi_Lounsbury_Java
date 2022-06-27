package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private double cost;

    public IceCream(String flavor, double price, double cost) {
        this.flavor = flavor;
        this.price = price;
        this.cost = cost;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", cost=" + cost +
                '}';
    }
}
