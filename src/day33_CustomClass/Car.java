package day33_CustomClass;

public class Car {
    //Attributes
    String Brand;
    String model;
    int year;
    String color;

    //Action1
    public void start(){
        System.out.println(Brand+" is started");
    }

    //Action2
    public void drive(){
        System.out.println("Driving "+ Brand+" "+model);
    }
    //Action3
    public void getCarInfo(){
        System.out.println(year+" "+Brand+" "+model+" "+color);

    }
    //Action4
    public void setCarInfo(String carBrand, String carModel, int carYear, String carColor){
        Brand=carBrand;
        model=carModel;
        year=carYear;
        color=carColor;
    }

    //Action5 in order to print out ......
    public String toString(){
        String result=Brand+" "+year+" "+model+" "+color;
        return result;
    }











    public static void main(String[] args) {
        int a=100; //a is a local variable.
        //Variables that are decleared within the block. Cant used outside of the block.

        //Instance variables are defined outside of the blocks or methods

    }
}
