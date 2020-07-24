package OfficeHours.Practice_03_25_2020;

public class multiBranchIf_Practice {
    public static void main(String[] args) {
        int number=0;
        if(number>0){
            System.out.println("positive");
        }else if (number<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }


        int num1=100;
        int num2=200;

        if(num1>num2) {
            System.out.println(num1 + " is greater");
        }else if(num2>num1){
            System.out.println(num2+ " is greater");
        } else{
            System.out.println("They are equal");

        }


        String browserName= "Chrome";

        if(browserName=="Firefox"){
            System.out.println("Open Firefox");
        }else if(browserName=="Chrome"){
            System.out.println("Open Chrome");
        }else if(browserName=="Internet Explorer"){
            System.out.println("Open IE");
        }else if(browserName=="Safari"){
            System.out.println("Open Safari");
        }else if(browserName=="Opera") {
            System.out.println("Open Opera");
        }else {
            System.out.println("Invalid browser name");
        }



    }
}
