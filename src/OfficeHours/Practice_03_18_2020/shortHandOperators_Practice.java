package OfficeHours.Practice_03_18_2020;

public class shortHandOperators_Practice {
    public static void main(String[] args) {
        // +=: addition assignment

        int a =100;
        // a= a+200;
        a +=200;  //a=300
        System.out.println(a);

        a += 200*3;  //a=900(you need to calculate right side first then add to a)
        System.out.println(a);

        // -=: subtraction assignment
        // a= a-400;
        a-=400; // a=500
        System.out.println(a);

        int b= 300;
        b-=3*40; //180;  //b-=120;
        System.out.println(b);

        // *=: multiplication assignment
        int x= 5;
        x*=3; // x= x*3; // 15
        System.out.println(x);

        x*=2+1; //X*=3; //x=45;
        System.out.println(x);

        // /=: division assignment
        int n= 900;
        n/=3; //n= n /3;   //n=300
        System.out.println(n);

        n/= 3*5; //n/15;    //n=20
        System.out.println(n);

        // %=: remainder assignment

        int m =10;
        m %=3;  //result=1
        System.out.println(m);

        int y=300;
        y%= 3*5;  //y %=15;  //result=0
        System.out.println(y);

        int t=400;
        t%=10*2;   //result=0
        System.out.println(t);









    }
}
