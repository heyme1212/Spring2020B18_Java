package day51_Recap;

/*
4. create a final class named circle that can inherit from Shape and PI
                variable: radius
                set a static block that initialize the name to "Circle"
                set a constructor that can initialize the radius
                Area of Circle = PI * radius * radius
                Perimeter of Circle = 2 * radius * PI
 */
public final class Circle extends Shape implements PI {
    double radius;


    public Circle(double radius){
        this.radius=radius;
        name="Circle";
    }

    @Override
    double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * radius * PI;
    }
}
