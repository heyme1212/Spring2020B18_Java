package day14_StringClass2;

import java.util.Scanner;

public class CombineTwoStrings_2 {
    public static void main(String[] args) {
    /*
    2. Ask user to enter two words. Print first word without its first character then print the second word without
     its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
     */

        Scanner input= new Scanner(System.in);
        System.out.println("Please enter two words");
        String word1=input.next();
        word1= word1.substring(1,word1.length());

        String word2=input.next();
        word2= word2.substring(1,word2.length());

        String result= word1.concat(word2);
        System.out.println(result);







    }


}