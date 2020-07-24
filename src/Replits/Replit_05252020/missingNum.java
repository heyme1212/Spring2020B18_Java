package Replits.Replit_05252020;

import java.util.Arrays;

public class missingNum {
    public static int missingNumber(int[] arr) {
        Arrays.sort(arr);
        int j = 1;
        for (int each : arr) {
            if (j!=each) {
                return j;
            }
            j++;
        } return j;
    }
}
