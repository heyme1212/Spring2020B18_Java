package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class WarmUp_3_4 {
    /*
    3. task:
            1. create an ArrayList of string called country names
            2. write a program that can remove all the country names that have length of 10 or greater
     */

    public static void main(String[] args) {

        ArrayList<String> countryNames=new ArrayList<>();
        countryNames.addAll(Arrays.asList("United States of America","Spain","United Kingdom"));

        countryNames.removeIf(p->p.length()>=10);
        System.out.println(countryNames);

        System.out.println("++++++++++++++++++++++++++++++++++++");
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
        String digit="";
        String letter="";
        String character="";

        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                digit+=str.charAt(i);
            }else if(Character.isAlphabetic(str.charAt(i))){
                letter+=str.charAt(i);
            }else if(!Character.isDigit(str.charAt(i)) &&!Character.isAlphabetic(str.charAt(i))){
                character+=str.charAt(i);
            }
        }

        ArrayList<String>Digit=new ArrayList<>();
        Digit.addAll(Arrays.asList(digit));

        ArrayList<String>Letter=new ArrayList<>();
        Letter.addAll(Arrays.asList(letter));

        ArrayList<String>SpecialChar=new ArrayList<>();
        SpecialChar.addAll(Arrays.asList(character));



            }
        }


















