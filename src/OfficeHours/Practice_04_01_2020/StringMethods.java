package OfficeHours.Practice_04_01_2020;

public class StringMethods {
    public static void main(String[] args) {
        // charAt(indexNumber):returns the char at then given index, char primitive

        //             12345
        String str1 = "Java ";
        //index:   01234

        char ch1= str1.charAt(3);
        System.out.println(ch1); //a

        //char ch2=str1.charAt(4); // out of range ( even -1,-7 more than 3 is out of range)

        //length(); returns the total number of chars, int and cant be decimal

        String s2="Cybertek School";
        int len= s2.length();
        System.out.println(len);

        int maxIndex= s2.length()-1;

        char ch3 = s2.charAt( maxIndex );
        System.out.println(ch3);

        //concat(str): concatination, returns new String
        String str3 = "Cybertek";
        str3 = str3.concat(" School"); // "Cybertek School"

        System.out.println(str3);

        String str4 = "Java";
        str4 =    str4.concat(" is fun");  // "Java is fun"

        System.out.println(str4);


        //toLowerCase & toUpperCase: change the case of the string

        String str5 = "CYBERTEK SCHOOL";
        str5 =    str5.toLowerCase(); // "cybertek school"

        System.out.println(str5);

        String str6 = "muhtar";
        str6 =  str6.toUpperCase();//  "MUHTAR";

        System.out.println(str6);

        //trim();removes unused spaces from the string
        // trim(): removes unused(white) spaces from the string, returns new String
        String str7 = "        Cybertek          ";
        str7  =    str7.trim();// "Cybertek";

        System.out.println(str7);
        System.out.println(str7.length());

        String str8 = "       ";
        str8 = str8.trim(); // ""

        System.out.println( str8.length() ); //0
        //substring();

        //substring(beginningindex, ending index):  creates substring strating from beginning index till ending index (ending index is excluded)
        String sentence1 = "I like Java";
        //          012345678910
        //last index number = length-1

        String word1 =  sentence1.substring(7, sentence1.length() ); // "Java"
        String word2 = sentence1.substring(2, 6);

        // "likeJava"
        String word3 = sentence1.substring(2, 6)+ sentence1.substring(7, sentence1.length() );

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        //substring(begiining index): creates the sub string from beginning index till the end of the string. returns new string
        String sentence2 = "I like to learn Java";
        //                  0123456789

        String r1 =  sentence2.substring(10);  // "learn Java";
        System.out.println(r1);

        String r2 = "Java"; //JaVa;
        //       0123
        String r3 = r2.substring(0, 2);   //Ja

        String r4 = r2.substring(2,3) ;  // v
        r4 = r4.toUpperCase(); //V

        String r5 = r2.substring(3); //a

        String result = r3+r4+r5; // JaVa

        System.out.println(result);


        System.out.println("=============================================");

        //replace(old str, new str): replaces all the matching ones, returns new string
        String str = "I like C#, C# is cool";
        str =   str.replace("C#" , "Java" ); // "I like Java, Java is cool"

        System.out.println(str);

        //replaceFirst(old str, new str): replace the firast matching one, returns new string
        String t1 = "Java is fun, Java is good";
        t1 = t1.replaceFirst(", Java", ", C#");
        System.out.println(t1);

        System.out.println("=============================================");
        // indexOf(str): returns the index of first matching character, as an int
        String y1 = "Today W is Wednesday";
        int a1 =  y1.indexOf("W");  // first W' index num
        int a2 = y1.indexOf("Wednesday");  // second W' index num
        System.out.println(a1);
        System.out.println(a2);

        //lastIndexOf(str): returns the index of last matching character, as an int
        String y2 = "Cybertek School, School";
        int a3 = y2.lastIndexOf("S"); // last S' index number
        System.out.println(a3);


    }
}
