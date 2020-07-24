package day48_Abstract_Interface;

public interface Interface03 {
    public void method1();
    public abstract void method2();

    static final int num=100; //public by default
    int num2=200; //not an instance method, public static final by default

    public static void main(String[] args) {
        //method1(); since this is an abstract method, we cant call it in the main method. we cant do anything with it.
        Interface03.method3();

        System.out.println(num2);
        System.out.println(num);

    }

    static void method3(){

    }



}
