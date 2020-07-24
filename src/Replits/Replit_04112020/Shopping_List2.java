package Replits.Replit_04112020;

import java.util.Scanner;

public class Shopping_List2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        double totalPrice = 0;

        int count=1;

        System.out.println("Enter Item"+count+" and its price:");
        item=scan.next();
        price=scan.nextDouble();
        totalPrice+=price;
        shoppingListReport+=("Item"+count+": "+item+" Price: "+price);

        do{
            System.out.println("Add one more item?");
            countinue=scan.next();

            if(countinue.equalsIgnoreCase("yes")){
                count++;
                System.out.println("Enter Item"+count+" and its price:");
                item=scan.next();
                price=scan.nextDouble();
                totalPrice+=price;
                shoppingListReport+=(", Item"+count+": "+item+" Price: "+price);


            }else if(countinue.equalsIgnoreCase("no")){
                System.out.println(shoppingListReport);
                System.out.println("Total price: "+totalPrice);
                break;
            }

        }while(count<=10);

    }
}
