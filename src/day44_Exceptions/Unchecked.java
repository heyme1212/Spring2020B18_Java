package day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {

        System.out.println("test started");

        //System.out.println(9/0);   ArithmeticException: / by zero
        //Bu exception oldugu surece bu kodddan sonraki hicbirsey calismaz. Runtime error, unchecked exception.

        String str="Cyertek";

       // System.out.println(str.charAt(-1)); StringIndexOutOfBoundsException

        int [] arr={1,2,3};
        //System.out.println(arr[200]);     ArrayIndexOutOfBoundsException:

        System.out.println("test completed");
         //Runtime exceptions are part of unchecked exceptions.
        //Runtime exception is the parent of all the unchecked exceptions.



    }
}
