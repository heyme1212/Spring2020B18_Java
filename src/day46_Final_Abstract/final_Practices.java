package day46_Final_Abstract;

public class final_Practices {
    final int a=10;
    final static int b=20;

    {
        System.out.println(a);
      //  a=20;//final cant be reassigned,compile error

    }

    static{
        System.out.println(b);
     //   b=30;//final cant be reassigned, compile error
    }

    //constructor, access modifier+class name, no return type or specifier
    /*
    public final final_Practices(){
        //constructor cant be with final.
    }
*/

    //you can use final with instance method, final can be placed before public or after public. as long as they are given before return type.
    //cant write public or final after void.
    public final void method1(){

    }

    //can use final with static method.
    public final static void method2(){
    }

    //blocks and constructor cant be final.
    //variables, methods and
    //methods which are final, cant never be overriden.

    public final int method1(int a){
        return 12;
        //overloading is fine with FINAL..
    }

    public final_Practices(){
        //constructor cant be with final.
    }

}

  class test extends final_Practices{
     //while overriding, access modifier needs to be same or more visible
    //return type exactly same parameter same.
    // parameter must be same.
    // protected void method1(){ }//final method cunku.
        /*
    @Override
    protected void method1(){ }
     */

  }


final class test2 extends final_Practices{


}
