package day06_Shorthand_LogicalOperators;

public class ShorthandOperators {
    public static void main(String[] args){
        int x = 20;
        x += 10;  //30
        System.out.println(x);

        x+= 60; //90
        System.out.println(x);

        String schoolname= "Cybertek";
        schoolname +=12345; //schoolname= schoolname+12345
        System.out.println(schoolname);

        System.out.println('a'+'b');  //97+98=195

        char ch1 = 'a';
        ch1 +='b';
        System.out.println(ch1); //answer is character. because ch1 is a character.

        int num = 'z';
        num+= 'x';
        System.out.println(num);  //242

        int A= 100;
        A-=90; //10
        System.out.println(A);

        int B = 200;
        B-=A;   //190
        System.out.println(B);

        int a=2;
        a*=3;  //6
        System.out.println(a);

        int b= a*=10;
        //b=60
        System.out.println(b);
        System.out.println(a); //a=60

        int a1=100;
        int b1= (a1*=2) + ++a1;
        b1=      200 + 201;
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2;  //x1= x1+20 //y=30
        System.out.println(y);

        int q=20;
        int p = q*=20*3;
                  //q*60
        int num1= 300;
        num1 /=2;   //num1=150
        System.out.println(num1);

        int num2= 400;
        num2 /= 20+10;  //400/30=13(int gets the whole number part of it.)

        int num3= 300;
        num3 %= 10+20;  // num3%=30 //num3=0
        System.out.println(num3);

        int n1= 400;
        n1 %= 3*5;   //n1=400%=15 =>> 10
        System.out.println(n1);


































    }


}
