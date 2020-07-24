package day46_Final_Abstract;

public class final_methods {
    //instance method with final, cant be overridden.
    public final void method1(){

    }

    //we overloaded method1 here, with different parameter. Return type doesnt matter, we give int return type here.
    //Final allowed us to overload.
    public final int method1(int a){
        return 100;
    }

    public final static void main(String[] args) {

    }

    //We cant apply final to constuctor
    //public final final_method(){ }



}
