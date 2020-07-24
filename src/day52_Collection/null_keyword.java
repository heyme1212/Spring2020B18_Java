package day52_Collection;
import java.util.ArrayList;

public class null_keyword {
     // static String str; // ==null;
    static String str= new String("Cybertek"); //value of str is Cybertek now.

    static ArrayList<Integer>list1;

    public static void main(String[] args) {

       // System.out.println(str.charAt(0));
        //NullPointerException. You didn't instantiated this variable.
        //There is no string object.

        //ArrayList<Integer> list1= new ArrayList<>(); I created the object now. I dont get null pointer exception.

        //System.out.println(list1.get(0)); //NullPointerException. We didnt instantiate the list1 list at the top.
        //Default value is null because reference type is non primatives(ArrayList) and it doesnt refer any objects.

        //Web Eleement'a can't assign null;
        //String'e can assign null;
        //Integer can assign null;
        //Any reference type a you can assign null.
        //I cant assign to primitives, NULL is default of non-primitives

        //WebElement element= null;
        String str2= null;
        Integer i1=null;
        //int num=null;

        ArrayList<String> list1= new ArrayList<>();
        list1.add(null);
        System.out.println(list1);
        System.out.println(list1.size());
        //Hashset accepts null, treeset is doesn't accept null.
        //null doesnt mean object.

        System.out.println("==========================");

        String number= "123";
        int num1=Integer.parseInt(number);
        System.out.println(num1);

        System.out.println("===============================");
        String[] arr = {null, "Cybertek", "ABC"};
        arr[2].toUpperCase();

        String name1 = "cybertek".toUpperCase();
        name1 = null;                  //NullPointerException
        // name1 =  name1.toLowerCase();

        System.out.println(name1);

        System.out.println("==========================");
        /*

        String number= null; //This is not an object of String. Null doesn't refer any objects. I cant covert it to int.
        int num1=Integer.parseInt(number); //NumberFormatException
        System.out.println(num1);
*/

    }
}
