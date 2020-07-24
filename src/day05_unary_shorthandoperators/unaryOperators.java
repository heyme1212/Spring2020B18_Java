package day05_unary_shorthandoperators;

public class unaryOperators {
    public static void main(String[] args){
        int a = 10; // by default it is positive. Answer is positive 10
        int b = +a; // positive 10

        System.out.println(a);
        System.out.println(b);

        int a2 = -10;
        boolean result1 = a2>0; //false
        boolean result2 = a2<0; //true

        System.out.println(result1);
        System.out.println(result2);

        int x1= -10;
        int y1 = -x1;
        System.out.println(y1);

        int x2 = +20;
        int y2 = -x2;
        System.out.println(y2);

        int x3 = +20;
        int y3 = +x3;
        System.out.println(x3);

        int z = 100;
        System.out.println(++z); //increase the value by 1 immediately. pre increment/decrement
        System.out.println(z);























    }

}
