package day48_Abstract_Interface;

interface P{
  void method1();
}

interface Q {
  int method2();
}

abstract class R{
  abstract void method3();
}

//implement is used inheriting to class from interface.
//extends and implement can be used together.Extends should come first,then use implement key word.
//class extends_implements2 and R has "is-A" relation and class and Q and P has also "is-A" relation.
//However, R and Q, P doesn't have any relation.
public class extends_implements2 extends R implements Q,P {

    public static void main(String[] args) {
        //R obj = new R(); cant create object, it's not concrete.
       // Q obj2 = new Q(); it is not concrete and interface is not class. Since it is not class, objects are come from classs
       // So we cant create the object of interface too. It doesn't have constructor too.

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }
}
