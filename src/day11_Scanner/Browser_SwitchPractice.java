package day11_Scanner;

import java.sql.SQLOutput;

public class Browser_SwitchPractice {
    public static void main(String[] args) {
        /*
   write a program that can display the selected browser
 1. declear a String variable called browserName
 2. Assume that the valid browsers are: chrome, firefox, opera, safari.
 3. if the browser name does not match with the valid browsers' names,
 out put should be: Invalid Browser Name
   Note: Do Not use scanner or if statement or ternary for this task
         */

        String browsername="firefox";
        switch(browsername){

            case "firefox":
            case "Firefox":
                System.out.println("Firefox is opening...");
                break;

            case"chrome":
            case "Chrome":
                System.out.println("Chrome is opening...");
                break;

            case "Safari":
                System.out.println("Safari is opening...");
                break;
            case "Opera":
                System.out.println("Opera is opening...");
                break;

            default:
                System.out.println("Invalid browser name");
                break;



        }

























    }














}




