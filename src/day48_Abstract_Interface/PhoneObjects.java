package day48_Abstract_Interface;

public class PhoneObjects {
    public static void main(String[] args) {
       Iphone iphone1= new Iphone("X","10 inches",1000);
       Iphone iphone2= new Iphone("9","10 inches",900);

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming("1234567");
        iphone1.calling("911");
        iphone1.texting("458795");
       // iphone1.freezing("12345"); this method doesnt belong to iphone, compile error verdi

        Samsung samsung= new Samsung("Note10 Plus", "Large", 1200);
        System.out.println(samsung);
        //samsung.facetiming(123456); this method doesn't belong to Samsung
        samsung.freezing();
        samsung.calling("123");
        samsung.texting("123");



    }
}
