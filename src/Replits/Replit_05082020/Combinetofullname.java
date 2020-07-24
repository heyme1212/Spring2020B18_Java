package Replits.Replit_05082020;

import java.util.Arrays;
import java.util.Scanner;

public class Combinetofullname {
    public static void main(String[] args) {
/*
Complete the combineNames method to return a new String array that is composed of the first name and last name of
each of the parameters.

This may be confusing so look at the example:
first_names = {"bob","joe"}
last_names = {"jones","smith"}

returns a new String array with {"bob jones", "joe smith"}
 */

        String [] firstNames={"bob","joe"};
        String [] lastNames= {"jones","smith"};

        String [] arr= new String [firstNames.length];

        for(int i=0; i<firstNames.length; i++){
                arr[i]=firstNames[i]+" "+lastNames[i];

        }

        System.out.println(Arrays.toString(arr));





    }
}
