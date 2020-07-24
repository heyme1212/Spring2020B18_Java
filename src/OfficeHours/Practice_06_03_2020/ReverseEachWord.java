package OfficeHours.Practice_06_03_2020;

public class ReverseEachWord {
/*
6) Create a method that will accept a String of multiple words separated
by a space and return the String with which part reversed.
 */

    public static void main(String[] args) {
        String a= reverseWord("The house is big");
        System.out.println(a);
    }

    public static String reverseWord(String str){
        String [] words= str.split(" ");

        String finalW="";

        for(String each:words){
            String rev="";
            for(int i=each.length()-1; i>=0; i--){
                rev+=each.charAt(i);
            }
            finalW+=rev+" ";
        }
        return finalW;
    }


}
