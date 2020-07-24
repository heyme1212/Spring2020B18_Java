package day02_Variables;

public class variables {

    public static void main(String[] args){
          byte l = 4;
          byte w = 2;
          byte area= 8;
          System.out.println(l);
          System.out.println(w);
          System.out.println(area);

          // byte num=2.5 byte, short, int, long they only accept whole numbers.

        int n1 = 2000;
        // int n2 = 10000000000000; out of range
        System.out.println(n1);

       // long n3 = 9999999999;   //out of range. Compiler by default takes it as int.
        long n4 = 9999999999999l; //forcefully telling compiler that this is long data number. either l ot L
        System.out.println(n4);

        float f1 = 4.5f;

        float    zv   =  100.987_6543f;

        short  bt  =  (byte) zv ;

        byte  c24   = (byte) bt;
        System.out.println(10/3%2);








    }


}
