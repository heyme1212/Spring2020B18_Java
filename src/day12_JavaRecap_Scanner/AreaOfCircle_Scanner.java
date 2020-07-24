package day12_JavaRecap_Scanner;

import java.util.Scanner;
public class AreaOfCircle_Scanner {
    /*
    scanner warmup tasks:
    1. write a program that can calculate the area of circle
                needed information:
                                    1. radius of the cirle

     */

       public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Enter the radius:");
        int radius= input.nextInt();

       double areaOfCircle= radius*radius*3.14;
        System.out.println("The area of circle is: "+areaOfCircle);














    }



}
