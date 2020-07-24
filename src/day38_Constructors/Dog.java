package day38_Constructors;

public class Dog {
    String name;
    int age;
    String breed;

    public Dog(){ //set the default value as unknown and 0;
        name="unknown";
        breed="unknown";
        age=0;
    }

    public Dog(String breed){
        this.breed=breed;
        name="unknown";
        age=0;
    }

    public Dog(String breed, int age){
        this.breed=breed;
        this.age=age;
        name="unknown";
    }


    public String toString() {
        return "name=" + name +
                ", breed=" + breed + ", age=" + age;
    }











}
