package X_FILES;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class tekrar3 {
    public static void main(String[] args) {
        /*
        4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop

         */

        int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
        int counteven=0;
        int countodd=0;

        for(int each: arr){
            if(each%2==0){
                counteven++;
            }else{
                countodd++;
            }
        }

        System.out.println(counteven);
        System.out.println(countodd);



    }
}
