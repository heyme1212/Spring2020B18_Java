package day11_Scanner;
import java.util.Scanner;
public class NextLine_Practice{

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the age");
        int age= input.nextInt(); //you press 30+ Enter
        System.out.println("Your age is "+ age);

        System.out.println("Enter your full name: ");
        String fullName= input.nextLine(); //it takes everything in the scanner
        System.out.println("Your full name is: "+fullName);







    }

}
