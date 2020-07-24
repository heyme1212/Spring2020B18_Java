package day13_StringClass;

public class StringManipulations3 {
    public static void main(String[] args) {
        //indexOf()--identifies the index number of spesific character, gives only the first matching character's index.


        String str="I like Java Programming John";

        int num1=str.indexOf("J");
        System.out.println(num1);

        //if there is more than 1 from a character for example we have 2"J" here:
        int num2=str.indexOf("John");
        System.out.println(num2);

        String str2= "Cybertek school is awesome";
        int firstS=str2.indexOf("s");
        System.out.println(firstS); //9

        //int secondS=str2.indexOf("is"); //return the index nuber of "i"
        int secondS=str2.indexOf("is")+1;  //it gives the index number of "s"
        System.out.println(secondS);

        int maxIndexNumber= "Cybertek".length()-1; //8-1
        System.out.println(maxIndexNumber);


       //negative number from index number means that character is not exist in the string that you are looking for.
        //It is not contained in the string.
        String names= "Muhtar";
        int a1= names.indexOf("Good Guy");
        System.out.println(a1);


        String fullname= "Kuzzat Altay";
        String firstName= fullname.substring(0, fullname.indexOf(" "));
        System.out.println(firstName);

        String lastName=fullname.substring( fullname.indexOf(" ")+1);
        System.out.println(lastName);












    }
}
