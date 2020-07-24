package day29_Wrapper_ArrayList;

import java.util.ArrayList;

public class List_intro {
    //ArrayList<DatType> listname=new arrayList<DataType>();
    public static void main(String[] args) {
        ArrayList<Integer> scores=new ArrayList<>();

        //int [] arr=new int[3];

        scores.add(10); //autoboxing size 1
        scores.add(20);//autoboxing size 2
        scores.add(30);//size 3
        System.out.println(scores);

        //get(indexnum): returns the object as it is. it is Integer.
        Integer a1= scores.get(2); //none
        int a2=scores.get(2);  //unboxing
        double a3=scores.get(2); //unboxing

        System.out.println(a3);












    }





}
