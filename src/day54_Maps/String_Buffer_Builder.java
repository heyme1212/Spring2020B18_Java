package day54_Maps;

public class String_Buffer_Builder {

    public static void main(String[] args) {
        String str1="cybertek";
               str1.concat("school");

        System.out.println(str1); //cybertek

        System.out.println("-----------------------");

        //mutable char sequences. Cant create object with string literal.
        //ONly with new key word.
        //Not snycronized.
        StringBuilder builder=new StringBuilder("cybertek");
         builder.append("School");

        System.out.println(builder);

        System.out.println("-----------------------");

        //mutable char sequences. Cant create object with string literal.
        //snycoronized. slow
        StringBuffer buffer=new StringBuffer("Cybertek");
        buffer.append("School");

        System.out.println(buffer);

        System.out.println("-------------------");
        String word="ABCD";

        StringBuilder sb= new StringBuilder("ABCD");
        sb.reverse();

        System.out.println(sb);

        word=sb.toString();
        System.out.println(word);

    }
}
