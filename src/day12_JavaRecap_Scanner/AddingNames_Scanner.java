package day12_JavaRecap_Scanner;
import java.util.Scanner;
public class AddingNames_Scanner {
    /*
     2. Ask user to enter two words. Then add them together and print.
                        Input:
                            one
                            eight
                        Output:
                            oneeight
     */
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your first word:");
        String firstword= scan.next();

        System.out.println("Enter your second word:");
        String secondword=scan.next();

        String firstandsecond = (firstword + secondword);
        System.out.println(firstandsecond);









    }







}



