package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseCharacterTest {

    @Test
    public void getName() {
        //Arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        String expectedValue ="Jackie the Trackie";

        //act
        String actualValue = guy.getName();

        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void setName() {
        //Arrange

        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        String expectedValue ="Rhonda The honda";

        //act
        String actualValue = guy.setName("Rhonda The honda");

        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void getStrength() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =75;

        //act
        int actualValue = guy.getStrength();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setStrength() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =3;
        guy.setStrength(3);
        //act
       int actualValue = guy.getStrength();

        //Assert
        assertEquals(expectedValue, actualValue);
    }



    @Test
    public void getHealth() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =100;

        //act
        int actualValue = guy.getHealth();

        //Assert
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void setHealth() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =80;
        guy.setHealth(80);
        //act
        int actualValue = guy.getHealth();

        //Assert
        assertEquals(expectedValue, actualValue);
    }


    @Test
    public void getStamina() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =75;

        //act
        int actualValue = guy.getStamina();

        //Assert
        assertEquals(expectedValue, actualValue);

    }

    @Test
    public void setStamina() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =3;
        guy.setStamina(3);
        //act
        int actualValue = guy.getStamina();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getSpeed() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =10;

        //act
        int actualValue = guy.getSpeed();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setSpeed() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =3;
        guy.setSpeed(3);
        //act
        int actualValue = guy.getSpeed();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getAttackPower() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =1;

        //act
        int actualValue = guy.getAttackPower();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setAttackPower() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        int expectedValue =3;
        guy.setAttackPower(3);
        //act
        int actualValue = guy.getAttackPower();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isRunning() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        boolean expectedValue =false;

        //act
        boolean actualValue = guy.isRunning();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setRunning() {
        //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        boolean expectedValue =true;
        guy.setRunning(true);
        //act
        boolean actualValue = guy.isRunning();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void isArrested() {
    //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
       boolean expectedValue =false;
        //guy.isArrested();
        //act
        boolean actualValue = guy.isArrested();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void setArrested() {
    //arrange
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        boolean expectedValue =true;
        guy.setArrested(true);
        //act
        boolean actualValue = guy.isArrested();

        //Assert
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void attacks() {
        BaseCharacter guy= new BaseCharacter("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        String expectedValue ="Jackie the Trackie attacked arnold";
        //guy.attacks( arnold);
        //act
        String actualValue = guy.attacks("arnold");

        //Assert
        assertEquals(expectedValue, actualValue);

    }
}