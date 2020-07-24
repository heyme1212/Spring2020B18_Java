package day14_StringClass2;

import java.util.Scanner;

public class WordEnds_ly {

     /*
        4. Ask user to enter a word. Print "really?"  if the word ends with ly, print "never mind" otherwise.
			Input:
				Seriously
			Output:
				really?

         */
     public static void main(String[] args) {
         Scanner input= new Scanner(System.in);
         System.out.println("Please enter your word");
         String str=input.next();
         if(str.endsWith("ly")){
             System.out.println("Really?");
         }else{
             System.out.println("Never mind");
         }




     }

}
