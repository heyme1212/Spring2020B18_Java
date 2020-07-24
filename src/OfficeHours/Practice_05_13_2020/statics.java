package OfficeHours.Practice_05_13_2020;
public class statics {
    int instanceVariable=100;
    static int staticVariable=200;

    public static void staticMethod(){
        //instanceMethod();                       static method doesn't accept instance method
        //System.out.println(instanceVariable);   static method doesn't accept instance variable
        System.out.println(staticVariable);     //static method ACCEPTS static variable
    }

    public void instanceMethod(){
        staticMethod();                           //instance method accepts static method
        System.out.println(staticVariable);       //instance method accepts static variable
        System.out.println(instanceVariable);     //instance method accepts instance variable
    }

    public static void main(String[] args) {
        staticMethod();
       // instanceMethod();
        System.out.println(staticVariable);
      //  System.out.println(instanceVariable);

    }
}
