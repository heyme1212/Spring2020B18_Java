package day38_Constructors;
public class Pizza {
    String size;
    int numofCheeseTop;
    int numofPepperoniop;

    public Pizza(String size, int numofCheeseTop, int numofPepperoniop){
        this.size=size;
        this.numofCheeseTop=numofCheeseTop;
        this.numofPepperoniop=numofPepperoniop;
    }

    public double calcCost(){
        if (size.equalsIgnoreCase("small")) {
            return 10 + 1 * numofCheeseTop + 1.5 * numofPepperoniop;
        } else if (size.equalsIgnoreCase("medium")) {
            return 12 + 1 * numofCheeseTop + 1.5 * numofPepperoniop;
        } else {
            return 14 + 1 * numofCheeseTop + 1.5 * numofPepperoniop;
        }
    }

    public String toString(){
        return "Size of the pizza is: "+size+" number of cheese topping is: "+numofCheeseTop
                +" number of pepporoni topping is: "+numofPepperoniop+" total cost is: $"+calcCost();
    }
}
