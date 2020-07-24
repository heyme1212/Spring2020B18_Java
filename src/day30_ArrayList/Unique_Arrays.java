package day30_ArrayList;

import java.util.ArrayList;

public class Unique_Arrays {
    /*
    3. write a program that can print out the unique elements from an int array
		   HINT: store all the unique elements of array into a list of integers
		   Ex: array==> {1,1,2,3,3,4,5}
		   	   output: {2,4,5}
     */

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);

        ArrayList<Integer>uniques=new ArrayList<>();
        //list.get(0);--->1
/*
        for(int i=0; i<list.size(); i++){
            int count=0;
            for(Integer each:list){
                if(each==list.get(i)){
                    count++;
                }
            }

            if(count==1){
                uniques.add(list.get(i));
            }

        }

        System.out.println(uniques);

*/
        for(Integer each2:list){
            int count=0;
            for(Integer each:list){
                if(each==each2){
                    count++;
                }
            }

            if(count==1){
                uniques.add(each2);
            }

        }

        System.out.println(uniques);




    }


}
