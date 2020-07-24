package Replits.Replit_04112020;
import java.util.Scanner;
public class count2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        while(word.contains("java")){
            count++;
            word=word.replaceFirst("java","");
        }
        System.out.println(count);







    }
}