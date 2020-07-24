package day24_Methods;

import java.util.Arrays;

public class TasksFromYesterday {
    /*
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
     */

    public static void main(String[] args) {
        int[]arr = {4,45,7,11,19,5};
        MaxNumber(arr);
        MinNumber(arr);
        DescendingOrder(arr);

    }

        public static void MaxNumber(int[] arr) {

        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

            System.out.println(max);
        }

        public static void MinNumber(int [] arr){
        int min=arr[0];
        for(int j=0; j<arr.length; j++){
            if(arr[j]<min){
                min=arr[j];
            }
        }
            System.out.println(min);
        }


        public static void DescendingOrder(int [] arr){
        Arrays.sort(arr);
        int [] revArray=new int[arr.length];

        int j = arr.length -1;
            for(int i =0; i <= arr.length-1; i++ ){
                revArray[i] = arr[j];
                j--;
            }

            System.out.println(Arrays.toString(revArray));


        }


















}
