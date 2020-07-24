package day36_StaticBlock;

public class StaticBlock {
    //first thing is runned is statement in the static block.
    //it is always executed first
    //it executed only 1 time.
    //It can initialize any static block
    // execution sirasi=> 1. static blog executed
                        //2. static block executed 123
                        //3.Main method executed
                         //4.costom method executed

    public static void main(String[] args) {
        System.out.println("Main method executed");
        method1();

    }

    public static void method1(){
        System.out.println("Custom method executed");

    }

    static{
        System.out.println("static block executed");
    }

    static{
        System.out.println("static block executed 123");
    }



}
