package day14_StringClass2;

public class Practice {
    public static void main(String[] args) {
        String gmail= "cybertekschool@gmail.com";
        String userInputGmail= "CybertekGmailSchool@Gmail.com";

        boolean result= gmail.equalsIgnoreCase(userInputGmail); //true
        System.out.println(result);

        if(result){
            System.out.println("Logged in");
        }else{
            System.out.println("Not logged in");
        }

        /*
        valid password Must contain a special character such as (!, $, _ )
        valid password shouldnt contain space.
         */
        String Password="mmasd 12345";

        if(Password.contains(" ")){
            System.out.println("Password doesn't have space in it");
        }else{
            System.out.println("Valid password");
        }

        /*
        every website has www. at the beginning of the web address.
         */

        String webAddress="www.amazon.com";
        if(webAddress.startsWith("www.")){
            System.out.println("valid");
        }

        /*

        String webAddress = "Www.amazon.com";
               webAddress = webAddress.toLowerCase();

        if( webAddress.startsWith("www.") ){
                    // false
            System.out.println("valid");

        }


         */

        System.out.println("=========================");

        /*
        every gmail email address ends with @gmail.com
         */

        String email= "CybertekSchool@Yahoo.com";
        if(email.endsWith("@gmail.com")){
            System.out.println("Valid gmail address");
        }else{
            System.out.println("Invalid gmail address");
        }







    }
}
