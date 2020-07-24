package day13_StringClass;

public class StringManipulations {
    public static void main(String[] args) {
        String str="Cybertek";
          //        01234567     //index number of the variable

        //charAt(indexNumber): it returns the char at the given index.

        char ch1= str.charAt(5); //it returns to char at the given index number.
        System.out.println(ch1); // 't'

        System.out.println((ch1=='A')); //this is false
        System.out.println((ch1=='T')); //this is false, case sensitive

        //lenght()

        int totalLenght= str.length(); //number of characters
        System.out.println(totalLenght);  //8

        System.out.println(totalLenght>250);//false

        String str2= "Today is great day, Java is Fun";
        int maxIndexNum= str2.length()-1;
        System.out.println(maxIndexNum); //30

        //concat();
        String s1= "Cybertek";
        s1=s1.concat(" School");
        System.out.println(s1); //Cybertek School

        String s2="Java";
        System.out.println(s2.concat(" is a programming language"));  //Java is a programming language
        System.out.println(s2); //Java

        s2=s2.concat(" is a programing language");
        System.out.println(s2); //Java is a programing language

        //assign etmedigim icin line 34 sadece Java verir aa 36 da assign ettik ve hepsini veriyor

        String r1="Java is fun";
        r1.concat(" , and it's easy");
        System.out.println(r1);
        r1= r1.concat(" , and it's easy");
        System.out.println(r1);

        //toLowerCase();

        String name1="CYBERTEK";
        name1.toLowerCase();
        System.out.println(name1);  //CYBERTEK, it doenst affect.Because string is immutable.

        name1=name1.toLowerCase(); //now you need to reassign it and now it returns to lower case.
        System.out.println(name1);

        //toUpperCase();
        String name2= "cybertek school";
        name2.toUpperCase();
        System.out.println(name2); //cybertek school

        name2=name2.toUpperCase();
        System.out.println(name2); //CYBERTEK SCHOOL after reassiging it works.

        //trim();
        //removing the unused white spaces and return new String

        String A1= "               Today is a great day";
        System.out.println(A1);
        A1.trim();
        A1= A1.trim();
        System.out.println(A1); //  spaces which are not seperating words are removed now.
































    }


}
