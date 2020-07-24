package Day26_MethodsOverloading;

public class Overloading4 {

    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(int[] args) {
        System.out.println("Int");
    }

//Main method can be overloadded but only original one is executed.
//Only valid main method will be executed not the others.
}


