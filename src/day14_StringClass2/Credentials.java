package day14_StringClass2;

import java.util.Scanner;

public class Credentials {

     /*
        userName: cybertek
        passWord: cybertekschool

        PLease verify there username and password.
         */

    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        String validUserName= "cybertek";
        String validPassword="cybertekschool";

        System.out.println("Please enter your username");
        String userName= input.next();

        System.out.println("Please enter your password");
        String password=input.next();

        //boolean validCredentials= userName.equals(validUserName) && password.equals(validPassword);

        if(userName.equals(validUserName) && password.equals(validPassword)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid Credentials");
        }









    }
}
