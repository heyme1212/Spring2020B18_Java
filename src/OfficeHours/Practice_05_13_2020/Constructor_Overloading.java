package OfficeHours.Practice_05_13_2020;

public class Constructor_Overloading {

    public Constructor_Overloading(){
        System.out.println("default constructor");
    }

    public Constructor_Overloading(int a){
        System.out.println("constructor with int");
    }

    public Constructor_Overloading(int a, double b){
        System.out.println("constructor with int and double");
    }

    public static void main(String[] args) {
        Constructor_Overloading obj= new Constructor_Overloading();
        Constructor_Overloading obj1= new Constructor_Overloading(10);
        Constructor_Overloading obj2= new Constructor_Overloading(10, 10.5);

    }

}
