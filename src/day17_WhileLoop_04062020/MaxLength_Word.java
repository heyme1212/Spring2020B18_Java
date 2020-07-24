package day17_WhileLoop_04062020;

import java.util.Scanner;

public class MaxLength_Word {
    /*
    warmup tasks:

	3. write a program that can ask the user to "enter a word" five times and returns the word that has the maximum length

     */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int maxLength=-999999999;
        String maxLenWord="";

        for(int i=0; i<5; i++){

            System.out.println("enter a word");
            String word=scan.next();
            int len=word.length();

            if(len>maxLength){
                maxLength=len;
                maxLenWord=word;
            }
        }

        System.out.println(maxLenWord);
        System.out.println(maxLength);









    }


}

