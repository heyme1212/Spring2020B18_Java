package day22_ArraysLoopsPractice;

public class NestedLoop_Practice {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21} };

        /*
        print out all the even numbers in a same line
        Count the odd numbers and return the total odd numbers
         */

        for(int i=0; i<numbers.length; i++){
            for(int k=0; k<numbers[i].length; k++){
               //assign da edebiliriz like int num=numbers[i][k];
                if(numbers[i][k]%2 ==0){
                    System.out.print(numbers[i][k]+" ");
                }
            }
        }

        System.out.println();

        int count=0;
        for(int i=0; i<numbers.length; i++){
            for(int k=0; k<numbers[i].length; k++){
                if(numbers[i][k]%2 !=0){
                    count++;
                }
            }
        }

        System.out.println(count);








    }
}
