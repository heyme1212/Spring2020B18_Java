package day46_Final_Abstract;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height){
        this.base=base;
        this.height=height;
    }

    public void Area(){
        double area=base*height*1/2;
        System.out.println("Area of Triangle is "+area);
    }

}
