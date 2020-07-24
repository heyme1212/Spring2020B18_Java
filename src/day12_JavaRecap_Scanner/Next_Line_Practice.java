package day12_JavaRecap_Scanner;
import java.util.Scanner;
public class Next_Line_Practice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        // 7921 JonesBranch Dr, McLean VA, 22034

        //fullAddress: BuildingNumber Street City state zip code

        System.out.println("Enter your building number: ");
        int Bnumber= input.nextInt();//7925+Enter (to assign it bunu yaparim)
        // int 7925 kismini alir, geride enter kalir hafizada.

        System.out.println("Building number is: "+Bnumber);
        System.out.println("Enter your street name:");

        input.nextLine(); // used for taking out Enter
        String street=input.nextLine();
        System.out.println("Street: "+street);

        System.out.println("Enter the zip code: ");
        int zipCode= input.nextInt(); //22034+Enter'e basarim

        input.nextLine(); // used for taking out Enter
        System.out.println("Enter the city name and state:");
        String cityState= input.nextLine();

        String fullAdress=(Bnumber+" "+street+", \n"+cityState+" "+zipCode);

        System.out.println(fullAdress);

        input.close();














    }

}
