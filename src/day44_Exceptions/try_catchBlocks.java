package day44_Exceptions;

import java.util.ArrayList;
import java.util.Arrays;

public class try_catchBlocks {
    public static void main(String[] args) {

        System.out.println("test started");

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
       // System.out.println(list.get(10));


        try{
            System.out.println(list.get(10));

        }catch(Exception a){   //(IndexOutOfBoundsException e)'de olur.

            System.out.println("something went wrong");
        }

        System.out.println("test completed");

        try{
            System.out.println(list.get(7));

        }catch(Exception b){   //(IndexOutOfBoundsException e)'de olur.

            System.out.println("something went wrong3");
        }

    }



}
