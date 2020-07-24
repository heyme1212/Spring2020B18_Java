package day46_Final_Abstract;

public abstract class Shape {
    /*
    public double radius;
    public final static double PI=3.14;
    */

    //Aslinda objectleri super class'a da yazabilirdik ama abstraction a ters bir durum, mantiksal bir hata olur.
    //Her shape radius'u kullanmiyor, generic degil.
    //Abstraction icin logical error olusturur.

    abstract void Area();
    //without body means without implementation, yani function.
    //abstraction a abstract method ile ulasabilirz. {} body remove edildi ve abstact eklendi method'a. Ancak yetmedi.
    // Two ways of achieving abstraction:
    //1.using abstract class   //class dan once abstract yazdik ve duzeldi.
    //2.using interface









}
