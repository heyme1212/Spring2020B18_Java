package day14_StringClass2;

public class StringManipulations2 {
    public static void main(String[] args) {

        //isempthy()==boolean expression/true or false

        String str= "";
        boolean bool1= str.isEmpty();
        System.out.println(bool1);   //true

        String str1= " ";
        boolean bool2= str1.isEmpty();
        System.out.println(bool2); //false


        String username="";
        if (username.isEmpty()) {

            System.out.println("Please provide the user name");
        }

        //equals==check if two strings visible texts are equal

        String s1="Cat";
        String s2=new String("Cat");
        System.out.println(s1==s2); //false

        System.out.println(s1.equals(s2)); //true

        String z1= "Tiger";
        String z2=new String("Tiger");
        String z3="Tiger";
        String z4="Lion";

        //z1 and z3 are same object in the pool. but z2 is in the heap, so it is different than the others.

        System.out.println(z1==z2); //false
        System.out.println(z2==z3); //false
        System.out.println(z1==z3); //true


        System.out.println(z1.equals(z2));  //true
        System.out.println(z2.equals(z3));  //true
        System.out.println(z1.equals(z3));  //true
        System.out.println(z1.equals("Replits")); //false
        System.out.println(z3.equals(z4));  //false





















    }
}
