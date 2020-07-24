package day05_unary_shorthandoperators;

public class PostPreJava {
    public static void main(String[] args){

        // pre: changes the value of the varaible immediately

        int a = 100;
        System.out.println( ++ a ); //101
        System.out.println(a);  //101

        int b = 100;
        System.out.println( --b ); //99
        System.out.println(b);  //99

        // Post: first passes the current value, then eventually changes the variable' value
        int A = 100;
        System.out.println(A++); // at line 18, A' values is still 100
        System.out.println(A); //101

        int B = 100;
        System.out.println(B--); // 100
        System.out.println(B); //99


        // post & pre examples:

        int z = 10;
        int x = ++ z; //at line 28, x is increased by 1
        System.out.println(x);
        System.out.println(z); //11

        int s = 10;
        int f = s++; //after line 34, the value of s will be increased by 1.
        System.out.println(f); //10
        System.out.println(s); //11

        double t1= 3.5;
        double t2 = t1--;
        System.out.println(t2); //3.5
        System.out.println(t1); //2.5

        int num = 35;
        System.out.println(num++); //35, after line 44, the value of num will be 36.
        System.out.println(num--); //36 after line 45  the value of the num will be 35.




    }


}
