package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarriorTest {

    @Test
    public void shouldIntroduceThemself() {
        Warrior guy= new Warrior("lina", 75, 100,75, 10, 1,false, false,50);
        String expectedValue ="Hi my name is "+guy.getName()+ " and I am a warrior";

        //act
        String actualValue = guy.introduce();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldGetShieldStrength() {
        Warrior guy= new Warrior("lina", 75, 100,75, 10, 1,false, false,50);
        int expectedValue =50;

        //act
        int actualValue = guy.getShieldStrength();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test()
    public void shouldSetShieldStrength() {
        Warrior guy= new Warrior("lina", 75, 100,75, 10, 1,false, false,50);
        int expectedValue =75;
        guy.setShieldStrength(75);
        //act
        int actualValue = guy.getShieldStrength();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

}