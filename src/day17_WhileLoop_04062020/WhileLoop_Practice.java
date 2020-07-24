package day17_WhileLoop_04062020;

import java.util.Scanner;

public class WhileLoop_Practice {
    public static void main(String[] args) {
        /*
        Ask user to enter yes or no.
        If user enters other than yes or no, repeat the question.
         */

        Scanner input=new Scanner(System.in);

        System.out.println("Enter yes or no");
        String answer=input.next();

        boolean valid= answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no");
        while(!valid){
            System.out.println("Please re-enter");
            answer=input.next();

            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no")){
                break;
            }
        }

        if(answer.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }

        if(answer.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }







    }



}
