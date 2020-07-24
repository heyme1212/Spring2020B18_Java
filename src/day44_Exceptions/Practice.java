package day44_Exceptions;

public class Practice {
    /*
 1. Write a method called "wait" that causes the current executing thread to sleep for the
 specific number of seconds parameters: double seconds
     */

    public static void main(String[] args) {
         /*
          print hello,
           wait two seconds
            print Cybertek
            wait three second
            Java
         */

        System.out.println("Hello");
        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }

        System.out.println("Cybertek");

        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }

        System.out.println("Java");

        try{
            Thread.sleep(2000);
        }catch(Exception e){

        }

        System.out.println("completed");



    }




}
