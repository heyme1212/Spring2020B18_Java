package OfficeHours.Practice_04_01_2020;

public class literal_new {
    public static void main(String[] args) {
        String s1="Java"; //String literal
        String s2="Java"; //String literal
        String s3= new String("Java");
        String s4= new String("Java");

        //for String literal => variable name different but they have same object. Only 1 object was created

        //different objects in different locations.
        //Every time you use new keyword, an independent object is created.
        //They are different. s3 != s4

        System.out.println( s1 == s2 );  // true, same objects

        System.out.println(s1 == s3 ); // false, different objects at different memory

        System.out.println(s4 == s3);// false, different objects

        //String is immutable, it wont be changed.

        //String is sequence of characters

    }
}
