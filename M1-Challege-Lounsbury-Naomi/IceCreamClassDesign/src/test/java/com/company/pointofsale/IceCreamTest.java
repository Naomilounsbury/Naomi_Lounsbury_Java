package com.company.pointofsale;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Test
    public void getFlavor() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, 3.0);
        String expectedValue ="Mango";

        //act
        String actualValue =peanutIceCreamSale.getFlavor();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setFlavor() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, 3.0);
        peanutIceCreamSale.setFlavor("Strawberry");
        String expectedValue ="Strawberry";

        //act
        String actualValue =peanutIceCreamSale.getFlavor();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getPrice() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        double expectedValue =2.5;

        //act
        double actualValue =peanutIceCreamSale.getPrice();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void setPrice() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        peanutIceCreamSale.setPrice(2.0);
        double expectedValue =2.0;

        //act
        double actualValue =peanutIceCreamSale.getPrice();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void getProfit() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        double expectedValue =0.5;

        //act
        double actualValue =peanutIceCreamSale.getProfit();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void setProfit() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        peanutIceCreamSale.setProfit(2.0);
        double expectedValue =2.0;

        //act
        double actualValue =peanutIceCreamSale.getProfit();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void aDogStoleAnIceCreamGiveFreeIceCream() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        peanutIceCreamSale.aDogStoleAnIceCreamGiveFreeIceCream("Strawbarry");
        String expectedValue = "A dog stole a child's ice cream, give a free Strawberry ice cream.";

        //act
        String actualValue =peanutIceCreamSale.aDogStoleAnIceCreamGiveFreeIceCream("Strawberry");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void ARobberCameSetProfitToZero() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        peanutIceCreamSale.ARobberCameSetProfitToZero();
        String expectedValue= "You've been robbed. The current profit of this flavor is 0.0 dollars";

        //act
        String actualValue =peanutIceCreamSale.ARobberCameSetProfitToZero();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void sale() {
        com.company.pointofsale.IceCream peanutIceCreamSale = new com.company.pointofsale.IceCream("Mango", 2.5, .5);
        peanutIceCreamSale.sale();
        String expectedValue= "There's a sale on Mango. The new price is now 2.0.";;

        //act
        String actualValue =peanutIceCreamSale.sale();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}