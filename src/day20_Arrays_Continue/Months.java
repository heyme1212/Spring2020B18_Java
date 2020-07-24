package day20_Arrays_Continue;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {


        String[] months={"Jan", "Feb","Mar","April","May","June","July","Aug","Sep","Oct","Nov","Dec"};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        int attempt=1;

        while (num > 12 || num <= 0) {
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num=input.nextInt();
            attempt++;

            if(attempt==3 && (num > 12 || num <= 0)){
                System.out.println("Invalid Entry and you are done!");
                System.exit(0);
            }
        }

        String result=months[num-1];
        System.out.println(result);




         /*
        String result="";

        if(num==1){
            result+=months[num-1];
        }
        */





    }
}
