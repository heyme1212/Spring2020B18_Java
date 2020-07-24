package Replits.Replit_04112020;

import java.util.Scanner;

public class dogscats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        while(word.contains("dog")){
            countOfDogs++;
            word=word.replaceFirst("dog","");
        }

        while(word.contains("cat")){
            countOfCats++;
            word=word.replaceFirst("cat","");
        }

        if(countOfCats==countOfDogs){
            System.out.println("true");
        }else{
            System.out.println("false");
        }





    }
}
