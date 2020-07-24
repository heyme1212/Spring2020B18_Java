package day22_ArraysLoopsPractice;

public class Nested_ForEach_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
int sumofEven=0;



        for(int[] eah1Darray:numbers){
     for(int eachnumber: eah1Darray){
         if(eachnumber%2==0){
             System.out.print(eachnumber+" ");
             sumofEven+=eachnumber;
         }

     }
 }

        System.out.println(sumofEven);








    }



}
