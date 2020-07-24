package OfficeHours.Practice_04_08_2020;

public class DoWhileLoop {
    public static void main(String[] args) {
        /*
        //first statement then condition is checked and executed.

        do{
                statement;
          } while(condition);
          execution order:
          1.statement;
          2.condition;
                  if true; repeats the steps
                  if false; stops the loop.
         */

        boolean b=false;
        while(b){
            System.out.println("Hello World");
        }

        System.out.println("+++++++++++++++");
        //condition false bile olsa 1 kez print ediliyor sonuc. Cunku once yaziliyor sonra kontrol ediliyor.
        do{
            System.out.println("Hello Cybertek");
        }while(b);

        System.out.println("+++++++++++++++");

       int j=0;
        do{
          if(j %15 ==0) {
              System.out.print((j + " "));
          }
            j++;
        }while(j<=100);













    }
}
