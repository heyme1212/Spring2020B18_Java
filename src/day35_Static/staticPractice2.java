package day35_Static;

public class staticPractice2 {
    String brand;
    String Model;
    boolean hasWheels=true;
    static boolean hasWheel=true;
    //because every car has wheel static yapariz.
    //Fakat, bir suru model ve brand oldugu icin bir suru kopyaya ihtiyac var. instance method yapariz.
    //static wants to be called by static way.

    public void printBrand() {
        System.out.println(brand);
    }

    public void printModel() {
        System.out.println(Model);

    }
    /*
    public static void main(String[] args) {
        System.out.println(hasWheels);
    }
    instance variable kullaniyorsak static method a yazamam
    Compile error verdi burada.
    Static methodun icinde static variable yazabiliriz sadece.
*/

    public static void main(String[] args) {
        System.out.println(hasWheel);
    }

    //suan oldu mesela. static bir variable verdim ve static methoda yazabildim.

}
