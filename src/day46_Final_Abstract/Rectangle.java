package day46_Final_Abstract;

public class Rectangle extends Shape {
   double width;
   double length;

   public Rectangle(double width, double length){
       this.width=width;
       this.length=length;
   }

   @Override
   public void Area(){
       double area=width*length;
       System.out.println("Area of rectangle is "+area);
   }
}
