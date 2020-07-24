package day48_Abstract_Interface;

interface I1{
    void method1();  //1 abstract method
}

interface I2 extends I1{
    void method2(); // 2 abstract methods
}

abstract class AC implements I2 {
    abstract void method3();  //3 abstract methods
}


public abstract class extends_implements extends AC{   //3 abstract methods, optional
                                                       // override 1 one of them here
    @Override
    public void method2() {

    }

}

//2 abstract methods left, method 1 and 3. If you don't inherit them, you will get compile error.
//You don't need to inherit method 2.
class testRun extends extends_implements {
    @Override
    public void method1() {

    }

    @Override
    void method3() {

    }
}
