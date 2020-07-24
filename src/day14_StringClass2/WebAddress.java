package day14_StringClass2;

public class WebAddress {
    public static void main(String[] args) {
        /*
        write a program to validate a web address.
        Web address must start with www.
                         ends with .com or .edu or .net or .gov

         */

        String website="www.cybertek.com";
        website=website.toLowerCase();

        boolean validEnding= website.endsWith(".com") || website.endsWith(".gov")||website.endsWith(".gov");
        if(website.startsWith("www.") && validEnding){
            System.out.println("Valid web address");
        }else{
            System.out.println("Invalid web address");
        }












    }}


