package day38_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    public static void main(String[] args) {

        Pizza pizza1=new Pizza("Large",5,5);
        Pizza pizza2=new Pizza("Medium",3,5);
        Pizza pizza3=new Pizza("Small",2,1);
        Pizza pizza4=new Pizza("Large",4,4);
        Pizza pizza5=new Pizza("Small",3,2);

        ArrayList<Pizza> orders=new ArrayList<>(Arrays.asList(pizza1,pizza2,pizza3,pizza4,pizza5));
        for(Pizza each:orders){
            System.out.println(each.calcCost());
        }

    }
}
