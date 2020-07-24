package day17_WhileLoop_04062020;

import java.util.Scanner;

public class Credentials {
    /*
    user: cybertek
    pass:cybertek123
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username");
        String username=input.next();

        System.out.println("Enter your password");
        String password=input.next();

        while(!(username.equals("cybertek") && password.equals("cybertek123"))){
            System.out.println("Please re-enter your credentials");
            System.out.println("Enter your username");
            username=input.next();
            System.out.println("Enter your password");
            password=input.next();
        }

        System.out.println("Logged in");











    }




}
