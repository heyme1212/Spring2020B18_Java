package Replits.Replit_04112020;
import java.util.Scanner;
public class Party_Guest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name= input.next();
        String guestList=name;

        while(true){
            System.out.println("Do you want to enter new guest name:");
            String answer=input.next();

            if(answer.equalsIgnoreCase("yes")){
                System.out.println("Please enter guest name:");
                name=input.next();
                guestList+=", "+name;
            }else if(answer.equalsIgnoreCase("no")) {
                System.out.println("Guest's list: " + guestList);
                break;
            }else{
                System.out.println("Please answer yes or no!!");
            }







        }
















    }

}
