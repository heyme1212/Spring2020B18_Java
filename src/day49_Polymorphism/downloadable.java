package day49_Polymorphism;
/*
Task02:
	1. create an interface named downloadable:
			variable: boolean downloadable
			abstract method: download();

	1. create an interface named AndroidApps that can inherit from downloadable interface
			variable: AppStoreName

	2. create an interface named AppleApps that can inherit from downloadable interface
			variable: AppStoreName

	3. create an abstract class named Phone
			variables: brand, model, price, size
			abstract methods: texting(), calling()

	4. create a class named iPhone that can inherit from AppleApps interface
			actions that every iphone can do: texting(), calling(), faceTiming(), selfie()

	5. create a class named Nokia that can inherit from AndroidApps interface
			actions that Nokia can do: texting(), calling(), freezing(), breakTheFloor()

	in each sub classes of phone, create a constructor to initialize the instances
 */
public interface downloadable {
    public static final boolean downloadable=true;
    void download();
}

interface AndroidApps extends downloadable {
    String AppStoreName="AndroidStore";
}

interface AppleApps extends downloadable {
    String AppStoreName="AppleStore";
}

abstract class phone{
     public static String brand;
     public String model;
     public double price;
     public String size;

    public abstract void texting();
    public abstract void  calling();
}

final class iphone extends phone implements AppleApps{
    static{
        brand="Apple";
    }

    public iphone(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }

    @Override
    public void texting() {
        System.out.println("You can text with iphone");
    }

    @Override
    public void calling() {
        System.out.println("You can make a call with iphone");
    }

    public void  faceTiming(){
        System.out.println("You can do facetiming");
    }
    public void selfie(){
        System.out.println("You can take a selfie with iphone");
    }
    @Override
    public void download() {
        System.out.println("iphone is downloading from "+AppStoreName);
    }

    @Override
    public String toString() {
        return "Brand: "+brand+", Model:"+model+", Size: "+size+", Price:$"+price;
    }
}

class Nokia extends phone implements AndroidApps{
    static{
        brand="Nokia";
    }

    public Nokia(String model, double price, String size){
        this.model=model;
        this.price=price;
        this.size=size;
    }
    public void texting(){
        System.out.println("You can text with Nokia");
    }
    public void calling(){
        System.out.println("You can make a call with Nokia");
    }
    public void freezing(){
        System.out.println("Nokia is freezing while texting");
    }
    public void breakTheFloor(){
        System.out.println("You can break the floor with Nokia :) ");
    }
    @Override
    public void download() {
        System.out.println("You cant download from "+AppStoreName);
    }

    @Override
    public String toString() {
        return "Brand: "+brand+", Model:"+model+", Size: "+size+", Price:$"+price;
    }
}


