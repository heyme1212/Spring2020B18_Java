package day35_Static;

public class Dog {
    static String breed;
    static boolean isPet;

    public static void main(String[] args) {
    Dog dog1= new Dog();
    dog1.breed="Husky";
    dog1.isPet=true;

    Dog dog2= new Dog();
    dog2.breed="Poddle";


        System.out.println(dog1.breed); //static degilse husky
        System.out.println(dog2.breed); //static degilse poddle
        //static olunca breed=Poodle oluyor dog1 and dog2 icin.

        System.out.println(dog1.isPet);
        System.out.println(dog2.isPet);

        //static oldugu icin dog2.iyi assign etmedik bile ama true cikti
        //Cunku it is static.










    }
}