package OfficeHours.Practice_03_18_2020;

public class SingleIf_Practice2 {
    public static void main(String[] args) {

        byte age = 30;
        boolean eligibleTOBuy = age >= 21;
        if (age >= 21) {
            System.out.println("Here is your vodka");
        }
        if (age < 21) {
            System.out.println("Go drink your milk");
        }

        //if(eligibleTOBuy){
        //System.out.println("Here is your vodka"); }

        boolean feeling = true;
        if(feeling == false){
            System.out.println("dont be sad");
        }
        if(feeling == true){
            System.out.println("Stay Happy");
        }





    }
}
