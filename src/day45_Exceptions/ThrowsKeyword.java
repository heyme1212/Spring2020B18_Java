package day45_Exceptions;

public class ThrowsKeyword {
    public static void sleep(){
        try{
            Thread.sleep(3000);
        }catch(Exception e){

        }
    }

    public static void sleep2() throws InterruptedException {
        Thread.sleep(3000);
    }

    public static void main(String[] args) throws Exception {
        sleep();
        sleep2();
    }

    /*
    public static void main(String[] args) throws Exception {
        System.out.println("Cybertek");
        sleep();
        sleep2();
        System.out.println("java");
    }
*/
    public static void method1() throws Exception {
        //Main method'u method 1 de cagirdik ve hala compile error vermeye devam ediyor, throws methodu kullanildigi icin.
        // throws Exception yazildi.
        String [] arr={"A"};
        main(arr);
    }

    public static void method2(){
        try{
            method1();
        }catch(Exception e){ }

    }

    //try-catch oldugu icin hicbirsey yapmaya gerek kalmadi.
    //method2'da throws olsaydi method3 de compile error verecekti.
    public static void method3(){
        method2();
    }






}
