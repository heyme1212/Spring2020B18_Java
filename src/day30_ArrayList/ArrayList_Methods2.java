package day30_ArrayList;

import Replits.Replit_04132020.Array;

import java.util.ArrayList;

public class ArrayList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");


        //list.remove(1);

        String str="F"; //if str="Z" olsaydi Z olmadigi icin false olacakti.
        boolean r1= list.remove(str);//true
        boolean r2=list.remove("A");

        System.out.println(list);
        System.out.println(r1);

        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);  // 0
        list2.add(1);  // 1
        list2.add(2);  // 2
        list2.add(3);  // 2

        //{1,1,2,3}

        int num1 = list2.indexOf(1); //0
        // Integer = int  // AUtoboxing

        System.out.println(num1);

        int num2 =  list2.indexOf(100);
        System.out.println(num2);

        int num3 = list2.indexOf(3);  //3
        System.out.println(num3);









    }
}
