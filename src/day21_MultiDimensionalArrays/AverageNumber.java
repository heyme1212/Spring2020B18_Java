package day21_MultiDimensionalArrays;

public class AverageNumber {
    public static void main(String[] args) {

        /*
        warmup tasks:
    1. write a program that can return the average number from an array of integers
            ex:
                [1,2,3]
                average: 2
                [10, 15, 5, 6]
                average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0]
                average: 10
         */

        int [] num1={1,2,3};
        int sum1=0;

        for(int i=0; i<num1.length; i++){
            sum1+=num1[i];
        }

        int average1=sum1/num1.length;
        System.out.println(average1);

        int[] num2={10, 15, 5, 6};
        int sum2=0;
        for(int i=0; i<num2.length; i++){
            sum2+=num2[i];
        }

        int average2=sum2/num2.length;
        System.out.println(average2);

        int [] num3={4, 5, 6, 7, 8, 10, 20, 30, 0};
        int sum3=0;

        for(int i=0; i<num3.length; i++){
            sum3+=num3[i];
        }

        int average3=sum3/num3.length;
        System.out.println(average3);

        System.out.println("=============");

        int [] arr={10,20,30,40,50};
        int length= arr.length;
        int sum=0;

        for(int i=0; i<length; i++){
            int eachNum=arr[i];
            sum+=eachNum;
        }

        System.out.println(sum);
        System.out.println(sum/length);









    }
}
