package day47_Abstraction;

public class DriverObjects {
    public static void main(String[] args) {


        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");

        driver.quit();

        System.out.println("===============");
        FireFoxDriver driver2= new FireFoxDriver();
        driver2.get("https://www.firefox.com");
        driver2.quit();

        System.out.println("===============");
        OperaDriver driver3= new OperaDriver();
        driver3.get("https://www.opera.com");
        driver3.quit();








    }
}
