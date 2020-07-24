package day15_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        /*
        write a program to identify if a string is palindrome or not. if yes==> true,.otherwise ==> false
        level ==> level ==> palindrome

         */

        //as long as condition is true, it will never stop. we need iteration.

       String reverse="";
       Scanner s=new Scanner(System.in);
       System.out.println("Enter your word");
       String word=s.next();

       for(int i=word.length()-1; i>=0; i--){
           reverse+=word.charAt(i);
       }

        System.out.println(reverse);


       if(word==reverse){
           System.out.println("true");
       }else{
           System.out.println("false");
       }
















    }
}
