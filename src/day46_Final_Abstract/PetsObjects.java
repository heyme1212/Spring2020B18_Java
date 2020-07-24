package day46_Final_Abstract;

public class PetsObjects {
    public static void main(String[] args) {

        Dog obj=new Dog("Muffin",2,"White","Chow chow",'F');
        obj.sleep();
        obj.eat();
        obj.speak();
        System.out.println(obj);

        System.out.println("=========================");
        Cat obj2= new Cat("Coco",4, "Gray", "Scottish",'M');
        obj2.sleep();
        obj2.eat();
        obj2.speak();
        System.out.println(obj2);

        System.out.println("=========================");
        Tiger obj3= new Tiger("Bobo",5, "Orange", "Bengal",'M');
        obj3.sleep();
        obj3.eat();
        obj3.speak();
        System.out.println(obj3);
    }
}
