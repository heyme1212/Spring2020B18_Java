package day42_Inheritance;

class test{
    /*
    public test(){
        System.out.println("super class' default constructor");
    }
    */
    public test(){

        System.out.println("A");
    }
}


public class Constructor extends test {
/*
    public Constructor(){
        System.out.println("sub class default constructor");
    }
*/
    public Constructor(){

        System.out.println("B");
    }
    public static void main(String[] args) {
        //Constructor obj= new Constructor();  //super and sub both are written at the end, since parent constructor is default.

        test obj=new test(); //A
        Constructor obj1= new Constructor(); //A B

    }
}