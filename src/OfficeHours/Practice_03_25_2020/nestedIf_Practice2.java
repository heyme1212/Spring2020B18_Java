package OfficeHours.Practice_03_25_2020;

public class nestedIf_Practice2 {
    public static void main(String[] args) {
        int salary= 45000;
        short creditscore = 750;
        byte jobHistory= 1;

        if(salary>50000){
            if(creditscore>6500){
                System.out.println("You are eligible");
                if(jobHistory>=2){

                }else{
                    System.out.println("You don't have enough job history");
                }

            }else{
                System.out.println("You are not eligible due to credit score");
            }


        }else{
            System.out.println("You need to have a job that pays $50000");
        }



    }
}
