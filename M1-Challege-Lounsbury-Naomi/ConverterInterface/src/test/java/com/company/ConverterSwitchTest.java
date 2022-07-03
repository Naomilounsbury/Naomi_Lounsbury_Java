package com.company;


import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterSwitchTest {
    @Test

    public void shouldReturnJanuary(){
        //Arrange
        Converter converter = new ConverterSwitch();
        String expectedValue ="january";



        //act
        String actualValue =converter.convertMonth(1);

        //Assert
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void shouldReturnMonday(){
        //Arrange
        Converter converter = new ConverterSwitch();
        String expectedValue ="monday";



        //act
        String actualValue =converter.convertDay(2);

        //Assert
        assertEquals(expectedValue, actualValue);
    }



}