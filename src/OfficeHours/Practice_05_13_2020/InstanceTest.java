package OfficeHours.Practice_05_13_2020;

public class InstanceTest {
    public static void main(String[] args) {
        Instances obj1=new Instances();
        obj1.name="Muhtar";

        Instances obj2=new Instances();
        obj2.name="Kuzzat";

        System.out.println(obj1.name); //Muhtar
        System.out.println(obj2.name); //null initizalize etmeden, then assigned to Kuzzat and now Kuzzat

        obj1.printName();  //Name is: Muhtar
        obj2.printName();  //Name is: Kuzzat
    }
}

class InstanceBlock{
    public static void main(String[] args) {
        Instances obj = new Instances();
        System.out.println(obj.name);

    }


}


