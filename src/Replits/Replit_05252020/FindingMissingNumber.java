package Replits.Replit_05252020;

import java.util.Arrays;

public class FindingMissingNumber {
    public static void main(String[] args) {
        int result = 0;
        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] arr=  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int a = 0; a < temp.length; a++) {
            int number = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == temp[a]) {
                    number++;
                }
            }
            if (number == 0)
                result = temp[a];
        }
    }

    public static int missingNumber(int[] arr){
        int sumTotal=55;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
       }

        int missing=sumTotal-sum;
        return missing;
    }
}
