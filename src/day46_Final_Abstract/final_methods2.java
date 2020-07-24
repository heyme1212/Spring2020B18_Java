package day46_Final_Abstract;

class Test{
    //private ile inheritance yapamayiz.
    //if method is final, it cant be overriden.
    public final void method1(){
        System.out.println("A");
    }
}

public class final_methods2 extends Test {
    /*
    @Override
    public void method1(){
        System.out.println("B");
    }

*/


}
