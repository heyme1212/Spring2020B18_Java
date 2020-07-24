package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class WarmUp {
    /*
    warmup task:
	1. write a method that can return the maximum number from an int array
	2. write a method that can return the maximum number from a double array
			NOTE: MUST apply method overloading
	3. write a method that can return the minimum number from an int array
	4. write a method that can return the minimum number from a double array
			NOTE: MUST apply method overloading
	5. write an int[] return method that can sort an int array in desending order
	6. write a double[] return method that can sort a double array in desending order
	7. write a char[] return method that can sort a char array in desending order
			NOTE: MUST apply method overloading
     */


      public static int MaxNum(int [] arr){
            Arrays.sort(arr);
            return(arr[arr.length-1]);

      }

      public static double MaxNum(double [] arr){
            Arrays.sort(arr);
            return(arr[arr.length-1]);
      }


      public static void main(String[] args) {
            int[] array = {7,5,20,17,21};
            System.out.println(MaxNum(array));
            System.out.println(MaxNum(array));

      }

}
