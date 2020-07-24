package day33_CustomClass;

public class Cat {
    String breed;
    String color;
    int age;
    String name;

public void sleep(){
    System.out.println(name+" is sleeping");
}
//catFood is parameter for our method
public void eat(String catFood){
    System.out.println(name+" is eating "+catFood);
}

public void drink(String catDrink){
    System.out.println(name+" is drinking "+catDrink);
}

public void setCatInfo(String catBreed, String catColor, int catAge, String catName){
        breed=catBreed;
        color=catColor;
        age=catAge;
        name=catName;
}

public String toString(){
    return name+", breed is "+breed+" color is "+color+", "+age+" years old";
}


}

/*
A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
 */
