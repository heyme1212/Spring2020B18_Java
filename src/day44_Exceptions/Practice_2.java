package day44_Exceptions;

public class Practice_2 {

    public static void main(String[] args) {
        System.out.println("Hello");
        waitTime(5);
        System.out.println("Cybertek");

        /*
        System.out.println("Java");
        waitTime(3.5);
        System.out.println("Cybertek");

         */
    }

    public static void waitTime(double seconds){
        try{
            Thread.sleep((long)seconds*1000);
        }catch(Exception e){ }

    }



}
