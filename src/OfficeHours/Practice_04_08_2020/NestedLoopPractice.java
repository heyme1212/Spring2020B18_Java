package OfficeHours.Practice_04_08_2020;

public class NestedLoopPractice {
    public static void main(String[] args) {

          /*
        nested loop: loop inside another loop
        there is inner loop and outer loop

        outer loop repeates the inner loop

         */

        int j=1;
        while(j<6){

            for(int i=10; i<=50; i+=10){
                System.out.print(i+" ");
            }
            System.out.println();//bosluk verir araya

            j++;
        }

        System.out.println("+++++++++++++++++++++++++++++");

        /*

         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *

         */

        //I am repeating 6 astracts first. I need to repeat this 8 times.

        for(int l=1; l<=8; l++){

            for(int k=0; k<=5; k++){
                System.out.print("* ");
            }
            System.out.println();

        }

        System.out.println("+++++++++++++++++++++++++++++++++");


        /*

        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *

         */

        for(int i=0; i<8; i++){
                                         // Dikkat!! k<i yaptik inner loop icinde.
            for(int k=0; k<i; k++){      //inner loop is responsible for the inside of the asteriks
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++");

        for(int i=8; i>0; i--){
            // Dikkat!! k<i yaptik inner loop icinde.
            for(int k=0; k<i; k++){      //inner loop is responsible for the inside of the asteriks
                System.out.print("* ");
            }

            System.out.println();
        }



















    }
}
