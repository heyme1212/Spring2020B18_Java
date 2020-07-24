package day29_Wrapper_ArrayList;

import Replits.Replit_04132020.Array;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class ValueOfMethods {
    public static void main(String[] args) {
        String str="123";

        Integer a= Integer.valueOf(str); //returns you wrapper class, Integer ,123;

        System.out.println(a);

        double b=Integer.valueOf(str); //unboxing
        System.out.println(b);

        String str2="15.5";  //15.5
        double d1= Double.parseDouble(str2);
        //primitive to primitive => not autobox or unboxing;

        double d2=Double.valueOf(str2); //15.5, return wrapper class object
        // double = Double // Unboxing

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1==d2); //true

        int z1=2000;
        //   Long L1 = z1; // does not accept any other primitives except for long

        Short sh1 = 3000;
        int z2 = sh1 ;

      /*
      "True"
      "FAlSe" ==> to boolean
      "1000000000.5" ==> to float
      "123456"  ==> to short
       */

        String r1="true";
        Boolean t1=Boolean.valueOf(r1);//Boolean, true;
                 // boolean=boolean none

        boolean t2=Boolean.valueOf(r1); //Boolean, true;
        //boolean=boolean //unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("++++++++++++++++");

        int maxNum=Integer.MAX_VALUE;
        System.out.println(maxNum);

        double maxNum2=Double.MAX_VALUE;
        System.out.println(maxNum2);

        int minNum=Integer.MIN_VALUE;
        System.out.println(minNum);

        byte maxNum3=Byte.MAX_VALUE;   //127
        System.out.println(maxNum3);

        byte minNum2=Byte.MIN_VALUE; // -128
        System.out.println(minNum2);

        System.out.println("++++++++++");
        boolean [] arr= new boolean[3];       //default value is false
        System.out.println(Arrays.toString(arr));

        Boolean [] arr2= new Boolean [3];    //default value is null
        System.out.println(Arrays.toString(arr2));


        char[] arr4 = new char[3];
        System.out.println(Arrays.toString(arr4) );

        Integer[] arr3 = new  Integer[3];
        System.out.println(Arrays.toString(arr3) );















    }
}
