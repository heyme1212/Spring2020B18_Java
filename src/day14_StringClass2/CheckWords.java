package day14_StringClass2;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {
        /*
        Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=input.next();

        System.out.println("Enter second word");
        String word2=input.next();

        System.out.println("Enter third word");
        String word3=input.next();

        int length1= word1.length();
        int length2=word2.length();
        int length3=word3.length();

        boolean alldifferent= length1!=length2&& length2!=length3 && length1!=length3;

        if(length1==length2 && length2==length3){
            System.out.println("All words have the same length");

        }else if(alldifferent){
            System.out.println("All the words has different length");

        }else{
            System.out.println("Not Same nor different lengths");
        }







    }


}
