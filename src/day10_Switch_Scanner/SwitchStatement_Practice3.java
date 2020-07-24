package day10_Switch_Scanner;

public class SwitchStatement_Practice3 {
    public static void main(String[] args) {
        /*

  Create a new switch statement using char instead of int.
 Create a new char variable
 Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found and then break
Add a default which displays a message saying not found.

         */

        char ch ='C';
        String result = ""; //ABCDInvalid

        switch(ch){
            case 'A':
                System.out.println("A");
                //  result += "A";

            case 'B':
                System.out.println("B");
                //   result += "B";


            case 'C':
                System.out.println("C");
                //  result += "C";

            case 'D':
                System.out.println("D");
                //  result += "D";

            default:
                System.out.println("Invalid");
                //  result += "Invalid";
        }

        // System.out.println(result);





    }

}
