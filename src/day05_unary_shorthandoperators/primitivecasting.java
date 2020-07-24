package day05_unary_shorthandoperators;

public class primitivecasting {
    public static void main(String[] args){
       // implicit casting: done automatically.
        int a = 10;
        long b = a;  //implicit casting is done automatically.  // b=10L;

       // int c = b; compile error, b is still long data type.


        int a1 = 100;
        long b1 = (long)a1;  //manually doing the implicit casting.

        // int c1 =  b1;

     //Explicit casting: casting larger primitive to smaller primitives. Casting should be same or smaller than the data type.

        int Inum  = 100;
        byte Bnum = (byte)Inum;
        short Snum = (short)Inum;
        //short Snum = (byte)Inum; works as well.

        double Dnum= 5.5;
        float Fnum = (float) Dnum;
        //float Fnum = (int) Dnum; --> 5.0
        System.out.println(Fnum);

        double D1 = 10.5;
        long L1 = (long) D1; // int, short, byte olur.
        System.out.println(L1);

        float F1 = 60.5f;
        int I1 = (int)F1; //short, byte olabilir. Usually the preferred way is to cast the same thing.
        System.out.println(I1); // 60

        long largeNum = 999999999999L;
        int intNUm = (int) largeNum;
        System.out.println(intNUm);
        //it gives a different num because 99999999999 is out of int range.

        char ch1 = 'a';
        short sh1 = (short)ch1;
        System.out.println(sh1);

        char ch2= 23456;
        double dbl1 = ch2;
        System.out.println(dbl1);

        int z1 = 10;
        double t1b = z1;  //10.0
        short y1 = (short)z1;









    }



}
