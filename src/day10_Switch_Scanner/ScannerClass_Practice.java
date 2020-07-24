package day10_Switch_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ScannerClass_Practice{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
          short num1=input.nextShort();
        System.out.println("Enter your second number");
        short num2=input.nextShort();
        //int total=(num1+num2);
        //System.out.println("sum of those two numbers are:"+ total);
        System.out.println("Sum of "+num1+ " and " + num2+ " is " + (num1+num2));




    }


}




