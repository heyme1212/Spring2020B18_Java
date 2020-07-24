package day05_unary_shorthandoperators;

public class Leapyear {
    /* create a class called Leapyear, and write a program that can identify if the given is leap year, print true
    if its leap year.
    ex: year = 2020 ==> short;
    Leap year= true/false;

    output
    2020 is leap year: true

     */


    public static void main (String[] args){
        short year = 2020;
        boolean leapyear = year %4 ==0;

        System.out.println(year + " is leap year: " + leapyear);

        //String result= year + " is leap year: " + leapyear;
        //System.out.println(result);














    }




}
