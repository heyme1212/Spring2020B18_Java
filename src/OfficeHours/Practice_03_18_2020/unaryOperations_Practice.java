package OfficeHours.Practice_03_18_2020;

public class unaryOperations_Practice {
    public static void main(String[] args) {

        int a = 20;
        System.out.println( a++); //first it is 20, //20
        System.out.println( a); //then it is 21,    //21

        int b = 30;
        int c = b--;              //current value of c is 30, b=29
        System.out.println(b);
        System.out.println(c);

        int d = 40;
        int e= d++;    //e=40, d becomes 41
        System.out.println(d);
        System.out.println(e);

        //pre increment/decrement: change the value immediately.

        int x=200;
        System.out.println(--x);  //x=199

        int z = 100; //current values of z => 101 => 100 => 99
        z= z++ + --z - z-- + ++z;
        //  100 + 100 - 100 + 100  //200
        System.out.println(z);

        int u= 900; //901=>902 => 902 => 903
        int r= -++u + ++u + -u++;
        //    -901  + 902 + -902
        System.out.println(u);
        System.out.println(r);



    }
}
