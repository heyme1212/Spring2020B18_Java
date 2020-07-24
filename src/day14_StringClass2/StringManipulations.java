package day14_StringClass2;

public class StringManipulations {

    public static void main(String[] args) {

        //indexOf()---returns the first matching characters index number

        String str="I like to learn Java. I like to watch the movie Jumanji";

        int a1= str.indexOf("J"); //First J, 16
        System.out.println(a1);

        int a2=str.indexOf("Jum");
        System.out.println(a2);

        int a3=str.indexOf(" I")+1;
        System.out.println(a3);

        // lastindexOf()--return the last matching characters index number

        String s="I like Java, and I like reading";
        int b1= s.lastIndexOf("I");
        System.out.println(b1);
        int b2=s.indexOf("I");
        System.out.println(b2);

        int b3=s.lastIndexOf("l");
        System.out.println(b3);

        String z="I like C#, C# is cool";
        int c1= z.lastIndexOf("C");
        System.out.println(c1);

        //how to find the second "J" ondex number
        String x="I like Java, Java is fun, Java programming is fun";
        int c2= x.indexOf("Java is");
        int d2=x.indexOf(", J")+2;   //different way of finding the index num. It always gives me the first letter's index.
        System.out.println(d2);
        System.out.println(c2);

        int d3=x.lastIndexOf("J"); //last "J" index number
        System.out.println(d3);

        int d4=x.indexOf("Java p");   //last J index num again.
        System.out.println(d4);

        char ch1= x.charAt(26);
        System.out.println(ch1);









    }



}
