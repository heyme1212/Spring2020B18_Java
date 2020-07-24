package day48_Abstract_Interface;

public abstract class Phone {
    /*
    1. create an abstract class called Phone
			attributes: brand, model, price, size
			abstract methods: calling(), texting()
			instance method: toString()
     */

    public static String brand;
    public String model;
    public double price;
    public String size;

    public abstract void calling(String phoneNumber);
    public abstract void texting(String phoneNumber);

    public String toString(){
        return "Brand: "+brand+", Model:"+model+", Size: "+size+", Price:$"+price;
    }


}
