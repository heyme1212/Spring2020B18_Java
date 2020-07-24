package day47_Abstraction;
class Test1{
    public Test1(){}
    public void method1(){}
    public static void method2(){}
    //public abstract void method3();
    //In the regular class,you can't have abstract method.
    //this is the only class that you cant have.

    //instance block, constructor,static block, instance method, static method,
    //you can have all of them.
    int a=100;
    static int b=200;

    //instance block
    {

    }

    //static block
    static{

    }
}

abstract  class Test2{
    public Test2(){}  //can have constructor, as long as you have a class you have constructor.
    //Compile gives one as a default. But You cant use the constructor  to create an object.
    //Constructor cant be inherited in subclass, but can be called by super() keyword in the sub class.

    public void method(){ } //can have instance method
    public static void method2() {}; //can have static method
    public abstract void method3(); //can have Abstract method
    int a=100; //instance variable
    static int b=200;  //static variable
    // can have instance block and static block
    {
       // Test2 obj= new Test2(); cant create object.
    }

    static{
    }

//The only thing is abstract class can't create object and can't be final.

}

public class AbstractVSNonAbstract {

}
