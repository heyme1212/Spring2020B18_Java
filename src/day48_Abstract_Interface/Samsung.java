package day48_Abstract_Interface;

public class Samsung extends Phone {
    static{
        brand="Samsung";
    }
    public Samsung(String model,String size, double price){
            this.model=model;
            this.size=size;
            this.price=price;
    }

    @Override
    public void calling(String phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void texting(String phoneNumber) {
        System.out.println("Samsung is texting "+phoneNumber);

    }

    public void freezing(){
        System.out.println("Samsung is freezing");
    }
}
