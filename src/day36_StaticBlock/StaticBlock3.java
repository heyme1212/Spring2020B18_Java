package day36_StaticBlock;


import day34_CustomClass.Tester;

public class StaticBlock3 {

    static String name;
    static int num;
    static Tester tester1;

    //first we initialize them in the main method
    //only compile in this class, outside of this class it is not working, cagirsak null oluyor.
    //That's why we initialize in static blockta. Cunku as soon as class is loaded it is done.


    static{
        name = "Muhtar";
        num = 100;
        tester1 = new Tester();
        tester1.setTesterInfo("Jean",123,"SDET", 12000);
    }

/*
    public static void main(String[] args) {
        name = "Muhtar";
        num = 200;
        System.out.println(name);
        System.out.println(num);
    }
 */

}
