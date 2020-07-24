package day46_Final_Abstract;

public final class Circle extends Shape {
    //final'i ekledik cunku bu islem sadece circle 'e ozel
    //no one can inherit it.

    public double radius;
    public final static double PI=3.14;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    //public protected default verebiliriz.
    public void Area(){
       double area=radius*radius*PI;
        System.out.println("Area is of circle is "+area);
    }



}
