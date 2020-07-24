package day33_CustomClass;

public class carObjects {
    public static void main(String[] args) {

        Car car1= new Car();

        //System.out.println(car1.Brand); //null before we define
        //System.out.println(Brand); compile veriyor.

        car1.Brand="BMW";
        System.out.println(car1.Brand); // instance variables are object variables, we cna call them through the object name
        car1.model="X5";
        System.out.println(car1.model);
        car1.year=2020;
        System.out.println(car1.year);
        car1.color="red";
        System.out.println(car1.color);

        car1.start();
        car1.drive();
        car1.getCarInfo();

        System.out.println("+++++++++++++++++++");

        Car car2=new Car();
        car2.Brand="Toyota";
        car2.model="Corolla";
        car2.year=2020;
        car2.color="white";
        System.out.println(car2.Brand);
        System.out.println(car2.model);
        System.out.println(car2.year);

        car2.start();
        car2.drive();
        car2.getCarInfo();

        System.out.println("++++++++++++++++++++++++++++++++");

        Car car3=new Car();
        car3.Brand="Mercedes";
        car3.model="C Class";
        car3.year=2020;
        car3.color="Black";

        car3.getCarInfo();
        car3.start();
        car3.drive();

        System.out.println("++++++++++++++++++++++++++");

        String str="A";
        String str2="B";
        String [] arr={str, str2};

        Car[] cars={car1,car2,car3};
        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();










    }
}
