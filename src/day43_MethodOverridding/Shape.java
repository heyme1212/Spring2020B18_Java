package day43_MethodOverridding;

public class Shape {
    public double area;
    public double perimeter;

    public void calculateArea(){
        area=0;
        System.out.println("Area of the shape is "+area);
    }

    public void calculatePerimeter(){
        perimeter=0;
        System.out.println("Perimeter of the shape: "+perimeter);
    }

}
