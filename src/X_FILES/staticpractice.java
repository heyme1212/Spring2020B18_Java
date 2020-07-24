package X_FILES;

public class staticpractice {
    static long num1;
    long num2;



    public static void main(String[] args) {
        System.out.println(num1);
        System.out.println(staticpractice.num1);



         
        staticpractice.method1();
       // staticpractice.method2();
        staticpractice obj= new staticpractice();
        obj.method2();
        obj.method1();



    }

    public static void method1(){
        System.out.println("A");
    }

    public void method2(){
        System.out.println("B");
    }



}
