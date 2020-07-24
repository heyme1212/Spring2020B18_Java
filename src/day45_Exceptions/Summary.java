package day45_Exceptions;

import javax.crypto.spec.PSource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class Summary {
    public static void main(String[] args) {
        //Thread.sleep(300);
        //throw new IOException(); //Checked exception, happned in compile time

        try {
            throw new IOException();
        } catch (Exception e) {

        }
        System.out.println("Hello");

        System.out.println("========================");

        try {
            throw new ArrayIndexOutOfBoundsException(); //unchecked exception;
        } catch (ArrayIndexOutOfBoundsException e) {

        }

        System.out.println("Completed");

        System.out.println("========================");

        try {
            throw new ClassNotFoundException();
        } catch (ClassNotFoundException e) {

        }

        System.out.println("Completed");

        System.out.println("========================");

        try {
            throw new NullPointerException();
        } catch (ArithmeticException a) {
            System.out.println("arithmetic");
        } catch (ClassCastException a) {
            System.out.println("class cast");
        } catch (NullPointerException a) {
            System.out.println("Null Pointer");
        } catch (RuntimeException a) {
            System.out.println("Runtime");
        } catch (Exception a) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally Block");
        }

        System.out.println("==============================");

        //Exception i hadle edemedik ama hala finally block is got executed.
        try {
            throw new ArithmeticException();
        } catch (NoSuchElementException a) {
            System.out.println("No Such element");
        } finally {
            System.out.println("Finally Block 2");
        }
        System.out.println("================================");
    }


        public static void method1() throws Exception{
            throw new FileNotFoundException();
        }

        public static void method2(){
         //   method1(); throws ile handle ettigimiz icin tekrar methdod 2 de cagirdigimizda bir daha handle etmemiz lazim
            try{
                method1();
            }catch(Exception e){

            }
        }

        //method 3 de cagirdigimizda try-catch yaptigimiz method 2 is ok, we dont need to handle it again.
        //Ancak throws ile handle ettgimiz method1 i yeniden handle etmemiz lazim, caller will be responsible to handle hala. This is the disadvantage of throws.
        public static void method3(){
         // method1();
            method2();
        }












    }

