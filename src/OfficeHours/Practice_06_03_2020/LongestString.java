package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestString {
    /*

5) Create a method that will accept an ArrayList of Strings and return the String that has the biggest length

     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("A","Ba","Car","House"));
        System.out.println(getLongest(list));
    }


    public static String getLongest (ArrayList<String>arr){
        String max=arr.get(0);

        for(int i=0; i<arr.size();i++){
            if(arr.get(0).length()<arr.get(i).length()){
                max=arr.get(i);
            }
        }
        return max;
    }

    /*
      public static String longestString(ArrayList<String> list) {

        String biggest = "";

        for(String word : list) {

            if(word.length() > biggest.length()){
                biggest = word;
            }

        }
        return biggest;

    }
     */


}
