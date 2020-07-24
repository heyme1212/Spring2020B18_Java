package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {

      /*
    write a program that can return the duplicated values from an ArrayList of String
        Ex:
            list: {"A", "B", "A", "C", "D"};
            output: ["A"]
            list: {"A", "B", "B", "C", "D", "D"};
            output: ["B", "D"]
         */
        String [] letter = {"A", "B", "B", "C", "D", "D"};

        ArrayList<String> list = new ArrayList<String>( Arrays.asList(letter) );
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> nonDup = new ArrayList<>();

        for(String each:list){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }

        int count=0;
        for(int i=0; i<nonDup.size(); i++){
            count=0;
            for(int j=0; j<list.size(); j++){
                if(nonDup.get(i)==list.get(j)){
                    count++;
                }
            }
            if(count>1){
                output.add(nonDup.get(i));
            }
        }

        System.out.println(output);
    }


}
