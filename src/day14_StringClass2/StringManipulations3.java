package day14_StringClass2;

public class StringManipulations3 {
    public static void main(String[] args) {
        //equalsIgnoreCase(str); //it will not cares the case sensitivity.

        String str1= "CYBERTEK";
        String str2="cybertek";

        System.out.println(str1.equals(str2)); //false

        System.out.println(str1.equalsIgnoreCase(str2)); //true, because ignore the case sensitivity

        //consistsof(); true\false
        String s1="Cybertek School";
        boolean r1=s1.contains("School"); //true
        // Parantezin ici case sensitive
        //School yerine school yazsak yanlis olur.

        System.out.println(r1);

        //startswith();
        String s3 = "United States";
        System.out.println( s3.startsWith("U") );  // true

        //endswith();
        String s4="Cybertek School";
        System.out.println(s4.endsWith("l")); //true
        System.out.println(s4.endsWith("School")); //true
        System.out.println(s4.endsWith("Cybertek")); //false












    }

}
