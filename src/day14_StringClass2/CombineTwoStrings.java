package day14_StringClass2;

import java.util.Scanner;

public class CombineTwoStrings {
    /*
     1. Ask user to enter two words. Print the first word, second word, second word, first word
            Input:
                one
                two
            Output:
                onetwotwoone
                    DO NOT USE + OPERATOR
     */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Please enter two words");
        String firstW=input.next();
        String secondW=input.next();

        String str=firstW.concat(secondW);
        String str1= str.concat(secondW).concat(firstW);

        //eger arada bosluk istersek:
        //String result=firstW.concat(" "+secondW).concat(" "+secondW).concat(" "+firstW);
       // System.out.println(result);


        //System.out.println(str1);

        /*
         Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
            String word1 = input.next();

        System.out.println("Enter second word");
            String word2 = input.next();


        String result = word1.concat(" "+word2).concat(" "+word2).concat(" "+word1);

        System.out.println(result);

         */










    }





}
