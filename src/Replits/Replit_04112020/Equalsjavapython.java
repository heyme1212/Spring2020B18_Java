package Replits.Replit_04112020;
import java.util.Scanner;
public class Equalsjavapython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int numOfJava=0;
        int numOfPython=0;

        while(sentence.contains("java")){
            numOfJava++;
            sentence=sentence.replaceFirst("java","");
        }

        while(sentence.contains("python")){
            numOfPython++;
            sentence=sentence.replaceFirst("python","");
        }

        if(numOfJava==numOfPython){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


    }
}
