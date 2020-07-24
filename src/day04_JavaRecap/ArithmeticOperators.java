package day04_JavaRecap;

public class ArithmeticOperators {

    public static void main(String[] args ){
        int a = 10/3;
        System.out.println(a);
        System.out.println(10/4); //the result is 2 because numbers are integer and integer has no decimal.
        double d = 10/4.0;
        System.out.println(d);

        System.out.println(10/4);
        System.out.println(10.0/4);
        System.out.println(10/4.0);
        System.out.println(10.0/4.0);

        float f1 = 10/4;
        System.out.println(f1);

        boolean evennumber = 25 % 2 == 0;
        System.out.println(evennumber);
        System.out.println(25 % 2);

        boolean oddnumber = 22 % 2 != 0;
        System.out.println(oddnumber);

        System.out.println("10 is even number: "+ (10 % 2 == 0));
        System.out.println("11 is even number: "+ (11 % 2 == 0));

        System.out.println("25 is odd number: "+ (25 % 2 != 0));

        System.out.println("25 is even number: "+ (25 % 2 == 0));
        System.out.println("25 is even number: "+ !(25 % 2 != 0));

    }

}
