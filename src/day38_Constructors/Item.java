package day38_Constructors;

public class Item {
    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity){
        this.name=name;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString(){
        return "Item Name: "+name+" Unit Price is: $"+unitPrice+" Quantity: "+quantity+" Total Cost is: $"+calcCost();
    }
}