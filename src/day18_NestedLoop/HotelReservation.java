package day18_NestedLoop;

import java.util.Scanner;

public class HotelReservation {
    /*
    Assignment:
    write a program for the room reservation:
    King Bed ==> 120$
    Queen Bed ==> 100$
    single Bed ==> 80$
    should ask which bedroom do you wanna reserve
                    if user provided invalid entry => please re-enter
    calculate the total price
                do you want to reserve another room:
            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            if answer either yes or no ==> please re-enter
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int roomPrice=0;
        int numOfDays= 0;
        int cost=0;

        while(true){
            System.out.println("Please select your room:");
            String roomType=scan.next();

            while(!(roomType.equalsIgnoreCase("King") || roomType.equalsIgnoreCase("Queen") || roomType.equalsIgnoreCase("Single"))){
                System.out.println("Please re-enter your selection of room:");
                roomType=scan.next();
            }

            if(roomType.equalsIgnoreCase("King")){
                roomPrice=120;
            }else if(roomType.equalsIgnoreCase("Queen")){
                roomPrice=100;
            }else if(roomType.equalsIgnoreCase("Single")){
                roomPrice=80;
            }

            System.out.println("Please select how many days you want to stay:");
            numOfDays= scan.nextInt();
            cost+=numOfDays*roomPrice;

            System.out.println("Your cost is $"+cost);

            System.out.println("Do you want to reserve another room?");
            String answer=scan.next();

            while(!(answer.equalsIgnoreCase("yes")|| answer.equalsIgnoreCase("no"))){
                System.out.println("Please re-enter your answer, please say yes or no!");
                answer=scan.next();
            }

            if(answer.equalsIgnoreCase("no")){
                System.out.println("Thank you for your reservation, your total is $"+cost);
                break;
            }
        }


    }


}




