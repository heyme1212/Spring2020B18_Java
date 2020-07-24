package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;
import java.util.jar.JarOutputStream;

public class StringMethods {
    public static void main(String[] args) {
        /*
        String methods related Arrays:
        toCharAt():
        split():
         */

        String str="Cybertek";

        char [] ch= str.toCharArray(); // ['C', 'y','b','e','r','t','e','k']
        System.out.println(str.length()==ch.length);
       // System.out.println(str.length()); 8

        /*
        1.  write a program that can check if two Strings are build out of same
        Ex:
            if str1 = "aabbbc";  str2 ="cab";
            output: true
            if str1 ="abcd";  str2 ="abc";
            output: false
            Hint: you will need array and Arrays' methods
         */

        String str1="ABC";
        String str2="BAC";

        //create an array to include the characters of these strings

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2)); //true

        System.out.println("++++++++++++++");

        String sentence="I like to learn Java";

        String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));

        int totalWords=words.length;

        System.out.println(totalWords);

        String result="";

        for(int i=words.length-1; i>=0; i--){
            //System.out.print(words[i]+", ");
            result+=words[i]+" ";
        }

        System.out.println(result.trim());
































    }
}
