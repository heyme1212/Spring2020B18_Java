package day44_Exceptions;

public class ExceptionPractice {
    public static void main(String[] args) {

        //You can put as many lines as you want to the try or catch block but it is not preferred to do so.
        //Put exception statement to the try block.

        try{
            System.out.println("Hello");
            System.out.println("Hola");
            System.out.println(9/0);
            System.out.println("Cybertek");
            System.out.println("Java");
        }catch(Exception e){
            System.out.println();
        }
    }
}
