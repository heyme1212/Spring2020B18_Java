package OfficeHours.Practice_04_08_2020;

public class ForLoops_Practice {
    public static void main(String[] args) {
        /*
          Execution order:
          1. initialization
          2. condition
           if true;
            statement in the body
            then iterator

            if false;
              stops the loop
         */

        for(int i=0; i<=5; i+=2){
            System.out.println("Hello World "+i);
        }

        System.out.println("+++++++++++++++++++++++");

                  // 1-2-3-4-5
        for(int i=1; i<=5; i++){
            System.out.print(i+" ");  //it will execute loop body and then it executes the iterator
        }

        System.out.println("+++++++++++++++++++++++");
        for(int i=1; i<=5; ){
            i++;
            System.out.print(i+" ");  //2 3 4 5 6, once iterate ediyor sonra print ediliyor.
        }

        System.out.println("+++++++++++++++++++++++");
        for(int i=1; i<=5; ){
            System.out.print(i+" ");  //1 2 3 4 5
            i++;
        }

























    }
}
