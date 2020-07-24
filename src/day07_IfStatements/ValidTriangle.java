package day07_IfStatements;

public class ValidTriangle {
    /*
    1. A triangle is valid if the sum of all the three angles is equal to 180 degrees. Write a program that declares
    three integers as angles and check whether a triangle is valid or not.

     */

    public static void main(String[] args) {
        double angle1 = 30;
        double angle2 = 50;
        double angle3 = 100;

        short sumofAngles= (short)(angle1+angle2+angle3);

        boolean validTriangle = sumofAngles ==180;

        if(validTriangle){
            System.out.println("The Shape is a Triangle");
        }

        if(!validTriangle){
            System.out.println("The Shape is not  a valid Triangle");
        }




    }


}
