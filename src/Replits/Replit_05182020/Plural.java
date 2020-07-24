package Replits.Replit_05182020;

import java.util.Scanner;

public class Plural {
    /*
In this project, you will be creating a program that takes a given non-negative integer and a given singular
noun as a String.  You will have to print out the number, followed by the string in its plural form
(unless the number is 1).

The given inputs are:
int amt;
String word;

For example, let's say your inputs are as follows:
# in: 4
word: apple
Your program should print out "4 apples"

# in: 0
word: apple
Your program should print out "0 apples"

# in: 1
word: apple
Your program should print out "1 apple" Be prepared to handle the following rules:

     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();

        if(amt==1){
            System.out.println(amt+" "+word);
        }else{
            if (word.endsWith("fe")) {
                System.out.println(amt+" "+word.substring(0, word.length() - 2) + "ves");
            } else if (word.endsWith("sh") || word.endsWith("ch")) {
                System.out.println(amt+" "+word + "es");
            } else if (word.endsWith("us")) {
                System.out.println(amt+" "+word.substring(0, word.length() - 2) + "i");
            } else if (word.endsWith("ay") || word.endsWith("ey") || word.endsWith("uy") || word.endsWith("oy")) {
                System.out.println(amt+" "+word + "s");
            } else if (word.endsWith("y")) {
                System.out.println(amt+" "+word.substring(0, word.length() - 2) + "ies");
            } else {
                System.out.println(amt+" "+word + "s");
            }
        }

    }
}

