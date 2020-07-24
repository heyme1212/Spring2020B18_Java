package day29_Wrapper_ArrayList;

public class ParseMethod {
    public static void main(String[] args) {

        //converts string of text to primitives
        String str="123";
        int a1=Integer.parseInt(str);
        System.out.println(str+1); //text  1231
        System.out.println(a1+1); //number  124

        byte b1= Byte.parseByte(str); //byte =123;
        System.out.println(b1+5);

        Integer I1=(int)Byte.parseByte(str); //converted int, can we assing int primitives to int wrapper class?
                //integer=(int)byte;
                //integer=int;
                //autoboxing,
        Integer I11=(int)(short)Byte.parseByte(str); //another way

        String str2="10.5";
        float f1= Float.parseFloat(str2);
        System.out.println(f1+1);

        double d1=Double.parseDouble(str2);
        System.out.println(d1+1);

        String str3="3147483647";
        long num1= Long.parseLong(str3);
        System.out.println(num1+2);

        String result1="FALse";//not case sensitive
        boolean r1=Boolean.parseBoolean(result1); //boolean, false
        System.out.println(!r1); //true;



        String result2="Today is Monday";
        String result3="9>7"; //this is not true or false also
        //these two are not a true/false statement. By default boolean is false'dur.
        boolean r2=Boolean.parseBoolean(result2);
        System.out.println(r2); //false;


        String result4="fALse";  //ignores case sensitivity
        boolean r4=Boolean.parseBoolean(result4);
        System.out.println(r4);

        //if text is not "true", it will be always false.

        //parse method return primitive data type.














    }
}
