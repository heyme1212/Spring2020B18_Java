package Replits.Replit_05152020;

public class Pizza {
    /*
Create a class named Pizza that stores information about a single pizza.
It should contain the following:
Private instance variables to store the size of the pizza (either small, medium, or large), the number of cheese toppings,
the number of pepperoni toppings, and the number of ham toppings.
Constructor(s) that set all of the instance variables.
Public methods to get and set the instance variables.
A public method named calcCost( ) that returns a double that is the cost of the pizza.
Pizza cost is determined by:
Small: $10 + $2 per topping
Medium: $12 + $2 per topping
Large: $14 + $2 per topping
A public method named getDescription() that returns a String containing the pizza size, quantity of each topping,
and the pizza cost as calculated by calcCost().
getDescription() example:
large Pizza with 0 Cheese toppings, 0 Pepperoni toppings, and 2 Ham toppings.
Total Price: 18.0
     */
private String size;
private int numOfCheese;
private int numOfPepperoni;
private int numOfHam;

    public Pizza(String size, int numOfCheese, int numOfPepperoni, int numOfHam){
        this.size=size;
        this.numOfCheese=numOfCheese;
        this.numOfPepperoni=numOfPepperoni;
        this.numOfHam=numOfHam;
    }

    public void setSize(String size){

        this.size=size;
    }
    public void setCheese(int numOfCheese){

        this.numOfCheese=numOfCheese;
    }
    public void setPepperoni(int numOfPepperoni){
        this.numOfPepperoni=numOfPepperoni;
    }
    public void setHam(int numOfHam){

        this.numOfHam=numOfHam;
    }

    public String getSize(){

        return size;
    }
    public int getCheese(){

        return numOfCheese;
    }
    public int getPepperoni(){

        return numOfPepperoni;
    }
    public int getHam(){

        return numOfHam;
    }

    public double calcCost( ){
    if(size.equalsIgnoreCase("small")){
        return 10+2*(numOfCheese+numOfPepperoni+numOfHam);
    }else if(size.equalsIgnoreCase("medium")){
        return 12+2*(numOfCheese+numOfPepperoni+numOfHam);
    }else{
        return 14+2*(numOfCheese+numOfPepperoni+numOfHam);
    }
}
    public String getDescription(){
        return size+" Pizza with "+numOfCheese+" Cheese toppings, "+numOfPepperoni+" Pepperoni toppings, and "+numOfHam+" Ham toppings."+"\nTotal Price: "+calcCost();
    }




}
