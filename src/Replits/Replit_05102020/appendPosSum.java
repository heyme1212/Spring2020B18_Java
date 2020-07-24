package Replits.Replit_05102020;

import java.util.ArrayList;
import java.util.Arrays;

public class appendPosSum {
    public static void main(String[] args) {
        /*
        Create a static method that:

        is called appendPosSum
        returns an ArrayList of Integers
        takes one parameter: an ArrayList of Integers

        This method should:
        Create a new ArrayList of Integers
        Add only the positive Integers to the new ArrayList
        Sum the positive Integers in the new ArrayList and add the Sum as the last element
         */

        ArrayList<Integer>list1=new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));
        ArrayList<Integer>list2=new ArrayList<>();

        for(int i=0; i<list1.size(); i++){
            if(list1.get(i)>0){
                list2.add(list1.get(i));
            }
        }
        int sum=0;
        for(int i=0; i<list2.size();i++){
            sum+=list2.get(i);
        }

        list2.add(sum);

        System.out.println(list2);



    }
}


