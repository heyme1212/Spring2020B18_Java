package OfficeHours.Practice_03_11_2020;

public class Practice_Variables {
    public static void main(String[] args){
        String brand = "BMW";
        System.out.println(brand);
        short year = 2020;
        float price = 50000.50f;
        String model = "X6";
        short maxmiles = 32767;

        System.out.println(9+10);// 19-> addition
        System.out.println("9"+10);// concatenation

/*
output should be:
The vehicle 2020 BMW X6, has 32767 miles, price is 50000.50 dollar.
 */

System.out.println("The vehicle "+ year +" "+ brand + " "+ model + ", has " + maxmiles + " miles " + "," + "price is " + price +" dollars");


    }

}
