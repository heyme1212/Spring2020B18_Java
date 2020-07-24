package day34_CustomClass;
/*
    1. create a custom class for pizza that should contain the following:
    instance variables:
            size (either small, medium, large)
            number of cheese topping
            number of pepperoni toppings
    instance method:
            customizeOrder(): allows user to set the size and toppings of the pizza
            calcCost(): returns the total cost as double
            toString(): a String return method that's containing the pizza' size, quantity of each topping, and
            the pizza cost as calculated by calcCost()

    Pizza cost is determined by:
            Small: $10 + $1.5 per pepperoni topping + 1 per cheese topping
            Medium: $12 + $1.5 per pepperoni topping + 1 per cheese topping
            Large: $14 + $1.5 per pepperoni topping + 1 per cheese topping
     */



public class Pizza {
    String size;
    int numCheeseTopping;
    int numPepperoniTopping;

    public void customizeOrder(String pizzaSize, int pizzaNumCheese, int pizzaNumPepporoni) {
        size = pizzaSize;
        numCheeseTopping = pizzaNumCheese;
        numPepperoniTopping = pizzaNumPepporoni;
    }

    public double calcCost() {

        if (size.equals("small")) {
            return 10 + 1 * numCheeseTopping + 1.5 * numPepperoniTopping;
        } else if (size.equals("medium")) {
            return 12 + 1 * numCheeseTopping + 1.5 * numPepperoniTopping;
        } else {
            return 14 + 1 * numCheeseTopping + 1.5 * numPepperoniTopping;
        }
    }

    public String toString() {
        String result = "Your order is " + size + " size with " + numCheeseTopping + " cheese toppings and "
                + numPepperoniTopping + " pepperoni toppings pizza and your total cost is $"+calcCost();

        return result;
    }

}








