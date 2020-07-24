package day31_BulkOperations;

import Replits.Replit_04132020.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,1,2,2,3,3));

        ArrayList<Integer> result=new ArrayList<>();

        for(Integer each:list){
            if(!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println(result);

        /*
        write a program that can remove all duplicates from an array of integer
         */

        Integer [] arr1={1,1,2,2,3,3};
        ArrayList<Integer>nonduplicates=new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            if(!nonduplicates.contains(arr1[i])){
                nonduplicates.add(arr1[i]);
            }
        }

        System.out.println(nonduplicates);








    }
}
