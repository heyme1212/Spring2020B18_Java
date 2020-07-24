package day51_Recap;
/*
Warmup tasks:
    1. create an abstract class named Shape
            variables: name(static)
            abstract methods: calculateArea(), calculatePerimeter();
                    both methods return double
 */
public abstract class Shape {

    public String name;
    abstract double calculateArea();
    abstract double calculatePerimeter();

}

/*
2. create an interface named Volume
            variable: boolean hasVolume
            abstract method: calculateVolume() ==> returns double
 */
interface Volume {
    boolean hasVolume=true;

    double calculateVolume();
}

/*
3. create an interface named PI
variable: PI
(created Volume & PI within same Java file)
 */

interface PI{
    public static double PI=3.14;

}

