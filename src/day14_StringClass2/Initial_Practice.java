package day14_StringClass2;

import java.util.Scanner;

public class Initial_Practice {
    /*
        Assignment:
            write me a program that asks the user first and last names, then prints the initials.
            ex:
                input:
                    cybertek
                    school
                output:
                    CS
         */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first and last name");

        String firstName= input.nextLine();
        String firstInitial= firstName.substring(0,1).toUpperCase();

        String lastName=input.nextLine();
        String lastInitial=lastName.substring(0,1).toUpperCase();

        System.out.println(firstInitial.concat(lastInitial));

        //System.out.println(firstInitial);
        //System.out.println(lastInitial);










    }




}
