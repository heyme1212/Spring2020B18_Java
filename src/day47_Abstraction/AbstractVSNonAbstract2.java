package day47_Abstraction;

abstract class A{
        public abstract void method1();
        abstract void method3();
        public void method2(){};
    }

public class AbstractVSNonAbstract2 extends A { //Mandatory to override the abstract method, there is no abstract method in regular class.
    //no abstract method.
    //in order to be able to create object, sub class should be regular class.
    @Override
    public void method1(){
    }

    @Override
    void method3() {

    }

    //2 methods
}


abstract class B extends A{ //optional to override to abstract Method of A
//one abstract and one instance method

    @Override
    void method3() {

    }
}


class C extends B{
    @Override
    public void method1() {
    }
}

class D extends B{
    @Override
    public void method1() {

    }
}
