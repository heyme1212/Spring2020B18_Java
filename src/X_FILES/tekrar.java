package X_FILES;

import java.util.Scanner;

public class tekrar {
    /*
        1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
         */

    public static void main(String[] args) {
        String str = "AABCC";
        int count = 0;
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            count=0;
            for (int j = 0; j <= str.length() - 1; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                result += str.charAt(i);


            }

        }

        System.out.println(result);


    }
}









