package day05_unary_shorthandoperators;

public class postprepractice {
    public static void main(String[] args ){
        int a = 50;
        a= --a + a++ + a-- + a++;  //  once 49 oldu direk. sonra ayni kaldi 49, sonra 50 oldu current value sonra 1 eksildi a-- ile 49 oldu. Post oldu 49 oldu.
        //   49 + 49 +  50  +  49
        System.out.println(a); //197
        System.out.println(++a);//198
        System.out.println(a++);//198
        System.out.println(a);//199



        int x =4;
        int y = x*4 - x++;
        //       16 - 4 = 12
        System.out.println(y);

        int b =1; //current value of b will be 0 after -b--. Current value 1 oldu sonra.  Sonra 0 oldu.
        b = -b-- + b++ / -b-- * --b;  //negative post decrement=> in the
        //   -1  +   0 / -1 * -1;
        // -1
        System.out.println(b);

        









    }


}
