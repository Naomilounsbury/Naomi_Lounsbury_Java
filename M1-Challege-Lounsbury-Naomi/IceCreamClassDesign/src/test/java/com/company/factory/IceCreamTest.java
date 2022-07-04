package com.company.factory;

import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamTest {

    @Test
    public void getFlavor() {
        //Arrange
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        String expectedValue ="Mango";

        //act
        String actualValue =peanutIceCreamFactory.getFlavor();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setFlavor() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        peanutIceCreamFactory.setFlavor("Strawberry");
        String expectedValue ="Strawberry";

        //act
        String actualValue =peanutIceCreamFactory.getFlavor();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getSalePrice() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        double expectedValue =2.5;

        //act
        double actualValue =peanutIceCreamFactory.getSalePrice();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void setSalePrice() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");

        peanutIceCreamFactory.setSalePrice(4.0);
        double expectedValue =4.0;
        //act
        double actualValue =peanutIceCreamFactory.getSalePrice();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void getProductionCost() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        double expectedValue =.5;

        //act
        double actualValue =peanutIceCreamFactory.getProductionCost();

        //Assert
        assertEquals(expectedValue, actualValue,.001);
    }

    @Test
    public void setProductionCost() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        peanutIceCreamFactory.setProductionCost(.95);
        double expectedValue =.95;

        //act
        double actualValue =peanutIceCreamFactory.getProductionCost();

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }

    @Test
    public void getProductionTime() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        String expectedValue ="2 days";

        //act
        String actualValue =peanutIceCreamFactory.getProductionTime();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setProductionTime() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        peanutIceCreamFactory.setProductionTime("5 days");
        String expectedValue ="5 days";

        //act
        String actualValue =peanutIceCreamFactory.getProductionTime();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getIngredients() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        String expectedValue ="cream, sugar, peanut butter, salt";

        //act
        String actualValue =peanutIceCreamFactory.getIngredients();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setIngredients() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        peanutIceCreamFactory.setIngredients("dirt, freedom, guns");
        String expectedValue ="dirt, freedom, guns";

        //act
        String actualValue =peanutIceCreamFactory.getIngredients();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void factoryMalfunction() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        peanutIceCreamFactory.factoryMalfunction("cream");
        String expectedValue ="There is no more of the cream";

        //act
        String actualValue =peanutIceCreamFactory.factoryMalfunction("cream");

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void lengthenProductionTime() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");
        peanutIceCreamFactory.lengthenProductionTime(2);
        String expectedValue ="The production time has been lengthened by 2 hour(s)";

        //act
        String actualValue =peanutIceCreamFactory.lengthenProductionTime(2);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void increaseProductionCost() {
        com.company.factory.IceCream peanutIceCreamFactory = new com.company.factory.IceCream("Mango", 2.5, .5, "2 days", "cream, sugar, peanut butter, salt");

        String expectedValue ="The production cost has increased from 0.5 to 5.5";

        //act
        String actualValue =peanutIceCreamFactory.increaseProductionCost(5.0);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}