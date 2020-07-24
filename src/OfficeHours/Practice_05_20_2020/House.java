package OfficeHours.Practice_05_20_2020;

public class House {
    public static void main(String[] args) {
        //house has a dog
        Dog dog1= new Dog("Karabas",5,"black","Medium","Cocker");
       // dog1.setInfo("Karabas",5,"black","Medium","Cocker");

        Dog dog2=new Dog("Rindik", 5, "White", "Huge","Kangal");
        dog2.bark();

        System.out.println(dog1);
        System.out.println(dog2);

        Cat cat1=new Cat("Muffin",7,"white","medium","Ragdoll");
        //cat1.setInfo("Muffin",7,"white","medium","Ragdoll");
        System.out.println(cat1);
        cat1.scratch();

        Bunny bunny1= new Bunny("Firfir", 2, "White", "Small", "Angora");
        System.out.println(bunny1);








    }
}
