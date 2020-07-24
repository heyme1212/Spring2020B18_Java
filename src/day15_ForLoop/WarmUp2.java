package day15_ForLoop;

import java.util.Scanner;

public class WarmUp2 {
    /*
    2. Given :
			username: cybertek.batch17@gmail.com
			password: JavaBeauties
			write a program for the login functionality of the email.
				- username can be either in uppercase or lowercase
				- Password MUST be as it's
				- if the user name does not end with "@gmail.com":
						print "it's not a valid email"
				- if the username ends with "@gmail.com" but username or password does not match:
						print "invalid username or password
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String givenUserName= "cybertek.batch17@gmail.com";
        String givenPassword= "JavaBeauties";

        System.out.println("Enter your username");
        String username=input.nextLine();

        System.out.println("Enter your password");
        String password=input.next();

        boolean bool1=password.equals(givenPassword);
        boolean bool2=username.equalsIgnoreCase(givenUserName);

        if(username.endsWith("@gmail.com")){
            if(!bool1 ||!bool2){
                System.out.println("Invalid username or password");
            }else{
                System.out.println("valid username and password");
            }

        }else{
            System.out.println("It is not a valid email");
        }











    }
}
