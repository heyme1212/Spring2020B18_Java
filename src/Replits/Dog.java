package Replits;

public class Dog {
    String name;
    int age;

    public void setInfo(String name, int age){
        this.name=name;
        this.age=age;
    }

}
class Test{

    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.setInfo("L",4);
        System.out.println(obj.name+obj.age);
    }

}