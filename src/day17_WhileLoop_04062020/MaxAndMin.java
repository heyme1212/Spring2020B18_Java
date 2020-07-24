package day17_WhileLoop_04062020;

import day07_IfStatements.MaxNumber;

import java.util.Scanner;

public class MaxAndMin {
/*
 1. write a program that can ask the user "enter a number" five times and return the maximum number
                hint: you will nedd for loop and if statement
    2. write a program that can ask the user "enter a number" five times and return the minimum number
                hint: you will nedd for loop and if statement

 */
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int maxNumber=-9999999;  //any number provided will be greater than this number. Just made up this number.
                             //first user entered variable will be initialized to maxNumber.

    int minNumber=999999999;

    for(int i=1; i<=5; i++){
        System.out.println("Enter a number");
        int num= input.nextInt();

        if(num>maxNumber){
            maxNumber=num;
        }

        if(num<minNumber){
            minNumber=num;
        }
    }

    System.out.println(maxNumber);
    System.out.println(minNumber);


















}


}
