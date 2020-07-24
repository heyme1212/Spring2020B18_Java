package Resources;

import day40_Encapsulation.Encapsulation;  //I need to import the package first

public class Encapsulation_Test {
    public static void main(String[] args) {
        //Encapsulation_Test obj2= new Encapsulation_Test();
        //obj2.SSN;  since this SSN variable from another package, we cant call this variable from this package object.

        Encapsulation obj=new Encapsulation();

        System.out.println(obj.getSSN());

        obj.setSSN(123);

        System.out.println(obj.getSSN());

    }
}
