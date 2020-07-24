package day48_Abstract_Interface;

interface A1{
  void method1();

}

interface B1{
    abstract int method2();
}

interface C1{
    public abstract void method3();
}

//we can have as much as interface that we want, don't need to be only 1
//Access modifier is always public for interface. We can change the return type also.
//Pure abstraction, I need to import all of the methods.


public class Abstraction02 implements A1, B1, C1 {

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 10;
    }

    @Override
    public void method3() {

    }
}
