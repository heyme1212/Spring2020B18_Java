package day20_Arrays_Continue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String [] days={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number");
        int num=input.nextInt();

        int attempt=1;

        while (num > 7 || num <= 0) {
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num=input.nextInt();
            attempt++;

            if(attempt==3 && (num > 7 || num <= 0)){
                System.out.println("Invalid Entry and you are done!");
                System.exit(0);
            }
        }

        String result=days[num-1];
        System.out.println(result);



    }
}
