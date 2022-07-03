package com.company;



public class ConverterSwitch implements Converter{
    public String convertMonth(int monthNumber) {
        String returnVal ="no number";
        //I made the months and days lower case to make it easy to differentiate when they are called
        switch(monthNumber) {
            case 1:
                returnVal= "january";
                break;
            case 2:
                returnVal= "february";
                break;
            case 3:
                returnVal= "march";
                break;
            case 4:
                returnVal= "april";
                break;
            case 5:
                returnVal= "may";
                break;
            case 6:
                returnVal= "june";
                break;
            case 7:
                returnVal= "july";
                break;
            case 8:
                returnVal= "august";
                break;
            case 9:
                returnVal= "september";
                break;
            case 10:
                returnVal= "october";
                break;
            case 11:
                returnVal= "november";
                break;
            case 12:
                returnVal= "december";
                break;
            default:
                returnVal= "that wasn't a number between 1 and 12";



        }
        return returnVal;


    }
    public String convertDay( int dayNumber){
        switch(dayNumber) {
            case 1:
                return "sunday";

            case 2:
                return "monday";

            case 3:
                return "tuesday";

            case 4:
                return "wednesday";

            case 5:
                return "thursday";

            case 6:
                return "friday";

            case 7:
                return "saturday";


            default:
                return "That wasn't a number betwean 1 and 7";



        }
    }

};





