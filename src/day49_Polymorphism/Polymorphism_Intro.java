package day49_Polymorphism;


//super class can not inherit anything from sub class but it can be a reference type of sub class objects.
//Animal class can be abstract class and interface, it is still polymorphism. There is "is a" relation.
//Robot is super class and Animal is sub class
class Animal extends Robot{

}

class Dog extends Animal {

}

//There is "is a" relation with Cat and Animal and there is Not an relation between Dog and Cat.
class Cat extends Animal {

}

class Robot{

}

public class Polymorphism_Intro {

    public static void main(String[] args) {

       // Animal obj= new Animal();  interface oldugu icin compile error verdi

        Animal obj2= new Dog();  //Polymorphism, inheritance is the pre condition. sub class should be non abstract
        Animal obj3= new Cat();

     //   Dog obj4= new Cat(); There is not an "is a" relation between cat and dog.So there is no Polymorphism.

        Dog obj5= new Dog();  //Polymorphism, inheritance is the pre condition. sub class should be non abstract
        Cat obj6= new Cat();

        Robot obj7= new Robot();

        //Array supports primitives and objects.
        //Array list supports only objects.

        //Animal is the parent of all these objects.
        Robot [] animalShow= { obj2, obj3, obj5, obj6, obj7 };

        Robot obj8= new Animal();
        Robot obj9= new Dog();
        Robot obj10= new Cat();




    }
}
