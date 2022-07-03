package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {
    @Test
    public void shouldAddInts(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        int expectedValue =5;

        //act
        int actualValue =calculator.add(2,3);

        //Assert
        assertEquals(expectedValue, actualValue);
    }

}