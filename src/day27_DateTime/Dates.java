package day27_DateTime;

import java.time.LocalDate;
import java.util.Date;
import java.util.jar.JarOutputStream;

public class Dates {
    public static void main(String[] args) {
        LocalDate date1= LocalDate.of(2020,10,25);
        System.out.println(date1);

        LocalDate birthday=LocalDate.of(1987,3,14);
        System.out.println(birthday);

        //isAfter();comparing one date with another.Returns a boolean expression.
        //ilk tarih diger tarihten sonra mi diye kontrol eder.

        boolean result1=date1.isAfter(birthday); //true
        System.out.println(result1);

        //isBefore();comparing 2 dates.Returns a boolean expression.
        //ilk tarih once mi diye kontrol eder.

        boolean result2= date1.isBefore(birthday); //false
        System.out.println(result2);

        //isEqual():comparing 2 dates, 2 tarih ayni mi diye kontrol ediyor.
        //Returns boolean.

        boolean result3= date1.isEqual(birthday); //false
        System.out.println(result3);

        //isLeapYear();checks if the year is leap year is or not.
        boolean result4=birthday.isLeapYear();
        System.out.println(result4);

        System.out.println("+++++++++++++++++++++++++++++");

        LocalDate now=LocalDate.now(); //2020-04-23;
        System.out.println("Today is: "+now);

        String str=now.toString();
        System.out.println(str.replace("-","/"));

        String year=str.split("-")[0];
        System.out.println(year);














    }
}
