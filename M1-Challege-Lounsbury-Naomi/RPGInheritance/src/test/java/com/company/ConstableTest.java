package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConstableTest {

    @Test
    public void jurisdiction() {
        Constable guy= new Constable("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        String expectedValue ="My name is Constable "+guy.getName()+" and I have jurisdiction in these parts.";
        guy.jurisdiction();
        //act
       String actualValue=guy.jurisdiction();

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldArrestSomeone(){
        Constable guy= new Constable("Jackie the Trackie", 75, 100,75, 10, 1,false, false);
        String expectedValue ="I'm going to arrest Jackson";

        //act
        String actualValue=guy.arrestSomeone("Jackson");

        //Assert
        assertEquals(expectedValue, actualValue);

    }
}