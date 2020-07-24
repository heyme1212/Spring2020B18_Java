package day14_StringClass2;

import java.util.Scanner;

public class FirstLastCharacter {
    /*
    Write a program CheckWords:

3. Ask user to enter a word. Print true is the first and last characters of the string are same characters, print false otherwise.
			Input:
				abba
			Output:
				true
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your word");
        String str=input.next();
        int Wlength=str.length();
        if(str.charAt(0)==str.charAt(Wlength-1)){
            System.out.println("True");
        }else{
            System.out.println("False!!");
        }










    }





}
