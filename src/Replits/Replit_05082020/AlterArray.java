package Replits.Replit_05082020;

import java.util.Arrays;

public class AlterArray {
    public static void main(String[] args) {

/*
Complete the mystery method so that it takes in an integer array as a parameter, and then modifies each element
based on whether it's even or odd.  If the number is even, divide it by 2.  If it's odd, multiply it by 10.
 */     int[] array = {1,2,3,4,5};

        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                array[i]=array[i]/2;
            }else{
                array[i]=array[i]*10;
            }
        }

        System.out.println(Arrays.toString(array));


    }
}
