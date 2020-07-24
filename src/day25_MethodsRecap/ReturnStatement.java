package day25_MethodsRecap;

public class ReturnStatement {
    public static void main(String[] args) {
        method1();
        System.out.println("Hello");


    }
//Can I use "return" in the void method? Yes,if you want to exit current method only!!
//if you want return a value, then you can't use it to return method.

    public static void method1(){
        if(10>9){
            return;
        }
        System.out.println("Hello Cybertek");//this line will not be executed because it comes after return method.
        //with return, void method is exited. Nothing happen after that.
}


}
