package Replits.Replit_05102020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class MakeLast {
    /*
 Given an int array, print a new array with double the length where its last element is the same as
 the original array, and all the other elements are 0. The original array will be length 1 or more.
 Note: by default, a new int array contains all 0's.

Example:
input: 4 5 6
output: [0, 0, 0, 0, 0, 6]

Example:
input: 0
output: [0, 0]

Example:
input: 1 2 3 4
output: [0, 0, 0, 0, 0, 0, 0, 4]
     */

    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        int [] arr=new int [nums.length*2];

        arr[arr.length-1]=nums[nums.length-1];

        System.out.println(Arrays.toString(arr));




    }








}
