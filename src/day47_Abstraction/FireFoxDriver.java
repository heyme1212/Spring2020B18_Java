package day47_Abstraction;

public class FireFoxDriver extends RemoteWebDriver {

    public void get(String URL){
        System.out.println("Opening "+URL+" in firefox browser.");
    }

    public void quit(){
        System.out.println("Closing the firefox");
    }

    /*
     public void get(int a){
         System.out.println(a);
     }
*/
    //we can create any other regular method in sub class.
}
