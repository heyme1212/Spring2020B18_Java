package day09_NestedIf_Ternary;

import java.sql.SQLOutput;

public class IfStatement_WithoutCurlyBraces {
    public static void main(String[] args) {
        int number=100;
        if(number%2==0){
            System.out.println("Even number");
        } else{
            System.out.println("Odd Number");
        }

        if(true){
            System.out.println("Hello World");
            System.out.println("Condition is true");
            System.out.println("Test executed");
        }

        //if if-statement has 1 condition in its body you can use without the curly braces.
        //if the boolean statemnt is true, without the curly braces

        if(9 > 8) { // if the block conating more than one statement we MUST give the body
            System.out.println("Hello");
            System.out.println("Condition is true");
            System.out.println("Test executed");
        }

        /*
        without curly braces whatever you write only one and first statement will be displayed
         if(9<8) // if condition is true, first statement will be printed. the rest will be printed regardless if
             // it is true or false
                  System.out.println("Abundance");
        System.out.println("Love");// does not include the condition.
        System.out.println("Awareness");//does not include the condition.
         */









    }



}
