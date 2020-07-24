package day12_JavaRecap_Scanner;
import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in); // enter
        System.out.println("Enter some number:");
        int num =input.nextInt();

        input.nextLine(); //this is for the take out the enter, that's why I dont need to assign it.
        System.out.println("Enter your name: ");
        String name= input.nextLine();







    }


}
