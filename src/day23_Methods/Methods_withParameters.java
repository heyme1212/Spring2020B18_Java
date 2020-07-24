package day23_Methods;

import java.util.Scanner;

public class Methods_withParameters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=scan.nextInt();
        EligibletoBuy(age);
    }




        public static void EligibletoBuy(int age){
            if(age>=21){
                System.out.println("Eligible");
            }else{
                System.out.println("Not eligible");
            }
        }

















}
