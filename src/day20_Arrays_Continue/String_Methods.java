package day20_Arrays_Continue;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String name="HilalCatpinar";
        char [] character= name.toCharArray();
        System.out.println(Arrays.toString(character));

        // Check two strings are made up from the same characters.
        String str1="Cybertek School";
        String str2="School Cybertek";

        char[] ch1= str1.toCharArray();
        char[] ch2= str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        //[C, y, b, e, r, t, e, k,  , S, c, h, o, o, l]
        System.out.println(Arrays.toString(ch2));
        //[S, c, h, o, o, l,  , C, y, b, e, r, t, e, k]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equalstr= Arrays.equals(ch1,ch2);
        System.out.println(equalstr); //true













    }
}
