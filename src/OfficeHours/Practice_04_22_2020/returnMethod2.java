package OfficeHours.Practice_04_22_2020;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.util.Arrays;

public class returnMethod2 {
    //write a return method that can return 2nd.max number of array

    public static void main(String[] args) {
        int [] arr={100,40,500,50,30,100,-5,-100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int lastIndexNum=arr.length-1;
        int secondMaxNum=lastIndexNum-1;

        int secodlastIndexNum=arr[arr.length-2];
        System.out.println(secodlastIndexNum);

        int [] arr2={1,2,3,4,5,6,7,8};
        int num2= secondMax(arr2);
        System.out.println(num2);

    }

    public static int secondMax(int [] arr){
        Arrays.sort(arr);
        int lastIndexNum=arr.length-1;
        int secondlastIndexNum=lastIndexNum-1;

        int secodMaxNum=arr[arr.length-2];
        return secodMaxNum;
    }













}
