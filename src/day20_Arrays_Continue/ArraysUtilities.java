package day20_Arrays_Continue;
import java.util.Arrays;
public class ArraysUtilities {
    public static void main(String[] args) {

        int[] arr={1,2,3};

        String r=Arrays.toString(arr); //convert array to a string, to print
         //Array must be converted to the string before printing
        System.out.println(r); //[1,2,3]
        //System.out.println(arr); //it gives hashcode [I@1b6d3586

        String names[] = {"Madina", "Fatih", "Osman"};
        System.out.println(Arrays.toString(names));

        double[] nums={10,20,30,40,50};

        System.out.println(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println(nums[0]+1);






    }

}
