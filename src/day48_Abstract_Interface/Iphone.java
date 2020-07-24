package day48_Abstract_Interface;

public class Iphone extends Phone {
    static{
        brand="iphone";
    }

    public Iphone(String model,String size,double price){
        // brand="iphone"; boyle de tanimlayabilirdik ama boyle yapinca her seferinde yazacak, not efficient.
        //good way is to decleare it in static block.
        this.model=model;
        this.size=size;
        this.price=price;
    }

    public void faceTiming(String phoneNumber){
        System.out.println("Iphone is facetiming "+phoneNumber);
    }

    @Override
    public void texting(String phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void calling(String phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }
}
