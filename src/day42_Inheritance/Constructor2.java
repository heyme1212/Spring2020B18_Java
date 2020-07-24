package day42_Inheritance;

class Test{
    public Test(int a){
        this(2.5);
        System.out.println("A");
    }

    public Test(double a){
        System.out.println("C");
    }

}


public class Constructor2 extends Test {

    public Constructor2(){
       // this(10); we cant use this() here.
       // super(10)
        super(10);
        System.out.println("B");
       // super(10); cant constructor place here.
    }


    public static void main(String[] args) {
      //  Test obj= new Test(10);   // C A
        Constructor2 obj= new Constructor2(); //C B A


    }
}
