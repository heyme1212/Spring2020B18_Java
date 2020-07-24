package day22_ArraysLoopsPractice;

public class CountEvenOdd {
    public static void main(String[] args) {
        /*
        4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop

         */

        int[] arr= {1,2,3,4,5,6,7,8,9,10,11};

        int countEven=0;
        int countOddd=0;

        for(int eachnum:arr){
            if(eachnum%2 !=0){
                countOddd++;
            }else{
                countEven++;
            }

        }
        System.out.println(countOddd);
        System.out.println(countEven);

    }
}
