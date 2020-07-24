package day50_Polymorphism;

public final class Dog extends Animal {
    String dogName;

    public Dog(String dogName,int age, String gender){
        this.dogName=dogName;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public void eat() {
        System.out.println(dogName+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(dogName+" is sleeping");
    }

    public void bark(){
        System.out.println(dogName+" is barking");
    }

    public static void methodA(int a){ // overloaded methodA from Animal class. However, animal class's method is called.
        System.out.println("dog class A");
    }

}
