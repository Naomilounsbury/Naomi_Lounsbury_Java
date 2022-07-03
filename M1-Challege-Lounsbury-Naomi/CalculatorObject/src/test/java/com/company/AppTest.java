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
    @Test
    public void shouldAddDoubles(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        double expectedValue =5.0;

        //act
        double actualValue =calculator.add(1.5,3.5);

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }
    @Test
    public void shouldSubtractInts(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        int expectedValue =5;

        //act
        int actualValue =calculator.subtract(7,2);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldSubtractDoubles(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        double expectedValue =5.0;

        //act
        double actualValue =calculator.subtract(7.2,2.2);

        //Assert
        assertEquals(expectedValue, actualValue, .001);
    }
    @Test
    public void shouldMultiplyInts(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        int expectedValue =50;

        //act
        int actualValue =calculator.multiply(10,5);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldMultiplyDoubles(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        double expectedValue =51;

        //act
        double actualValue =calculator.multiply(10.0,5.1);

        //Assert
        assertEquals(expectedValue, actualValue,.001);
    }
    @Test
    public void shouldDivideInts(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        int expectedValue =5;

        //act
        int actualValue =calculator.divide(10,2);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldDivideDoubles(){
        //Arrange
        CalculatorObject calculator =new CalculatorObject();
        double expectedValue =10;

        //act
        double actualValue =calculator.divide(51,5.1);

        //Assert
        assertEquals(expectedValue, actualValue,.001);
    }

}