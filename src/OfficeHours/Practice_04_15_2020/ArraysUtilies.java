package OfficeHours.Practice_04_15_2020;


import java.util.Arrays;

public class ArraysUtilies {
        /*
        arrays.sort(): sorts the array to ascending order
        arrays.equal(): checks if two arrays are equal.
        arrays.toString()"print single dimensional arrays.
        arrays.deepToString() print multi dimensional arrays
         */

    public static void main(String[] args) {
        int[] arr={9,10,8,65,8,6,5};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        int [] salaries={10000, 20000, 30, 5000, 432, 123123, 200000 };
        int length=salaries.length;
        int lastIndex=length-1;

        Arrays.sort(salaries);
        System.out.println("Mi salary is: "+salaries[0]);
        System.out.println("Max salary is: "+salaries[lastIndex]);

        System.out.println("++++++++++++++++++++");

        int [] arr1={3,2,1};
        int [] arr2={2,1,3};

        System.out.println(Arrays.equals(arr1,arr2)); //false
        //equas method a harfi harfine ayni olmali.
        // arr1[0] ve arr2[0] ayni olmali exactly
       // ayni sirada ayni rakamlar olmali.

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1,arr2));//true




































    }
}
