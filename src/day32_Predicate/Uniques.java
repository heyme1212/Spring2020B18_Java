package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        /*
        Write a program that can return the unique objects from arraylist of characters.
         */

        Character [] chars={'A','A','B','C','D','D',};

        ArrayList<Character>charList=new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character>result=new ArrayList<>();

        /*
        for(int i=0; i<charList.size(); i++){
            int count=Collections.frequency(charList,charList.get(i));

            if(count==1){
                result.add(charList.get(i));
            }
        }

        System.out.println(result);
*/

        for(Character each:charList){
            int count=Collections.frequency(charList,each);

            if(count==1){
                result.add(each);
            }
        }

        System.out.println(result);








    }
}
