package OfficeHours.Practice_05_20_2020;

class Data{
    int a=100;

    public void method(){
        System.out.println("Hello World");
    }
}

public class SuperKeyword {
    int a=200;
    public void method(){
        System.out.println("hello Cybertek");
    }

    public SuperKeyword(){
        method();
    }

    public static void main(String[] args) {
        SuperKeyword obj=new SuperKeyword();
    }
}
