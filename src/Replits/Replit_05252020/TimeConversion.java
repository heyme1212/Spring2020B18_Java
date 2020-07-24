package Replits.Replit_05252020;

public class TimeConversion {
    /*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
     */

    public static void timeConversion(String s) {
       /*
       Input: 07:05:45PM
       Output: 19:05:45

       Input: 07:05:45AM
       Output: 07:05:45
        */

        if (s.equals("12:00:00AM")) {
            System.out.println("00:00:00");
        } else if (s.equals("12:00:00PM")) {
            System.out.println("12:00:00");
        } else if (s.endsWith("AM")) {
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
            s = s.replace("AM", "");
            if (hour == 12) {
                s = "00" + s.substring(2);
            }
            System.out.println(s);

        } else if (s.endsWith("PM")) {
            int hour = Integer.parseInt(s.substring(0, s.indexOf(":")));
            hour += 12;
            String newTime = hour + s.substring(s.indexOf(":")).replace("PM", "");
            System.out.println(newTime);
        }
    }

}
