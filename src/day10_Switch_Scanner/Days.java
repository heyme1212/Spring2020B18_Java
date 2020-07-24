package day10_Switch_Scanner;

public class Days {

    public static void main(String[] args) {

        /*

2. write a program that can display the days based on the numbers 1 ~ 7
            MUST USE NESTED IF

*/
        byte numday = 5;
        String day = "";
        String day2 = "";


        if (numday > 0 && numday < 8) {

            if (numday == 1) {
                day = "Monday";
            } else if (numday == 2) {
                day = "Tuesday";
            } else if (numday == 3) {
                day = "Wednesday";
            } else if (numday == 4) {
                day = "Thursday";
            } else if (numday == 5) {
                day = "Friday";
            } else if (numday == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }

        } else {
            day = "Invalid";
        }

        System.out.println(day);


        day2 = (numday == 1) ? "Monday" : (numday == 2) ? "Tuesday" : (numday == 3) ? "Wednesday" : (numday == 4) ? "Thursday" :
                (numday == 5) ? "Friday" : (numday == 6) ? "Saturday" : (numday == 7) ? "Sunday" : "Invalid";




        System.out.println(day2);


    }
}
