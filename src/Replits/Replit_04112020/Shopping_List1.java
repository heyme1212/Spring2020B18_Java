package Replits.Replit_04112020;

import java.util.Scanner;

public class Shopping_List1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        double totalPrice = 0;

        int count=1;
        do{
            System.out.println("Enter Item"+count+" and its price:");
            item=scan.next();
            price=scan.nextDouble();
            totalPrice+=price;
            shoppingListReport+=("Item"+count+": "+item+" Price: "+price+", ");

            System.out.println("Add one more item?");
            countinue=scan.next();

            if(count>10){
                break;
            }

            count++;
        } while(countinue.equalsIgnoreCase("yes"));

        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+totalPrice);

    }


}
