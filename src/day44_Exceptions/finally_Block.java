package day44_Exceptions;

public class finally_Block {
    public static void main(String[] args) {

        try{
            System.out.println(9/0);
            System.out.println("Try block");

        }catch(Exception e){
            System.out.println("catch block");

        }finally{     //finally block got executed even if exception is not handled. catch block'da, item not found exception bile yazsak finally got executed
                      //you cant execute finally block without try-catch block, the respected order is "try->catch->finally"
            System.out.println("Finally");
        }



    }
}
