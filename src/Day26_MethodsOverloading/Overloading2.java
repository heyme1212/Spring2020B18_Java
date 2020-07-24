package Day26_MethodsOverloading;

public class Overloading2 {
    /*
    1.method:print sum of 2 int numbers
    2.method:print sum of 3 int numbers
    3.method: print sum of 4 int numbers
     */

    public static void main(String[] args) {
        sum(10,5);
        sum(10,5,5);
        sum(10,5,15,30);
        sum(10.0, 25.0);

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void sum(int a, int b, int c, int d){
        System.out.println(a+b+c+d);
    }

    public static void sum(double a,double b){
        System.out.println(a+b);
    }

    /*
     BENEFITS OF OVERLOADING METHODS:
     1. Readable
     2. Reusable
     3. Easy to remember
     4. Easy to run the correct one (system will choose which matches better to be used)
     */





















}
