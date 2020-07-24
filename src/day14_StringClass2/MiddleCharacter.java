package day14_StringClass2;

import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word");
        String word= input.next();

        String middleCharacter= "";
        int totalChars=word.length();
        int middleNumber=totalChars/2;

        if(totalChars%2 !=0){
            middleCharacter+=word.charAt(middleNumber);
        }else{
            middleCharacter="" +word.charAt(middleNumber-1)+word.charAt(middleNumber);

        }

        System.out.println(middleCharacter);


        //middleCharacter += word.charAt(middleNumber - 1) + word.charAt(middleNumber);
        //cozum

        // middleCharacter += word.charAt(middleNumber - 1)+"" + word.charAt(middleNumber);











    }}
