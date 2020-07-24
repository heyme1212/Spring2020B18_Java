package X_FILES;

import Replits.Replit_04132020.Array;

import java.util.Arrays;

public class tekrar4 {
    public static void main(String[] args) {
        int[] arr1 = {1,10, 9,8,14,15};
        int [] result1= sortDescending(arr1);
        System.out.println(Arrays.toString(result1));



    }

    public static int [] sortDescending(int [] arr){
        Arrays.sort(arr);
        int [] reversed=new int[arr.length];

        for(int j=arr.length-1;j>=0; j--){
            for(int i=0; i<reversed.length; i++){
                reversed[i]=arr[j];
        }
    }


        return reversed;

}










}
