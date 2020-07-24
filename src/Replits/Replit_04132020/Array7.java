package Replits.Replit_04132020;
import java.util.Scanner;
public class Array7 {
    /*
    Given an array nums with 7 integers every element is repeated twice - except one.
    Find that element and print it to console.
        Example:
        nums -> [1, 1, 2, 3, 4, 3, 4]
                 2
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        /*
        int count=0;
        for(int i=0; i<nums.length; i++){
            count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count<2){
                System.out.println(nums[i]);
            }


        }
*/
        int count=0;
        for(int eachElements:nums){
            count=0;
            for(int eachNumbers:nums){
                if(eachElements==eachNumbers){
                    count++;
                }
            }
            if(count<2){
                System.out.println(eachElements);
            }
        }


















    }
}
