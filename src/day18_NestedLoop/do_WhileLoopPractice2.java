package day18_NestedLoop;

public class do_WhileLoopPractice2 {
    public static void main(String[] args) {
       //skip the odd number


        int t=1;

        do{
            if(t%2 !=0){
                t++;
                continue;

            }

            System.out.print(t+" ");

            t++;
        }while(t<=100);

    }
}
