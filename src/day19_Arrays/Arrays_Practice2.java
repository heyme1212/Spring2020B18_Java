package day19_Arrays;

import java.util.Scanner;

public class Arrays_Practice2 {
    public static void main(String[] args) {
        /*
        initialization the size of the array;
        1.giving the values:
        int[] arr={10,20,30}
        2.giving the size only
        int[] att=new int[length];

        default value of int data type (byte short int long)  is 0;

         */

        int[] arr={ 10, 20,30};
        System.out.println(arr.length); //3

        int[] arr2= new int[5]; //yeni array tanimlama

        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        String[] testers=new String[3]; //"Medina", "Reem", "Osman"

          testers[0]="Reem";
          testers[1]="Osman";
          testers[2]="Madina";

        System.out.println(testers[0]);
        System.out.println(testers[1]);
        System.out.println(testers[2]);

       System.out.println(arr2.length);

















    }
}
