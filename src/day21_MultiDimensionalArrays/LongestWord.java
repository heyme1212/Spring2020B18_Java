package day21_MultiDimensionalArrays;

public class LongestWord {
    public static void main(String[] args) {
        /*
    2. write a program that can return the longest string of text from an array
    3. write a program that can return the shortest string of text from an array
         */
/*
        String [] words={"Reem","Omer","Muhtar","Emrah","Mohammed","Ana"};

        int maxLength=-100;
        String longestWord="";

                for(int i=0; i< words.length;i++){
                    if (words[i].length() > maxLength) {
                        maxLength=words[i].length();
                        longestWord=words[i];
                    }
        }

        System.out.println(maxLength);
        System.out.println(longestWord);

        int minLength=100;
        String shortestWord="";

        for(int i=0; i<words.length; i++){
            if(words[i].length()<minLength){
                minLength=words[i].length();
                shortestWord=words[i];
            }
        }

        System.out.println(minLength);
        System.out.println(shortestWord);

        */


        String[] names = {"Reem", "Omer", "Muhtar", "Emrah", "Mohammed", "Ana", "AAAAABBBBBBBBCCCCCC"};

        int maxLengthString = names[0].length(); //4
        int minLengthString = names[0].length();

        String longestword = names[0];
        String shortestWord = names[0] ;

        for(int i = 0; i < names.length ; i++  ){

            if(names[i].length() > maxLengthString ){
                maxLengthString = names[i].length();
                longestword = names[i];
            }

            if(names[i].length() < minLengthString){
                minLengthString = names[i].length();
                shortestWord = names[i];
            }

        }


        System.out.println(longestword);
        System.out.println(shortestWord);






    }
}
