package day22_ArraysLoopsPractice;

import java.util.Arrays;

public class EvenNumbers {
    /*
    Warmup tasks:
    Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to print out all the even numbers.
                MUst use continue statement

     */

    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        System.out.print(Arrays.toString(numbers));
        System.out.println();

              for (int eachNumber : numbers) {
            if (eachNumber % 2 != 0) {
                continue;
            } else {
                System.out.print(eachNumber+" ");
            }
        }






    }


}

