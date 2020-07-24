package day42_Inheritance;

class A{
    int a=100;
    public A(double b){
        System.out.println(this.a);
    }

}





public class SuperKeyword extends A {
    int a=200;
    public SuperKeyword(){
        super(10.4);
        System.out.println(super.a); //100

    }

    public static void main(String[] args) {
       // SuperKeyword obj=new SuperKeyword(); // 2 tane 100(100-100)
           A obj2= new A(5.5);   //100


    }

}
