package day44_Exceptions;

public class ExceptionHandling {
    public static void main(String[] args) {

        String str="Cybertek";

        try{
            System.out.println(str.charAt(400));

        }catch(RuntimeException e){

           //String description= e.getMessage(); //returns the brief description of exception
            System.out.println(e.getMessage());
        }

        System.out.println("=======================================");

        try{
            System.out.println(100/0);
            System.out.println("Try block");

        }catch(ArithmeticException e){
            System.out.println("Catch Block");  //selenium da sadece unchecked exception olacak ve catch block execute olacak.
            String except= e.getMessage();
            System.out.println(except);
           // int e=100;
        // e is local variable of catch block, so only visible in the catch block. Ustte de var e o yuzden karismiyorlar.
        }

       // System.out.println(except); If we declare the variable in try catch block, bu bir local varialbe burada calismaz.
        //Ama try block'dan once String result="" diyip, result=e.getMessage(); dersek burada block disinda print yapabiliriz.

        System.out.println("Completed");


        /*
        testCase:
        step1
        step2
        step3
        step4
        ...

        step10
         */

    }
}
