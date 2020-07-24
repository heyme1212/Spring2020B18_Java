package day34_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ObjectMemory {
    int i=1000;
    //this is instance variable since it is declared outside of the method, this is instance variable not a local variable.
    //That's why, it is created in heap memory.


    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(10,20,30,40));
        //object of this array list(new ArrayList) is created in the heap. //1 object is creaed
        //variable name(list1) is created in stack memory.

        ArrayList<Integer>list2=list1;
        //list2 is referencing to new ArrayList, list1 da referencing to new Array List.
        //They are referencing the same object.If we remove anything from it, two of them will be affected.
        //list1 and list2 are sharing the same object.
        //how many times "new" keyword is created, only 1 object is created.

        list1.remove(2);
        System.out.println(list1); //(10,20,40)

        System.out.println(list2);

        System.out.println("==========================================");

        String str1=new String("cybertek");
        //1 object is created in heap memory. There is 1 new keyword.
        //Unmutable oldugu icin deniyoruz.
        String str2=str1;

        str1= str1.toUpperCase();

        System.out.println(str1); //CYBERTEK
        System.out.println(str2); //cybertek

        //now 2 objects are created in java heap memory.

        int a=300; //local variable is in stack memory
        //main method is in the stack.

        //Object is created with new keyword unless it is a unmutable such as string.
        //Class is a template so it is in the heap memory.












    }

}
