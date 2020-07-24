package Replits.Replit_04192020;

import java.util.Arrays;

public class ZombieAttack2 {
    public static void main(String[] args) {


        int [] inhabitants={3, 6, 0, 4, 3, 2, 7, 1};
        int count=0;
        int sum=0;


        while(true) {
            System.out.println("Day "+count+" "+Arrays.toString(inhabitants));
            sum=0;
            for (int i = 0; i < inhabitants.length; i++) {
                sum += inhabitants[i];
            }

            if (sum == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] /= 2;
            }
            count++;


        }






        }
}
