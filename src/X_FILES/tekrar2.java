package X_FILES;

import java.util.Arrays;

public class tekrar2 {
    public static void main(String[] args) {
        /*
                String sentence="Today is a great day";

         */

        String sentence="today is a great day";
        String [] arr=sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        String reversed="";

        for(int i=arr.length-1; i>=0; i--){
            reversed+=arr[i]+" ";
        }

        System.out.println(reversed);



    }
}
