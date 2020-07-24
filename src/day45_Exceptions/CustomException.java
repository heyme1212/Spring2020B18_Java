package day45_Exceptions;

class BreakTimeException extends RuntimeException{ //custom unchecked exceptions

    public BreakTimeException(){
        super("It is break time, we should go out");
    }

    public BreakTimeException(String str){
        super(str);
    }
}


public class CustomException {
    public static void main(String[] args) {

        boolean breakTime= true;
        if(breakTime){
            throw new BreakTimeException("lets have a break");
        }else{
            System.out.println("Continue the class");
        }

        //throw new RuntimeException("It is break time, we should go out");


    }

}
