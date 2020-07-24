package OfficeHours.Practice_06_03_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseElements {
    /*
3) Create a method that will accept an int array and reverse the order of elements. Return the reversed array.
4) Overload the method to accept an ArrayList of integers and reverse the order of the elements. Return the reversed ArrayList

     */
    public static void main(String[] args) {
        int [] a={1,2,3};
        System.out.println(Arrays.toString(reverse(a)));

    }


    public static int [] reverse(int [] arr ){
        int [] revArr=new int [arr.length];
        int k = 0;
        for(int i = arr.length-1; i >= 0; i--){
            revArr[k] = arr[i];
            k++;
        }
        return revArr;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer>list){

        ArrayList<Integer>rev= new ArrayList<>();
        for(int i=list.size()-1; i>=0; i--){
            rev.add(list.get(i));
        }
        return rev;
    }



    /*
    for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;

        }

        return arr;
    }
     */



}

/*
public static int [] reverse(int [] arr){
    int [] reverced=new int [arr.length];
    int k=0;
    for (int i=arr.length-1; i>=0;i--){
        reverced[k]=arr[i];
        k++;
    }
    return reverced;
}
public static ArrayList<Integer> reverse(ArrayList<Integer> list) {
    ArrayList<Integer> reversed = new ArrayList<>();
    for (int i = list.size() - 1; i >= 0; i--) {
        reversed.add(list.get(i));
    }
    return reversed;
}
 */
