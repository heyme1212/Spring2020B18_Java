package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        Item item1=new Item("Milk",3.45,1);
        Item item2=new Item("Cheese",4.95,2);
        Item item3=new Item("Egg",2.95,2);
        Item item4=new Item("Bread",2.99,2);
        Item item5=new Item("Butter",4.45,2);

        ArrayList<Item> shoplist=new ArrayList<>(Arrays.asList(item1,item2,item3,item4,item5));
        //shoplist.addAll(Arrays.asList(item1,item2,item3,item4,item5));
        double totalCost = 0;

        /*
         solution 1
        for(Item each  : shoppingList ){// each: item1, item2, item3, item4, item5
            totalCost += each.calcCost();
        }
         */

        for(int i = 0; i <  shoplist.size(); i++){
            totalCost  += shoplist.get(i).calcCost();
        }

        System.out.println("Total: "+totalCost);
    }
}
