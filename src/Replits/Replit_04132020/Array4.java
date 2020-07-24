package Replits.Replit_04132020;
import java.util.Arrays;
import java.util.Scanner;
public class Array4 {
    public static void main(String[] args) {
        /*
        Given a String array words, iterate through each word and print first and last letter of each element in the format below.

        Example:

        words → ["hello", "why", "by", "apple" , "note"]
        print → [ho, wy, by, ae, ne]
                 */
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        /*
        String result="";
        for(int i=0; i<words.length; i++){

            result+=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1)+", ";
        }


        System.out.println("["+result.substring(0,result.length()-2)+"]");
*/

     /*
      int [] num1={1,2};
      int [] num2={3,4};
      int [] numTotal=new int [num1.length+num2.length];

      for(int i=0; i<num1.length; i++){
          numTotal[i]=num1[i];
      }

      for(int i=0; i<num2.length; i++){
          numTotal[num1.length+i]=num2[i];
      }


      System.out.println(Arrays.toString(numTotal));
*/

        String [] result= new String [words.length];
        for(int i=0; i<words.length; i++){
            result[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1);
        }

        System.out.println(Arrays.toString(result));



    }
}

