package day49_Polymorphism;

public class PhoneObjects {
    public static void main(String[] args) {
        iphone phone1= new iphone("X",1000,"small");
        System.out.println(phone1);
        phone1.download();
        phone1.calling();
        phone1.texting();
        phone1.faceTiming();

    }
}
