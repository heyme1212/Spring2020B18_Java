package Replits.Replit_04142020;
import java.util.Scanner;
public class CarMOdel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;

    if(model=="Extravagant"){
        if(year>=2010 && year<=2012){
            System.out.println("!recalled");
        }
    }
    if(model=="Guzzler"){
        if(year>=2015 && year<=2018){
            System.out.println("!recalled");
        }
    }

}
}