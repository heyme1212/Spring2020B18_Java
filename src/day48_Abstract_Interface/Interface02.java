package day48_Abstract_Interface;

public interface Interface02 {
    //Interface cant be final.
    //Final is not welcomed in abstract concept.

   // public Interface02(){} Since it is not a class, it can't have constructor

   // public void method1(){ } You cant have instance method.

    /*
    {
        //Since you dont have instance variable, you cant have instance block.
    }
*/

    int a1=100; //static variable works

    /*
    static{
              //cant have static block either.
    }
    */


    int a=100; //this is not an instance variable.

    //IMPORTANT!!-> By default the variable is static and final.

    public static void main(String[] args) {
        System.out.println(a); //compiled because it is static

       // a=200;  since it is final by default,can't reassign it.

        System.out.println(Interface02.a); //static final variable you can have it.
        Interface02.method4(); //static method you can have it in interface

    }

    public static void method4(){  //we can have static method in interface

    }

    public void method5();

    public default void method6(){
        System.out.println("default method");
    }
    //This is default method, only can be created in interface.
    //It only allows using lambda expression in interface.





}
