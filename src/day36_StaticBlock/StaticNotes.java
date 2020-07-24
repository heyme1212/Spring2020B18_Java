package day36_StaticBlock;

public class StaticNotes {
    /*
    package day36_StaticBlock;
import OfficeHours.Practice_05_06_2020.Tester;
public class class07_StaticBlock_4 {
    static String name;
    static Tester tester1 = new Tester();
    // instance variable
    int insVariable;
    static {    //static block ==> designed for statics only
        // static block gets executed as soon as class starts
        // static block is designed to initialize static variables (created in class) like this:
        name = "Cybertek";
        tester1.setInfo("reem", "SDET",120000,123);
        // static block executes from top to bottom
        tester1.setInfo("John","SDD", 100000, 1345);
        // to call instance variable into static block ==> I have to create an object first ==> then call my instance variable
     //   class07_StaticBlock_4 obj1 = new class07_StaticBlock_4();
       // obj1.insVariable = 300;  // DO NOT  use static block for initializing instance variables
    }
    // if I have a main method like this:
    public static void main(String[] args) {
        // and I have a print statement:
        System.out.println(name);
        // since static block gets executed first
        // and since we initialized the value of name in the static block
        // when we request to print name here ==> it will print the value we initialized in the static block
        // if we dont' initialize this value in the static block ==> it will print null here
        // we can still initialize the value of name in the class (above) once we created our static variable
        // But if we want to create a static variable and then set information for our variable (like what we did with tester1, or developer)
        // ==> we can not do two steps in class : like creating a variable + initializing info of variable in two steps
        // ==> better to do in static block
        // here I will create another object from this class to use my instance variable insVariable:
        class07_StaticBlock_4 obj2 = new class07_StaticBlock_4();
        System.out.println(obj2.insVariable); // 0 default value
    }
}
package day35_Static;
public class class07_staticPractice_2 {
    // If method is going to use an instance variable ==> Do not use static method ==> you may use instance method
    // If method is not going to use instance variables ==> you may use static method
    String brand;
    String Model;
    // I want to create a method that will print me the brand of the car
    // if I create a static method, I will not be able to use my instance variable brand in the print method
    // But if I create an instance method ==> I can pass model in the print method
    // I will declare this boolean variable hasWheels as static:
    static boolean hasWheels = true;
   // this method is using instance variable brand ==> instance method not static method
    public void printBrand(){
        System.out.println(brand);
    }
    // this method is using instance variable brand ==> instance method not static method
    public void printModel(){
        System.out.println(Model);
    }
    // this method is not using instance variable brand ==> I can use static
    public static void main(String[] args) {
        System.out.println(hasWheels);
    }
}
     */
}
