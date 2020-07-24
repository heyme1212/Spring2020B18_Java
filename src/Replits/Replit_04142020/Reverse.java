package Replits.Replit_04142020;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        /*
        Given a String variable sentence, write code to type each word in separate lines in a reverse order.
            Example:
            sentence -> "Java is fun"
            Print
            fun
            is
            Java
         */

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String [] reverse= sentence.split(" ");

        for(int i=reverse.length-1;i>=0; i--){
            System.out.println(reverse[i]);
        }






    }
}
