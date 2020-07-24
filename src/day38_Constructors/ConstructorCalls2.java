package day38_Constructors;

public class ConstructorCalls2 {

    public ConstructorCalls2(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls2(int a){
        this();
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls2(String str){
       this(10);
        System.out.println("Constructor with String argument");

    }

    public static void main(String[] args) {
        ConstructorCalls2 obj= new ConstructorCalls2("Hello");

    }

    public void method1(){
       // ConstructorCalls2(); gives error, shouldnt be called in the method.
        //only in another constructor. with this() keyword.
    }

    {

    }




}
