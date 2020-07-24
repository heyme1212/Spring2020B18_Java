package day38_Constructors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Circle {
    double radius;
    static double pi;
    double diameter;

    static{
        pi=3.14;
    }

    public Circle(double radius){
        this.radius=radius;
        diameter=radius*2;
    }

    public double area(){
        return radius*radius*pi;
    }

    public double perimeter(){
        return diameter*pi;
    }

    public String toString(){
        return "Radius of the circle: "+radius+"\nArea is: "+area();
    }
}

class CircleObjects{
    public static void main(String[] args) {
        DecimalFormat df= new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        double r = scan.nextDouble() ;

        Circle circle1 = new Circle(r);

        double areaOfCircle = circle1.area();
        System.out.println("Diameter is: "+ circle1.diameter);
        System.out.println("Perimeter is: "+ circle1.perimeter());
        System.out.println("Area is: " + df.format(areaOfCircle));

    }
}
