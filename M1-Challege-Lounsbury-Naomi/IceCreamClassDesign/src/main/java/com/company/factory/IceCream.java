package com.company.factory;

public class IceCream {
    private String flavor;
    private double salePrice;
    private double productionCost;
    private String productionTime;
    private String ingredients;

    public IceCream(String flavor, double salePrice, double productionCost, String productionTime, String ingredients) {
        this.flavor = flavor;
        this.salePrice = salePrice;
        this.productionCost = productionCost;
        this.productionTime = productionTime;
        this.ingredients = ingredients;

    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public String getProductionTime() {
        return productionTime;
    }

    public void setProductionTime(String productionTime) {
        this.productionTime = productionTime;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void factoryMalfunction(String ingredient){
        System.out.println("There is no more of the "+ ingredient);
    }
    public void lengthenProductionTime(int hour){
        System.out.println("The production time has been lengthened by "+hour+" hour(s)");
    }
    public void increaseProductionCost(double increase){
        double previousProdCost =this.productionCost;
        double currentProdCost= this.productionCost+=increase;
        System.out.println("The production cost has increased from "+previousProdCost+" to "+currentProdCost);

    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavor='" + flavor + '\'' +
                ", salePrice='" + salePrice + '\'' +
                ", productionCost='" + productionCost + '\'' +
                ", productionTime='" + productionTime + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }
}
