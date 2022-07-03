package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private double profit;

    public IceCream(String flavor, double price, double profit) {
        this.flavor = flavor;
        this.price = price;
        this.profit = profit;
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

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }
    public void aDogStoleAnIceCreamGiveFreeIceCream(String flavor){
        System.out.println("A dog stole a child's ice cream, give a free "+flavor+" ice cream.");
    }
    public void ARobberCameSetProfitToZero(){
        double currentVal=this.profit=0;
        System.out.println("You've been robbed. The current profit of this flavor is "+currentVal+" dollars");
    }
    public void sale(){
        double currentPrice = this.price*0.8;
        System.out.println("There's a sale on "+this.flavor+". The new price is now  "+currentPrice+".");
    }

    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", profit=" + profit +
                '}';
    }
}
