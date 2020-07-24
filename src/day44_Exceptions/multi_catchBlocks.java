package day44_Exceptions;

import java.util.NoSuchElementException;

public class multi_catchBlocks {
    public static void main(String[] args) {

        try{
            System.out.println(100/0);   //arithmetic exception

        }catch(ClassCastException e){
            System.out.println("class cast exception"); //bu cant handle the exception.

        }catch(NoSuchElementException e){
            System.out.println("there is no such element"); //bu da cant handle the exception.

        }catch(IndexOutOfBoundsException e){
            System.out.println("Index out of bond"); //bu da cant handle the exception.

        }catch(ArithmeticException e){
            System.out.println("Arithmetic");  //bu handle eder. After this, still we can give as much as catch statement that we want
                                                                       //but no need.

        }catch(RuntimeException e){
            System.out.println("Run time");

        }catch(Exception e){
            System.out.println("exception");
        }

    //Only 1 one of the statement is executed, since Runtime is parent of arithmetic, parent exception should come after the child exception.
    //Output is arithmetic, Java compiles top to bottom.


      //  System.out.println(100/0);

    }

}
