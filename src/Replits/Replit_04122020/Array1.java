package Replits.Replit_04122020;


import java.util.Scanner;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];

        System.out.println(Arrays.toString(arr));

        for (int i=0;i<5;i++) {
            arr[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(arr));

        for(int i=0; i<=arr.length-1; i++){
            System.out.println(arr[i].substring(0,3));
        }



    }
}