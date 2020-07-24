package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {
        //substring(); creates sub value from a string
        //Ending index is excluded

        String str="Cybertek School is the best";
        String schoolName= str.substring(0,8); // index+1
        System.out.println(schoolName);

        String fullName= "Kuzzat Altay";
        String firstName= fullName.substring(0,6);
        String lastName=fullName.substring(7,12);
        System.out.println(firstName);
        System.out.println(lastName);

        //full name= firstname last name
        //gmail: lastname_firstname@gmail.com

        String Murtaza= "Murtaza Nazeeri";

        String firstname= Murtaza.substring(0,7);
        String lastname=Murtaza.substring(8,15);
        System.out.println(firstname);
        System.out.println(lastname);

        String gmail= lastname.concat("_").concat(firstname).concat("@gmail.com");

        String gmail2=(lastname+"_"+firstname+"@gmail.com");
        System.out.println(gmail);
        System.out.println(gmail2);

        String s1= " I love Java Programming Language";

        String className= s1.substring(8);
        System.out.println(className);

        //replace()

        String s2= "I like C# Programming";
        System.out.println(s2);
        s2.replace("C#","Java");
        s2=  s2.replace("C#","Java");
        System.out.println(s2);

        String s3= "I like C# Programming C#";
        s3=  s3.replace("C#","Java");
        System.out.println(s3);

        String name="COVID 18";
        name= name.replace("8","9");
        System.out.println(name);

        //replaceFirst() new value is replaced with only the first old value.

        String r1= "I like C#, C# is fun, C# is cool";
        r1= r1.replaceFirst("C#","Java");
        System.out.println(r1);

        String r2= "Tomorrow is Monday, Tomorrow is Tuesday";
        //in order not to replace both tomorrow's, only replace the first one we use replaceFirst().
        r2=r2.replaceFirst("Tomorrow","Today");
        System.out.println(r2);
































    }


}
