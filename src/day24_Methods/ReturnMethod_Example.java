package day24_Methods;

import day07_IfStatements.MinNumber;

import java.util.Arrays;
public class ReturnMethod_Example {

public static void main(String[]args){
    int [] arr={9,8,7,100,200,50,40};
    int max=maxNum(arr);
    System.out.println(max);
    int min= minNumber(arr);
    System.out.println(min);


        }

    public static int maxNum(int[] arr){
        Arrays.sort(arr);
        return arr[ arr.length-1];

    }

    public static int minNumber(int [] arr){
        Arrays.sort(arr);
        return arr[0];
    }





}
