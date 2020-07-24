package Replits.Replit_04192020;

import java.util.Arrays;
import java.util.Scanner;

public class Methods155_FibonacciNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    /*
    In Fibonacci series, next number is the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,  89,  144,……...
    The first two numbers of Fibonacci series are 0 and 1.
    Given a number num, print n-th Fibonacci Number.
     */

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int [] arr=new int [num+1];
        arr[0]=0;
        arr[1]=1;


        for(int i=0; i<arr.length-2; i++){
            arr[i+2]=arr[i+1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));














    }
}
