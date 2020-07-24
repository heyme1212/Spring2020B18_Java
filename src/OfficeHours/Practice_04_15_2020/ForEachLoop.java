package OfficeHours.Practice_04_15_2020;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class ForEachLoop {
    public static void main(String[] args) {

        int arr []={1,2,3,4};

        for(int eachElement : arr){
            if(eachElement==3){
                break;
            }
            System.out.print(eachElement);
        }

        System.out.println("++++++++++++++");

        int [] arr2={1,2,3,4,5,6,7,8,9,10};

        for(int each: arr2){
            if(each%2==0){
                continue;
            }else{
                System.out.print(each+" ");
            }
        }

















    }


}
