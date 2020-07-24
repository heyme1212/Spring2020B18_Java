package day50_Polymorphism;

import com.sun.webkit.dom.RangeImpl;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy",5,"Female");
        System.out.println(obj1.dogName);
        obj1.bark();

        Animal obj2=new Dog("Kito",6, "male");
        //obj2.bark();
        //System.out.println(obj2.dogName);
        //Reference type decides what is accessible.
        //Since dog class has these only, we cant call it from Animal class.
         obj2.eat();
         obj2.methodA(); //you cant override static method. Reference class answer geldi boylece.
        //Still cant get the sub class even if it is overloaded. Only overriden olmalidir


        Animal animal1= new Cat("bobo","Female",3);

        boolean isCat= animal1 instanceof Cat;
        System.out.println(isCat);  //True

        System.out.println("----------------------------");

        Dog d1= new Dog("D",1,"male");
        //boolean isCat= d1 instanceof Cat;    compile error
        //System.out.println(isCat);
        // there is no "IS-A" relation between dog and cat so, compile error instanceOf

        System.out.println("----------------------------");

        Animal a1= new Cat("Q","female",4);  //I couldnt make object of Animal because animal is abstract class
        boolean r2= a1 instanceof Animal;
        System.out.println(r2);    // true, because animal is animal. Super class ise problem yok.

        Cat a2= new Cat("Q","female",4);  //I couldn't make object of Animal because animal is abstract class
        //boolean r3= a2 instanceof Dog;      compile error
        //System.out.println(r3);    // true, because animal is animal. Super class ise problem yok.

    }
}
