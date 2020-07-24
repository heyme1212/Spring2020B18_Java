package Replits.Replit_04112020;
import java.util.Scanner;
public class Count_Hi {
    public static void main(String[] args) {
/*
Print out the number of times that the string "hi" appears anywhere in the given string.

 */

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count=0;
        while(str.contains("hi")){
            count++;
            str=str.replaceFirst("hi","");
        }

        System.out.println(count);





    }

}
