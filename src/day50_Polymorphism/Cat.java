package day50_Polymorphism;

public final class Cat extends Animal {
//we give final to the class, because we dont want cat special methods inherit was inherited
    public String catName; // 3 variables total it has
                           // 3 methods total

    public Cat(String catName, String gender, int age){
        this.catName=catName;
        this.gender=gender;
        this.age=age;
    }

    public void scratch() {
        System.out.println(catName+" is scratching");
    }

    @Override
    public void eat() {
        System.out.println(catName+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(catName+" is sleeping");
    }



}
