package day42_Inheritance.Task01;

public class Person {
      /*
    task01:
		create a class called Person
				attributes:  name, age, gender
				methods: eat, walk, sleep, setPersonInfo
     */

    String name;
    int age;
    char gender;

    public void eat(String food){
        System.out.println(name+" is eating"+ food);
    }

    public void walk(){
        System.out.println(name+" is walking");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }

    public void setPersonInfo(String name, int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

}
