package Replits.Replit_04132020;
import java.util.Scanner;
public class Array8 {
    /*
    Given the array words, it will print the word with the largest length.
    Assume that there are no 2 words with longest length
        Example:
        words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
        prints jaaaaavvaaaaaaaaaa
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }

        String largest=words[0];
        int maxlength=words[0].length();

        for(int i=0; i<words.length; i++){

            if(words[i].length()>maxlength){
                maxlength=words[i].length();
                largest=words[i];
            }
        }

        System.out.println(largest);






    }



}

