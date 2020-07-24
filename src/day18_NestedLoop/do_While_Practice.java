package day18_NestedLoop;

public class do_While_Practice {
    public static void main(String[] args) {
        /*
        print all the even numbers between 0-100in the same line seperated by a space.
        do use do while loop only

         */
        int num=0;
        do{
            if(num%2 ==0){
                System.out.print(num+" ");
            }
            num++;
        }while(num<=100);



    }



}
