package day20_Arrays_Continue;

public class Max_Min {
    public static void main(String[] args) {
        /*
        Warmup tasks:
    2. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
    3. write a program that can find the minimum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS

         */

        int[] arr={2,3,4,5,6,7,8,9};

        int lastIndex= arr.length-1; //7

        //MAX NUMBER;
        int max= arr[0];
        for(int i=0; i<=lastIndex; i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);

        System.out.println("+++++++++");

        //MIN NUMBER:
        int min=arr[0];
        for (int i=0; i<=lastIndex-1; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);













    }

}
