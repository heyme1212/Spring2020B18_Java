package Replits.Replit_04112020;

import java.util.Scanner;

public class Zombie {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int days=0;

        while(true){
            if(inhabitants==0){
                System.out.println("---- EXTINCT ----");
                break;
            }else{
                System.out.println("Day "+days+" ["+inhabitants+"]");
                inhabitants=inhabitants/2;
                days++;

            }
        }


        /*
        while(inhabitants>0){
             System.out.println("Day "+count+" ["+inhabitants+"]");
             inhabitants/=2;
             count++;
         }

         System.out.println("---- EXTINCT ----");
         */



    }
}
