package day24_Methods;
import Resources.Library;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        String str="Hilal";
        String RevStr= Library.Reverse(str);
        System.out.println(RevStr);

        int [] arr={5,9,10,3,2,-1};
        Library.sortDesending(arr);
        System.out.println(Arrays.toString(arr));







    }
}