package day33_CustomClass;

import java.util.ArrayList;

public class Extraction {
    public static void main(String[] args) {
        /*
4. write a program that can extract the sepecial characters, digits and letters from a string and stores them into seperate ArrayLists of Character:
ex:
str = "ABCD123$%#@&456EFG!";

output:
list1: {$, %, #, @, &, !}
list2: {A, B, C, D, E, F, G}
list3: {1, 2, 3, 4, 5, 6}
         */

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character>letters=new ArrayList<>();
        ArrayList<Character>digits=new ArrayList<>();
        ArrayList<Character>specialChar =new ArrayList<>();

        char [] arr= str.toCharArray();

        for(char each:arr){
            if(Character.isLetter(each)){
                letters.add(each);
            }else if(Character.isDigit(each)){
                digits.add(each);
            }else{
                specialChar.add(each);
            }
        }

        System.out.println(letters);
        System.out.println(digits);
        System.out.println(specialChar);













    }
}
