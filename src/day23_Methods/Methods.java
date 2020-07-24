package day23_Methods;

import javax.swing.*;

public class Methods {
    public static void main(String[] args) {
       /*
       Step1.Hello Cybertek
       Step2: Hello World 5 times
       Step3: Hello Batch18
       Step4: Hello Word 5 times
       Step5: Hello Saim
       Step6: Hello Word 5 times
        */
       System.out.println("Hello Cybertek");
       PrintHello5();
       System.out.println("Hello Batch18");
       PrintHello5();
       System.out.println("Hello Saim");
       PrintHello5();

       evenNumbers1_100();
       oddNumbers1_100();

    }

        public static void PrintHello5 (){
            for(int i=0; i<5; i++){
                System.out.print("Hello World");
            }
            System.out.println();
    }



public static void evenNumbers1_100(){
        for(int i=1; i<=100; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    System.out.println();
    }

    public static void oddNumbers1_100(){
        for(int i=1; i<=100; i++){
            if(i%2 !=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }





}
