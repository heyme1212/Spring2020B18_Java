package day47_Abstraction;

public final class ChromeDriver extends RemoteWebDriver {
     //We have to create override method.

    @Override
    public void get(String URL){
        System.out.println("Opening "+URL+" in chrome browser.");
    }

    @Override
    public void quit(){
        System.out.println("Closing the chrome");
    }


}
