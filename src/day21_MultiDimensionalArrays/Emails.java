package day21_MultiDimensionalArrays;

import javafx.scene.effect.Blend;

public class Emails {
    public static void main(String[] args) {
        /*
String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"}
        elemnts could be more in the array
    prin all the email addresses excluding the gmail addresses

         */

        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String eachEmail : emails){
                if(!eachEmail.endsWith("gmail.com")){
                    System.out.print(eachEmail+" ");
                }
            }

        /*
         for(String EachEmail : emails) {  // 10

           if(EachEmail.endsWith("@gmail.com")){
               continue;
           }

           System.out.println(EachEmail);
        */





    }
}
