package day49_Polymorphism;
/*
1. create an interface named Edible
			abstract method: eat();

	2. create an interface named Drinkable that can inherit from Edible
			abstract method: drink();

	3. create an class named Burger that can inherit from Edible
			variables: name, size
			method: toString();

			create a constructor that can initialize instance variables

	4. create another class called IceCoffee  that can inherit from Drinkable
				variable: size
				method: toString()
			create constructor that can set the size
 */

public interface Edible {
    void eat();

}

interface Drinkable extends Edible{
    void drink();
}

class Burger implements Edible{
    String name;
    String size;

    public Burger(String name, String size){
        this.name=name;
        this.size=size;

    }

    public String toString(){
        return "This burger's name is "+name+" and it's size is "+size;
    }

    @Override
    public void eat() {

    }
}

class IceCoffee implements Drinkable{
    String size;

    public IceCoffee(String size){
        this.size=size;
    }


    public String toString(){
        return "This IceCoffee's size is "+size;
    }

    @Override
    public void drink() {

    }

    @Override
    public void eat() {

    }
}
