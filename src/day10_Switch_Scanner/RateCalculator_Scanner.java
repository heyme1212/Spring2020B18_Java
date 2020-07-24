package day10_Switch_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class RateCalculator_Scanner {
    /*
    write a program for the rate calculator: rateCalculator
                        1. asks the user to enter salary (as integer)
                        2. asks the user how many hours does she/he works in a week
                        3. print the hourly rate
     */

    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        System.out.println("Enter your salary:");
        int salary =  scan.nextInt();

        System.out.println("Enter your working hour per week:");
        byte hour =scan.nextByte();

        System.out.println("Number of weeks that you work in a year: ");
        byte weeknum= scan.nextByte();

        int rate= salary/weeknum/hour;

        System.out.println("Your hourly rate is: "+rate);












    }









}
