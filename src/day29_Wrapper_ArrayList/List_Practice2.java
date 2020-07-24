package day29_Wrapper_ArrayList;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class List_Practice2 {
    public static void main(String[] args) {
           /*
        1. create a list of Integers
        2. add 5 Integers to it
        3. return the maximum number from the list
                Do not use any sorting
         */

        ArrayList<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(20);
        list.add(300);
        list.add(400);
        list.add(50);
        list.add(700);
        list.add(800);

        System.out.println(list.size());

        int maximum=Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>maximum){
                maximum=list.get(i);
            }
        }
        System.out.println(maximum);


        int maximum2=Integer.MIN_VALUE;
        for(Integer each:list){
            if(each>maximum2){
                maximum2=each;
            }
        }
        System.out.println(maximum2);

       ArrayList list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        //int max3=max(list2);







    }
}
