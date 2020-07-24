package day50_Polymorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        // casting means converting one type to another. Changing type!!
        int a=100;
        double b=(double)a;
        //I can assign int to double, implicitly done casting
        //you can always assign smaller one to bigger one.
        //Done automatically aslinda, just showing it with paranthesis

        System.out.println("===================================");

        Dog dog = new Dog("a",1,"f");
        Animal animal1= (Animal) dog; //upcasting done implicitly. Automatically done by compiler.
        //Since they are gray, it means they are extra to write.

        System.out.println("----------------------------------");

        Cat cat= new Cat("F","female",1);
        //Dog dog1= cat;
        //is a relation is mandatory, I cant write it.
        Animal animal2= (Animal) cat;
       // Animal animal2=  cat; Actually, it is done automatically.

        System.out.println("===================================");

        double c=10;
        int d= (int)c;   //explicit casting,

        Animal animal3= new Dog("a",4, "male");
        Dog dog3= (Dog)animal3; //down casting, manually must be done.

        Animal animal4= new Cat("Mia","female",4);
        Cat cat2= (Cat)animal4;
        //Cat cat2= (Dog)animal4; no relation

        System.out.println("===================================");

        Animal animal5 = new Dog("Lucy", 3, "Female");
        //  animal5.bark();

        Dog dog2 =  (Dog)animal5;
        dog2.bark();

        // second way:
        ( (Dog)animal5 ).bark();

    }

}

