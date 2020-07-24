package X_FILES;

import Replits.Replit_04132020.Array;
import com.sun.scenario.animation.shared.ClipEnvelope;

import java.util.Arrays;
import java.util.Scanner;

public class replitrev2 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();

        String result = "";

        for(int i=0; i<s.length(); i++){
            if(i%2==0){
                result+=s.substring(i,i+1).toLowerCase();
            }else{
                result+=s.substring(i,i+1).toUpperCase();
            }
        }

        System.out.println(result);






    }
}
