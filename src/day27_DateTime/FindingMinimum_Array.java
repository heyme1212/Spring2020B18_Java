package day27_DateTime;

public class FindingMinimum_Array {
/*
Warmup task:
		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.

 */
public static void main(String[] args) {
    int[] arr = {5, 4, 7, 5,};
    int minimum = arr[0];
    for (int each : arr) {
        if (each < minimum) {
            minimum = each;
        }
    }
    System.out.println(minimum);

    System.out.println("+++++++");
    int [] arr2={100,2000,3000,40,50,-100,-9000};
    System.out.println(MinNumArray(arr2));

    double [] arr3={55.5, 10.5, 1.5, 2.5,0,-15.5};
        double num1=MinNumArray(arr3);
    System.out.println(num1);
    }




public static int MinNumArray(int [] arr){
    int minimum = arr[0];
    for (int each : arr) {
        if (each < minimum) {
            minimum = each;
        }
    }

    return minimum;

    }

    public static double MinNumArray(double [] arr){
        double minimum = arr[0];
        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }

        return minimum;



    }








}
