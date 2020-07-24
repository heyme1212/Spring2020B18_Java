package Day26_MethodsOverloading;

public class MethodOverloading {
    public static void main(String[] args) {
        method(10);
        method(10,20);

    }

public static void method(int a){
    System.out.println("Original method");
}

public static void method(int a, int b){
    System.out.println("Overloaded Method");
}














}
