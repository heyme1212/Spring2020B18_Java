package day19_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Practice3 {
    public static void main(String[] args) {

        /*
        write a program that asks "enter a name" 10 times, and store each of the names in the array students
         */

        Scanner input= new Scanner(System.in);
        String[] students= new String[10];

        for(int i=0; i<students.length; i++){
            System.out.println("Enter a name");
            students[i]=input.next();
    }

        for(int i=0; i<students.length;i++){
            System.out.print(students[i]+" ");
        }














    }
}
