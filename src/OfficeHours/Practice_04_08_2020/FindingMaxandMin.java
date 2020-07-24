package OfficeHours.Practice_04_08_2020;

import java.util.Scanner;

public class FindingMaxandMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-2147483648;
        int min=2147483647;

        int i=1;
        while(i<=3){

            System.out.println("Enter a number");
            int num=input.nextInt();

            if(num>max){
                max=num;
            }

            if(num<min){
                min=num;
            }

            i++;
        }

        System.out.println("Max number is "+max);
        System.out.println("Min number is "+min);









    }
}
