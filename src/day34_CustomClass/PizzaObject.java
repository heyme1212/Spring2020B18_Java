package day34_CustomClass;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza();

        pizza1.customizeOrder("large",5,2);

        System.out.println(pizza1.calcCost());

        System.out.println(pizza1);



    }


}
