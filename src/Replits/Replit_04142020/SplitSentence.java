package Replits.Replit_04142020;
import java.util.Scanner;
public class SplitSentence {
    /*
    Given a String variable sentence, write code to type each word in separate lines.

                Example:
                sentence -> "Java is fun"
                Print
                Java
                is
                fun

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] arr=sentence.split(" ");
        //System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }







    }




}
