package day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {
        new Person("Zarina");
        Person Zarina=new Person("Zarina");  //->we make it reusable
        System.out.println(Zarina.name);
        //System.out.println(Zarina.SSN); private, compile error

        Zarina.setSSN(123456);
        System.out.println("Zarina's SSN "+Zarina.getSSN());

        //System.out.println(Zarina.ID);

        Zarina.setID(12340);
        System.out.println(Zarina.getID());







    }


}
