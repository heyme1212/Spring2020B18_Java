package day21_MultiDimensionalArrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String name="Java";// 'J','a','v','a'
        char[] chars=name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[3]);

        String str="I like Java";

        String [] arr=str.split(" ");

        System.out.println(Arrays.toString(arr));

        /*
        reverse sentence: day great a is today
         */

        String sentence="Today is a great day";

        String [] words= sentence.split(" ");

        System.out.println(Arrays.toString(words));
        String result="";

        for(int i=words.length-1; i>=0; i--){
            String eachWords= words[i];
            //System.out.print(eachWords+" ");
            result+=eachWords+" ";
        }

        System.out.println(result);

        // I want to remove the letters one by one from here.
        String str2="ABCD";

        String [] arr2=str2.split("");
        System.out.println(Arrays.toString(arr2));

        char[] ch2= str2.toCharArray();
        System.out.println(Arrays.toString(ch2));
















    }
}
