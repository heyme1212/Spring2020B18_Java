package Replits.Replit_05022020;

import java.util.ArrayList;
import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("one","two","three"));
        int pos1=0;
        int pos2=2;

        String s1 = list.get(pos1);
        System.out.println(s1);

        String s2 = list.get(pos2);
        System.out.println(s2);

        list.set(pos1, s2);
        list.set(pos2, s1);

        System.out.println(list);



    }
}