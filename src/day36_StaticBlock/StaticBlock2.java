package day36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock2 {

    static int a;
    static int b;
    //static only excepts static.


    static Tester tester1= new Tester();
    //assigned the static variable in the main method.


    public static void main(String[] args) {
        tester1.setInfo("Jean","SDET",120000,123);
        System.out.println(tester1);
    }
    //as soon as class is loaded, static block is ready to execute.

    static{
        a=100;
        b=200;
       // c=300; static only excepts static. This is not a static so compile error verdi.
    if(100>200){
        a=100;
    }else{
        b=200;
    }

        tester1.setInfo("Jean", "SDET", 120000, 123);


    }







}
