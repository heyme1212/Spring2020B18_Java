package Replits.Replit_05082020;

import java.util.Arrays;

public class Rowsum {
    public static void main(String[] args) {

        int[][] nums = {{1,1,2}, {3,1,2},{3,5,3},{0,1,2}};
        int [] arr= new int [nums.length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = 0; j < nums[i].length; j++) {
                sum += nums[i][j];
            }

            arr[i]=sum;
        }

        System.out.println(Arrays.toString(arr));

    }



}
