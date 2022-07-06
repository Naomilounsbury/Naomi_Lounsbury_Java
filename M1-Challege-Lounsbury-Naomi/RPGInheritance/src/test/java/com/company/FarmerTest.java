package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {

    @Test
    public void isPlowing() {
        Farmer guy= new Farmer("Johnny Beau", 75, 100,75, 10, 1,false, false,false, false);
        boolean expectedValue =false;

        //act
        boolean actualValue = guy.isPlowing();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setPlowing() {
        Farmer guy= new Farmer("Johnny Beau", 75, 100,75, 10, 1,false, false,false, false);
        boolean expectedValue =true;
        guy.setPlowing(true);
        //act
        boolean actualValue = guy.isPlowing();

        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void isHarvesting() {
        Farmer guy= new Farmer("Johnny Beau", 75, 100,75, 10, 1,false, false,false, false);
        boolean expectedValue =false;

        //act
        boolean actualValue = guy.isHarvesting();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setHarvesting() {
        Farmer guy= new Farmer("Johnny Beau", 75, 100,75, 10, 1,false, false,false, false);
        boolean expectedValue =true;
        guy.setHarvesting(true);
        //act
        boolean actualValue = guy.isHarvesting();

        //Assert
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void introduction() {

        Farmer guy= new Farmer("Johnny Beau", 75, 100,75, 10, 1,false, false,false, false);
        String expectedValue ="My name is "+guy.getName()+ " and I'm a farmer";

        //act
        String actualValue = guy.introduction();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
}