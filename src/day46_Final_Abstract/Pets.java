package day46_Final_Abstract;

public abstract class Pets {
     /*
    Task01:
		1. create an abstract class called Pets
				attributes: name, age, color, breed, gender
				methods:
					abstract methods: sleep, eat, speak
					instance method: toString
		2. create three sub classes (non-abstract) of pet:
								1. Dog
								2. Cat
								3. Tiger
				each class MUST have constructors to initialize the attributes
     */

    String name;
    int age;
    String color;
    String breed;
    char gender;

    public abstract void sleep();
    public abstract void eat();
    public abstract void speak();

    public String toString(){
        return "Name is: "+name+", Age is: "+age+", Color is: "+color+", Breed is: "+breed+", Gender is: "+gender;
    }
}

class Dog extends Pets{

    public Dog(String name,int age,String color,String breed,char gender ){
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }

    @Override
    public void sleep() {
        System.out.println(name+" is sleeping");
    }
    public void eat(){
        System.out.println(name+" is eating");
    }

    public void speak(){
        System.out.println(name+" is not speaking, is barking");
    }
}

class Cat extends Pets {

    public Cat(String name, int age, String color, String breed, char gender) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.breed = breed;
        this.gender = gender;
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void speak() {
        System.out.println(name + " is not speaking, is meowing");
    }
}


class Tiger extends Pets{
    public Tiger(String name,int age,String color,String breed,char gender){
        this.name=name;
        this.age=age;
        this.color=color;
        this.breed=breed;
        this.gender=gender;
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void speak(){
        System.out.println(name+" is not speaking, is roaring");
    }
}









