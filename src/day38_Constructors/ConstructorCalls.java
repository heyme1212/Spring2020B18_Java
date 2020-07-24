package day38_Constructors;

public class ConstructorCalls {
    //only constructor can call other constructor
    //
    public ConstructorCalls(){
        method1();
        method2();

    }

    public ConstructorCalls(int a){
        //ConstructorCall(); cant call it just only giving its name
        this();
    }

    public static void method1(){
       // method2(); static only call for static. method 2 is not static

    }

    public void method2(){
        method1();


    }


}

