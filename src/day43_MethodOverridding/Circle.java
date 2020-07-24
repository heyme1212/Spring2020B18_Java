package day43_MethodOverridding;

public class Circle extends Shape {
    public double radius;
    public static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    /*
    calculuateArea&primeter
     */

    public void calculateArea(){
        area=radius*radius*PI;
        System.out.println("Area of the Cirle: "+area);
    }

    public void calculatePerimeter(){
        perimeter=2*PI*radius;
        System.out.println("Perimeter of the cirlce: "+perimeter);
    }



}
