package day34_CustomClass;

public class Carpet {
/*
2. create a custom class for the carpet class that should contain the following:
instance variables:
        width, length, unitPrice, isPersian (boolean)
instance methods:
        customOrder(): sets the carpet' width, length, unitprice, & isParsian
        calcCost(): should be able to caculate the total cost of the carpet and return it as double
        toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
total price of carpet= (width+length)*unitprice
if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
 */
double width;
double length;
double unitPrice;
boolean isPersian;

public void customOrder(double carpetWidth, double carpetLength, double unitCost, boolean persian){
    width=carpetWidth;
    length=carpetLength;
    unitPrice=unitCost;
    isPersian=persian;
}

public double calcCost(){
    if(isPersian){
        return (width+length)*unitPrice+200;
    }else{
        return (width+length)*unitPrice;
    }

}
/*
public double calcCost(){
    double total=(width+length)*unitPrice;
    //return (isPersian)? total+200 :total;
    if(isPersian){
        return total+200;
    }else{
        return total;
    }
}

*/
public String toString(){
    if(isPersian){
        return "The Persian carpet's width is "+width+", length is "+length+" with the total cost of $"+calcCost();
    }else{
        return "The non-Persian carpet's width is "+width+", length is "+length+" with the total cost of $"+calcCost();
    }
}

/*
public String toString(){
        return "width: "+width+
                "\nlength: "+length+
                "\nunit price $"+unitPrice+
                "\ncosts $"+calcCost();
    }
 */





}
