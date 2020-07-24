package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date1=LocalDate.now();
        System.out.println(date1.format(dtf));
        // 2M olursa sayi 3M olursa Apr seklinde cikar tarih.Onemli!!
        //YY-YYYY
        //MM-MMM-MMMM
        //EEEE adds the day of week.

/*
create a date call birthday, pattern should be Months/days/Year
Apr/23/20
 */

DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("EEEE MMMM/dd/yy");
//LocalDate date2=LocalDate.now();
        LocalDate date2=LocalDate.of(1999,12,14);
        System.out.println(date2.format(dtf2));

/*
// If I don't like the format, I need to call the DateTimeFormatter class
// then I provide what format I will like to use to format date
DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

 year: yy, yyyy
 Month: MM, MMM (capital M for month, small m for minutes)
 day : dd

        System.out.println(date1.format(dtf));  //  2020/04/23
//OR
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy"); // MM prints month as 2 digit number
        System.out.println(date1.format(dtf2)); //  04/23/2020
//OR
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM dd, yyyy"); // MMM will print first 3 letters of month
        System.out.println(date1.format(dtf3)); //  Apr 23, 2020
// OR
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(date1.format(dtf4)); //  23/Apr/2020
      */


    }
}
