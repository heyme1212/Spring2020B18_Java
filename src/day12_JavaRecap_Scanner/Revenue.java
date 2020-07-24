package day12_JavaRecap_Scanner;
import java.util.Scanner;
public class Revenue {
    /*
     4. Revenue can be calculated as the selling price of the product times the quantity sold,
    i.e. revenue = price × quantity.
    Write a program that asks the user to enter product price and quantity and then calculate the revenue.
    If the revenue is more than 5000 a discount is 10% offered. Program should display the discount and net revenue.

     */

    public static void main(String[] args) {
            Scanner scan= new Scanner(System.in);

            System.out.println("Enter product price");
            double price= scan.nextDouble();
            System.out.println("Enter product quantity:");
            int quantity= scan.nextInt();
            double revenue= price*quantity;
            System.out.println("Your revenue is: "+ revenue);

            if(revenue>=5000){
                System.out.println("You are eligible for the discount");
            }

            System.out.println("Enter the % discount:");
            Byte percentageOfDiscount= scan.nextByte();

            double netRevenue= revenue*percentageOfDiscount;
            System.out.println("Your net revenue is: "+netRevenue);


    }


}
