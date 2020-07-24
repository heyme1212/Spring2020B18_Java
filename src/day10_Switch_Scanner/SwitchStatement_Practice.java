package day10_Switch_Scanner;

public class SwitchStatement_Practice {
    public static void main(String[] args) {
       /*
          Write a program to display days:
               Monday
               Tuesday
               Wednesday
               Thursday
               Friday
                Saturday
                Sunday
        */
       int number =-10;

        switch(number){
            case 1:
                System.out.println("Monday");
                break;   //case is closed.
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid"); //burada break i sildik silince sistem cikamadigi icin Sunday de cikti sonucta.

            case 7:
                System.out.println("Sunday");
                break;














        }






    }

}
