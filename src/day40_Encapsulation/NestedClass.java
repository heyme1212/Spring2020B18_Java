package day40_Encapsulation;

public class NestedClass {

    //Outer class cant be static.
    //if it is inner class, it can be static. Only nested inner class can be static.
    //Advantage of static is, it can be called through it's name and it becomes the member of the outer class.

    static class data{
        static int a = 100;
        static int b = 300;

    }

    public static void main(String[] args) {

        System.out.println( NestedClass.data.a );

    }


}
