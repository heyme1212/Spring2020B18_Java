package day22_ArraysLoopsPractice;

import java.util.Arrays;

public class Descending {
    /*
     2. write a program that sort the array in descending order
     you MUST use arrays and for each loop)

     */
    public static void main(String[] args) {
        int[] arr = {10, 78, 2, -1, 500, 70};
        Arrays.sort(arr); // sorts in ascending
        //then reverse the array that's sorted in ascending->make it descending

        System.out.println( Arrays.toString(arr) );

        int[] RevArr = new int[arr.length];

        int j = arr.length -1;

        for(int i =0; i <= arr.length-1; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        System.out.println( Arrays.toString(RevArr));









    }


}
