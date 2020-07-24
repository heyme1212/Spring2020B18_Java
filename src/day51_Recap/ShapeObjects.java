package day51_Recap;
/*
 6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
 */
import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1= new Circle(3);
        Circle circle2= new Circle(5);

        Cylinder cylinder1= new Cylinder(3,5);
        Cylinder cylinder2= new Cylinder(3,5);

        ArrayList<Shape> shapeList= new ArrayList<>();
        shapeList.addAll(Arrays.asList(circle1,circle2,cylinder1,cylinder2));

        for(Shape eachShape : shapeList ){
            System.out.println( eachShape.name +" : " + eachShape.calculateArea() );
        }


        System.out.println("======================");
        //list.get(2).calculateVolume();  // reference type is Shape, shape does not have the method
        double d = ( (Cylinder) shapeList.get(3) ).calculateVolume();
        System.out.println(d);

        // ((Cylinder)list.get(1)).calculateVolume();  //is A relation is precondition of Reference castings
        // circle cannot be referenced by cylinder

        Shape s1 = new Circle(6);
        //  System.out.println( s1.radius );
        //Shape doesnt have radius variable. Reference type decides what is accessible.
        System.out.println( ( (Circle) s1 ).radius ) ;


/*
       // Shape shape1 = circle1; // upcasting
        Shape shape2 = new Cylinder(3,6);
       // shape2.calculateVolume();
        (  (Cylinder)shape2 ).calculateVolume();  // down casting
 */





    }
}
