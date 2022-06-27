package com.company;

public interface Converter {

    /**
     * This method converts the given number into its corresponding month.
     * @param monthNumber&mdash;the number you wish to convert to a month
     * @return&mdash;the name of the corresponding month if the parameter value is between 1 and 12; error message otherwise
     */
    String convertMonth(int monthNumber);
    String convertDay(int dayNumber);

}
