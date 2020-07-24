package day15_ForLoop;

import java.util.Scanner;

public class WarmUp {

    /*
    Warmup tasks:
	1. write a program that asks user's first and last name, then prints out the initials of the user
			Ex:
				input:
					cybertek
					batch12
				output:your initial is: CB

     */

    public static void main(String[] args) {

            Scanner input= new Scanner(System.in);

            /*
            System.out.println("Please enter your first and last name");

            String firstName= input.nextLine();
            String firstInitial= firstName.substring(0,1).toUpperCase();

            String lastName=input.nextLine();
            String lastInitial=lastName.substring(0,1).toUpperCase();

            System.out.print(firstInitial);
            System.out.print(lastInitial);

 */

        System.out.println("Enter your first name");
        String firstName=input.next();
        System.out.println("Enter your last name");
        String lastName=input.next();

        /*
        String initials=firstName.substring(0,1).toUpperCase()+lastName.substring(0,1).toUpperCase();
        initials=initials.toUpperCase();
        System.out.println(initials);
       */


        String initials = "" + firstName.charAt(0) + lastName.charAt(0);  // returns string
        initials = initials.toUpperCase();
        System.out.println(initials);



        }


}
