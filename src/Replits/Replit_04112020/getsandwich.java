package Replits.Replit_04112020;

import java.util.Scanner;

public class getsandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        int lastIndexOf= str.lastIndexOf("bread");
        int firstIndexOf=str.indexOf("bread");

        if(lastIndexOf-firstIndexOf>=5){
            System.out.println(str.substring((firstIndexOf+5),lastIndexOf));
        }else{
            System.out.println("nothing");
        }


    }
}
