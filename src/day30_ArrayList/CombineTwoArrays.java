package day30_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        /*
write a program that can combine two String arrays into one arrayList
    ex:
      arr1 = {"A", "B", "C"};
      arr2 = {"D", "E", "F", "G"};
      list ==> {"A", "B", "C", "D", "E", "F", "G"}
         */

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list= new ArrayList<>();

        for(int i=0; i<arr1.length; i++){
            String eachElement= arr1[i];
            list.add(eachElement);

            }
        /*
       for(String each: arr2){
            list.add(each);
        }

        System.out.println(list);
         */

        for(int j=0; j<arr2.length; j++){
            String each=arr2[j];
            list.add(each);
        }

        System.out.println(list);






    }




    }


