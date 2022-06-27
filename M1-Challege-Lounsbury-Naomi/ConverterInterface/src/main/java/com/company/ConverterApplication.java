package com.company;

public class ConverterApplication{
    public static void main(String[] args) {
        Converter janSecond =new ConverterIf();

        Converter janFirst =new ConverterSwitch();
        //Converter convert;
        //convert =janFirst;
        System.out.println(janFirst.convertMonth(1));
        janFirst.convertDay(1);
        janSecond.convertMonth(1);
        janSecond.convertDay(2);

    }
}
