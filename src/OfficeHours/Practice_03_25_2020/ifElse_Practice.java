package OfficeHours.Practice_03_25_2020;

public class ifElse_Practice {
    public static void main(String[] args) {
        int num=200;
        if(num%2 !=0){
            System.out.println(num+ " is odd number");
        }

        else{
            System.out.println(num+ " is even number");
        }


        int age =18;
        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You are not eligible");
        }


        boolean genderMale= true;
        if(genderMale){
            System.out.println("Gender is male");
        }else{
            System.out.println("Gender is female");
        }


        boolean usCitizen = true;
        int AgeofPerson=30;

        if(usCitizen == true && AgeofPerson>=18 ){
            System.out.println("You are eligible to vote");
        } else{
            System.out.println("Not eligible to vote");
        }




    }
}
