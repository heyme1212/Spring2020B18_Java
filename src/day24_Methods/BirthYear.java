package day24_Methods;

public class BirthYear {
    public static void Age(short birthyear){
        int currentyear=2020;
        int age=currentyear-birthyear;
        if (age>0 && birthyear>1900) {
            System.out.println(age);
        }else{
            System.out.println("Invalid year");
        }
    }

    public static void main(String[] args) {
     //   Age((short)2000);
        printHello();
        printCybertek();




    }



  public static void printHello () {
        System.out.println("Hello");
    }

    public static void printCybertek (){
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek (){
        printHello();
        printCybertek();
    }



















}
