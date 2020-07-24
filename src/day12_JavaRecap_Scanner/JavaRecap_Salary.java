package day12_JavaRecap_Scanner;

import java.util.Scanner;

public class JavaRecap_Salary {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        /*
        ask the user enter salary
        ask the user enter full name
        ask the user to enter company name
        ask the user to enter SSN
        ask the user to enter JobTitle
         */

        System.out.println("Enter your salary: ");
        double salary= input.nextDouble(); //100000+Enter

        input.nextLine();
        System.out.println("Enter your full name:");
        String fullName= input.nextLine();

        System.out.println("Enter your company name:");
        String companyName= input.nextLine();

        System.out.println("Enter your SSN:");
        long SSN= input.nextLong();

        input.nextLine();
        System.out.println("Enter your job tittle:");
        String jobTitle= input.nextLine();



    }
}
